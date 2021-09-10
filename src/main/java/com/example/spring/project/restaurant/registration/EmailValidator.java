package com.example.spring.project.restaurant.registration;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;

@Service
public class EmailValidator implements Predicate<String> {
    @Override
    public boolean test(String s) {
        // TO DO: regex to validate email
        return true;
    }
}
