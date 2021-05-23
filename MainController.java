package com.tts.myAwesomeProject.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }

    @RequestMapping("/maps")
    public String maps(){
        return "I'm a map. I'm a map. I'm a map.";
    }
}
