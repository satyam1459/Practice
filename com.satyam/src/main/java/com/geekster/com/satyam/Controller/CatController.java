package com.geekster.com.satyam.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatController {

@GetMapping(value = "/cat")
    public String GetCatInfo(){
        return "This is cat controller";
    }
}
