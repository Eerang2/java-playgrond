package com.javaplaygrond.ejlee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/ejlee")
    public String getHtmlHomePage() {
        return "이어진";
    }

    @GetMapping("/jwlee")
    public String getJinwoo() {
        return "이진우";
    }


    @GetMapping("/ejlee/parameter")
    public String getEjlee(@RequestParam String address) {
        return "어진이의 집주소는:   " + address;
    }
}
