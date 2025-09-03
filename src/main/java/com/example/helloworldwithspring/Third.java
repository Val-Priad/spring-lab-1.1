package com.example.helloworldwithspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class Third implements CommandLineRunner {

    @Override
    public void run(String... args) {
        System.out.println("Second");
    }
}