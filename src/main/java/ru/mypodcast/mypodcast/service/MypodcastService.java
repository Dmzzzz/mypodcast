package ru.mypodcast.mypodcast.service;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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
    public Long uploadPodcast(LoadPodcastRequest request, byte[] bytes) {
        Podcast podcast = converter.convert(request);
        podcast.setTrack(bytes);
        Podcast savedPodcast = podcastRepository.save(podcast);

        return savedPodcast.getId();
    }

    @Override
    @Transactional
    public void uploadPodcastTrack(Long id, byte[] track) {
        Podcast podcast = podcastRepository.getById(id);
        podcast.setTrack(track);

        podcastRepository.save(podcast);
    }
}
