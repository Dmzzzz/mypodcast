package ru.mypodcast.mypodcast.convertors;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;
import ru.mypodcast.mypodcast.dto.LoadPodcastRequest;
import ru.mypodcast.mypodcast.entity.Podcast;

@Service
public class LoadPodcastRequestToPodcastConverter implements Converter<LoadPodcastRequest, Podcast> {

    @Override
    public Podcast convert(LoadPodcastRequest source) {
        final Podcast podcast = new Podcast();
        podcast.setName(source.getName());
        podcast.setLanguageType(source.getLanguageType());
        podcast.setPodcastLength(source.getPodcastLength());
        podcast.setTopic(source.getTopic());
        podcast.setSource(source.getSource());
        return podcast;
    }

}