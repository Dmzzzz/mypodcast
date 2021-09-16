package ru.mypodcast.mypodcast;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class MypodcastApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(MypodcastApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MypodcastApplication.class, args);

		LOGGER.info("Application is Starting");

	}

}
