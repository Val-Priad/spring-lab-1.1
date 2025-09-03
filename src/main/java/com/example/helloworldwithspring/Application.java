package com.example.helloworldwithspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;

@SpringBootApplication
@Order(2)
public class Application implements CommandLineRunner {
    public static void main(String[] args) {

        printSurroundedMessage("Start");

        SpringApplication.run(Application.class, args);

        printSurroundedMessage("End");

    }

    @Override
    public void run(String... args) {
        System.out.println("\n\tHello World");
    }

    public static void printSurroundedMessage(String message) {
        final int LINE_LENGTH = 40;
        System.out.println(getLine(LINE_LENGTH, "red"));
        System.out.println(getColoredString(message, "green"));
        System.out.println(getLine(LINE_LENGTH, "red"));

    }

    public static String getLine(int length, String color) {
        return getColoredString("-".repeat(length), color);

    }

    public static String getColoredString(String message, String color) {
        final String reset = "\033[0m";

        return switch (color) {
            case "red" -> "\033[31m" + message + reset;
            case "green" -> "\033[32m" + message + reset;
            default -> message;
        };
    }
}