package com.kea.madspild.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/contactus")
    public String contactus() {
        return "contactus";
    }

    @GetMapping("/info")
    public String info() {
        return "info";
    }
}
