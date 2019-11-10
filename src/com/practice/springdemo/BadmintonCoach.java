package com.practice.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BadmintonCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice your forehand";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
