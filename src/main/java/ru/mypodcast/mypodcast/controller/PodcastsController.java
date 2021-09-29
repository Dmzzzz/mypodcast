package ru.mypodcast.mypodcast.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.mypodcast.mypodcast.dto.BaseResponse;
import ru.mypodcast.mypodcast.dto.LoadPodcastRequest;
import ru.mypodcast.mypodcast.service.PodcastService;
import ru.mypodcast.mypodcast.service.ResponseErrorValidation;

import javax.validation.Valid;
import java.io.IOException;

@RestController
@RequestMapping("/podcasts")
public class PodcastsController {

    private final PodcastService podcastService;
    private final ResponseErrorValidation responseErrorValidation;

    public PodcastsController(PodcastService podcastService,
                              ResponseErrorValidation responseErrorValidation) {
        this.podcastService = podcastService;
        this.responseErrorValidation = responseErrorValidation;
    }

    @PostMapping(consumes = "application/json; odata=verbose")
    public ResponseEntity<BaseResponse<Long>> loadPodcast(@RequestBody @Validated LoadPodcastRequest request,
   @RequestParam("track") MultipartFile trackFile) throws IOException {

        byte[] bytes = trackFile.getBytes();
        final Long id = podcastService.uploadPodcast(request, bytes);

        return ResponseEntity.ok(new BaseResponse<>(id));

    }

    @PutMapping("/{id}/track")
    public ResponseEntity uploadTrack(@RequestParam("track") MultipartFile trackFile,
                                      @PathVariable("id") Long id) throws IOException {

        byte[] track = trackFile.getBytes();
            podcastService.uploadPodcastTrack( id, track);
            return ResponseEntity.ok().build();
    }

}
