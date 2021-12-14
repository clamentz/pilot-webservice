package com.sunys.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * Created by Sunys.
 * User: Sunys
 * Date: 2021-04-13
 * Time: 오후 4:32
 */
@EnableJpaAuditing
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
