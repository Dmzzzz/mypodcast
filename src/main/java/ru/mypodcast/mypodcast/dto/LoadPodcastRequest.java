package ru.mypodcast.mypodcast.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LoadPodcastRequest {

    /** название подкаста */
    private final String name;
    /** Язык программирования */
    private final String languageType;
    /** Тема подкаста */
    private final String topic;
    /** Длина записи подкаста */
    private final String podcast_length;
    /** Источник */
    private final String source;

    @JsonCreator
    public LoadPodcastRequest(@JsonProperty String name, @JsonProperty String languageType,
    @JsonProperty String topic, @JsonProperty String podcast_length,
                              @JsonProperty String source) {
        this.name = name;
        this.languageType = languageType;
        this.topic = topic;
        this.podcast_length = podcast_length;
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

    public String getPodcast_length() {
        return podcast_length;
    }

    public String getSource() {
        return source;
    }
}