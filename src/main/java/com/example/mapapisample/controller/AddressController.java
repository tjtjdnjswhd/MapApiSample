package com.example.mapapisample.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddressController {
    @Value("${map-service.juso.key}")
    private String jusoKey;

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/juso-pop")
    public String getJusoPopUp(Model model) {
        model.addAttribute("key", jusoKey);
        return "jusoPopUp";
    }

    @PostMapping("/juso-pop")
    public String postJusoP1opUp(Model model) {
        model.addAttribute("key", jusoKey);
        return "jusoPopUp";
    }
}
