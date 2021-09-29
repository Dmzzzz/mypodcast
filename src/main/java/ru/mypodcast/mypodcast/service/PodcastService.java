package ru.mypodcast.mypodcast.service;

import ru.mypodcast.mypodcast.dto.LoadPodcastRequest;

public interface PodcastService {

    Long uploadPodcast(LoadPodcastRequest request, byte[] bytes);

    void uploadPodcastTrack(Long id, byte[] track);
}
