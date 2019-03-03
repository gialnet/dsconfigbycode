package com.vivaldispring.dsconfigbycode;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DsconfigbycodeApplication {

    @Bean
    public CommandLineRunner run(UserRepository userRepository) throws Exception {
        return (String[] args) -> {
            Users user1 = new Users("John", "john@domain.com");
            Users user2 = new Users("Julie", "julie@domain.com");
            userRepository.save(user1);
            userRepository.save(user2);
            userRepository.findAll().forEach(user -> System.out.println(user));
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(DsconfigbycodeApplication.class, args);
    }

}
