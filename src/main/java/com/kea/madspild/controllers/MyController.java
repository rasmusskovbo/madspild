package com.kea.madspild.controllers;

import com.kea.madspild.models.Contact;
import com.kea.madspild.models.Contacts;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
    private Contacts contacts = new Contacts();

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

    // dynamisk OK meddelelse (uden ny html side)
    // evt impl permanence -> evt skriv til fil
    // evt error handling hvis input ikke følger visse krav (regex)
    @PostMapping("/newcontact")
    public String createContact(@RequestParam String name, @RequestParam String company, @RequestParam String email, @RequestParam String msg, Model model) {
        contacts.add(new Contact(name, company, email, msg));
        model.addAttribute("name", name);
        model.addAttribute("company", company);
        model.addAttribute("email", email);
        model.addAttribute("msg", msg);
        return "beskedindsendt";
    }

}
