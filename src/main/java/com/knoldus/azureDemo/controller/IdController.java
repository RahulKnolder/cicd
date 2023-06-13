package com.knoldus.azureDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdController {

    @GetMapping("/name")
    public String displayId(){
        return "rahul kuamr sinha";
    }


}

