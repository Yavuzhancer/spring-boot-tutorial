package com.example.springboottutorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name){
        return "Hello" + name + "!";
    }

    @RequestMapping("/bye")
    public String sayGoodbye(){
        return "Goodbye with Spring!";
    }
}
