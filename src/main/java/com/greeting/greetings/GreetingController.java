package com.greeting.greetings;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class GreetingController {

    @GetMapping("/api/greeting")
    private String getGreetings(){
        return "Hi, How are you?";
    }
}
