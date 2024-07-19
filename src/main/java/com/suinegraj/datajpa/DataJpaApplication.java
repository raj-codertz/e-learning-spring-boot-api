package com.suinegraj.datajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataJpaApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner commandLineRunner(
//            AuthorRepository repository
//    ) {
//        return args -> {
//            var author = Author.builder()
//                    .firstName("rashid")
//                    .email("rajabushabani@gmail.com")
//                    .lastName("ally")
//                    .age(29)
//                    .build();
//            repository.save(author);
//        };
//    }

}
