package com.example.springboot.actuatorbasics.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
public class HomeController {

    @GetMapping("/get-contact")
    public Map<String, String> getContact(){

      Map<String, String> map = new HashMap<>();
           map.put("Joe","152635");
           map.put("Lee","2589555");
        return map ;
    }
}
