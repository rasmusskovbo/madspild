package com.kea.madspild.controllers;

import com.kea.madspild.models.Contact;
import com.kea.madspild.models.ContactList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    @GetMapping("/")
    public String forside() {
        return "forside";
    }

    @GetMapping("/godeRaad")
    public String godeRaad(){
        return "godeRaad";
    }

    @GetMapping("/blivMedlem")
    public String blivMedlem() {
        return "blivMedlem";
    }

    @GetMapping("/kontaktOs")
    public String kontaktOs() {
        return "kontaktOs";
    }

    @GetMapping("/medlemskabInfo")
    public String medlemskabInfo() {
        return "popup-anmodMedlemskab";
    }

    @PostMapping("/beskedIndsendt")
    public String besked(@RequestParam String email, Model model) {
        model.addAttribute("email", email);
        return "beskedIndsendt";
    }

    @PostMapping("/medlemskabIndsendt")
    public String createContact(@RequestParam String name, @RequestParam String company, @RequestParam String email, @RequestParam String msg, Model model) {
        ContactList contactList = new ContactList();
        contactList.add(new Contact(name, company, email, msg));
        model.addAttribute("name", name);
        model.addAttribute("company", company);
        model.addAttribute("email", email);
        model.addAttribute("msg", msg);
        return "popup-medlemskabIndsendt";
    }

}
