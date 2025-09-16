package com.zumo.demo.myfirstapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello World!!!";
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a Hard 5 km!!!";
    }

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day...";
    }
}
