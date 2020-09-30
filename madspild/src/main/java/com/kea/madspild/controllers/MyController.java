package com.kea.madspild.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
        return "kontaktOs";
    }

    @PostMapping("/kontaktResult")
    public String kontaktResult(@RequestParam String fuldeNavn, @RequestParam String email,
                                @RequestParam String besked, Model model) {
        return "beskedIndsendt";
    }


}
