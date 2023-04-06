package com.geekster.com.satyam.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping(value = "/student")
    public String getInfo(){
        return "Idiot student don't get anything";
    }
}
