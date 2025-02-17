package com.suinegraj.datajpa;

import com.suinegraj.datajpa.models.Video;
import com.suinegraj.datajpa.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DataJpaApplication {


    public static void main(String[] args) {
        SpringApplication.run(DataJpaApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(
            VideoRepository videoRepository
    ) {
        return _ -> {
             var video = Video.builder()
                     .name("abc")
                     .length(5)
                     .build();
                  videoRepository.save(video);
        };
    }

}
