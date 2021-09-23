package ru.mypodcast.mypodcast.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mypodcast.mypodcast.dto.LoadPodcastRequest;
import ru.mypodcast.mypodcast.service.PodcastService;


@RestController
@RequestMapping("/podcasts")
public class PodcastsController {

    private final PodcastService podcastService;

    public PodcastsController(PodcastService podcastService) {
        this.podcastService = podcastService;
    }

    @PostMapping
    public ResponseEntity<Long> loadPodcast(@RequestBody LoadPodcastRequest request) {

        final Long id = podcastService.uploadPodcast(request);

        return ResponseEntity.ok(id);
    }

}
