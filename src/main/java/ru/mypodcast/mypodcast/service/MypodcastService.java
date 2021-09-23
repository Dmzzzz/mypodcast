package ru.mypodcast.mypodcast.service;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;
import ru.mypodcast.mypodcast.dto.LoadPodcastRequest;
import ru.mypodcast.mypodcast.entity.Podcast;
import ru.mypodcast.mypodcast.repository.PodcastRepository;

@Service
public class MypodcastService implements PodcastService {

    private final PodcastRepository podcastRepository;
    private final Converter<LoadPodcastRequest, Podcast> converter;


    public MypodcastService(PodcastRepository podcastRepository,
                            Converter<LoadPodcastRequest, Podcast> converter) {
        this.podcastRepository = podcastRepository;
        this.converter = converter;
    }

    @Override
    public Long uploadPodcast(LoadPodcastRequest request) {
        Podcast podcast = converter.convert(request);
        Podcast savedPodcast = podcastRepository.save(podcast);

        return savedPodcast.getId();
    }

}
