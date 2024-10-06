package com.fatihdemir.libraryreservation.starter;

import com.fatihdemir.libraryreservation.security.Hash;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.security.NoSuchAlgorithmException;

@SpringBootApplication
@EntityScan(basePackages = {"com.fatihdemir"})
@ComponentScan(basePackages = {"com.fatihdemir"})
@EnableJpaRepositories(basePackages = {"com.fatihdemir"})
public class LibraryReservationApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraryReservationApplication.class, args);
    }

}
