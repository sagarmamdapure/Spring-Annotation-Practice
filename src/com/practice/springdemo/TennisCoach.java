package com.practice.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println(">> TennisCoach: inside default constructor");
    }

    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println(">> TennisCoach : inside doMyStartupStuff");
    }

    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println(">> TennisCoach : inside doMyCleanupStuff");
    }
/*
    @Autowired
    public void anyRandomMethod(FortuneService fortuneService) {
        System.out.println(">> TennisCoach: inside anyRandomMethod method");
        this.fortuneService = fortuneService;
    }
*/

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
