package com.example.dockerdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping()
    public String test() {
        return "ci/cd 테스트";
    }
}
