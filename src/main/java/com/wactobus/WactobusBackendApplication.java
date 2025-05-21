package com.wactobus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.wactobus.model")
@EnableJpaRepositories("com.wactobus.repository")
public class WactobusBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(WactobusBackendApplication.class, args);
    }
}