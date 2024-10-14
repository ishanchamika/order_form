package com.example.video.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/test")
@CrossOrigin
public class TestController
{

    @GetMapping(path = "/get-text")
    public String getText()
    {
        String text = "Hello, Ishan";
        return text;
    }
}
