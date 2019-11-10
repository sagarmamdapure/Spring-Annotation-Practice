package com.practice.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private String[] data = {"dummy_string_1", "dummy_string_2", "dummy_string_3", "dummy_string_4"};
    private Random random = new Random();

    @Override
    public String getFortune() {
        int index = random.nextInt(data.length);
        return "This is a dummy fortune : " + data[index];
        //return "This is a random fortune";
    }
}
