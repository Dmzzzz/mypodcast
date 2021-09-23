package ru.mypodcast.mypodcast.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotEmpty;

public class LoadPodcastRequest {

    /** название подкаста */
    private final String name;
    /** Язык программирования */
    private final String languageType;
    /** Тема подкаста */
    private final String topic;
    /** Длина записи подкаста */
    private final String podcastLength;
    /** Источник */
    private final String source;

    @JsonCreator
    public LoadPodcastRequest(@JsonProperty String name, @JsonProperty String languageType,
    @JsonProperty String topic, @JsonProperty String podcastLength,
                              @JsonProperty String source) {
        this.name = name;
        this.languageType = languageType;
        this.topic = topic;
        this.podcastLength = podcastLength;
        this.source = source;
    }

    public String getName() {
        return name;
    }

    public String getLanguageType() {
        return languageType;
    }

    public String getTopic() {
        return topic;
    }

    public String getPodcastLength() {
        return podcastLength;
    }

    public String getSource() {
        return source;
    }
}