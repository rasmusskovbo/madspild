package com.kea.madspild.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/goderaad")
    public String godeRaad() {
        return "goderaad";
    }

    @GetMapping("/medlemskab")
    public String medlemskab() {
        return "medlemskab";
    }

    @GetMapping("/kontakt")
    public String kontakt() {
        return "kontakt";
    }


}
