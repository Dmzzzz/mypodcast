package ru.mypodcast.mypodcast.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "podcasts")
public class Podcast {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    /** Id подкаста будет задаваться попорядку добавления */
    private Long id;
    /** Имя подкаста */
    @Column(name = "name")
    private String name;
    /** Язык программирования */
    @Column(name = "language_type")
    private String languageType;
    /** Тема подкаста */
    @Column(name = "topic")
    private String topic;
    /** Источник */
   @Column(name = "source")
    private String source;
    /** Длина записи подкаста */
    @Column(name = "podcast_length")
    private String podcastLength;
    /** Дата загрузки */
    @CreationTimestamp
    @Column(name = "upload_date")
    private LocalDateTime uploadDate;

    public Podcast() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguageType() {
        return languageType;
    }

    public void setLanguageType(String languageType) {
        this.languageType = languageType;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getPodcastLength() {
        return podcastLength;
    }

    public void setPodcastLength(String podcastLength) {
        this.podcastLength = podcastLength;
    }

    public LocalDateTime getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(LocalDateTime uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
