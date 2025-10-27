package org.example.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/v1/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/v1/bye")
    public String bye(){
        return "bye";
    }

    @GetMapping("v1/hi")
    public String hi(){
        return "hi";
    }

}
