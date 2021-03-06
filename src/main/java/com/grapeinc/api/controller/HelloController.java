package com.grapeinc.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("api/v1/hello")
@RestController
public class HelloController {

    @GetMapping
    public String helloWorld() {
        return  "Hello World From Spring";
    }

}
