package ru.mypodcast.mypodcast.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class LoadPodcastRequest {

    /** название подкаста */
    @NotEmpty(message = "поле не должно быть пустым")
    @Size(max = 128, message = "максимальная длина 128 символов")
    private final String name;
    /** Язык программирования */
    @NotEmpty(message = "поле не должно быть пустым")
    @Size(max = 128, message = "максимальная длина 128 символов")
    private final String languageType;
    /** Тема подкаста */
    @NotEmpty(message = "поле не должно быть пустым")
    @Size(max = 128, message = "максимальная длина 128 символов")
    private final String topic;
    /** Длина записи подкаста */
    @NotEmpty(message = "поле не должно быть пустым")
    @Size(max = 128, message = "максимальная длина 128 символов")
    private final String podcastLength;
    /** Источник */
    @NotEmpty(message = "поле не должно быть пустым")
    @Size(max = 128, message = "максимальная длина 128 символов")
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