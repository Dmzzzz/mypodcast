package ru.mypodcast.mypodcast.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mypodcast.mypodcast.entity.Podcast;

@Repository
public interface PodcastRepository extends JpaRepository<Podcast, Long> {

}
