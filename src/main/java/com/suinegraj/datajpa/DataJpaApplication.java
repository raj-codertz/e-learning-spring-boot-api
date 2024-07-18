package com.suinegraj.datajpa;

import com.suinegraj.datajpa.models.Author;
import com.suinegraj.datajpa.repositories.AuthorRepository;
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
            AuthorRepository repository
    ) {
        return args -> {
            var author = Author.builder()
                    .firstName("rashid")
                    .email("rajabushabani@gmail.com")
                    .lastName("ally")
                    .age(29)
                    .build();
            repository.save(author);
        };
    }

}
