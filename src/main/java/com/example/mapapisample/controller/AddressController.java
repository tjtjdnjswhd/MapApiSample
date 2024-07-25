package com.example.mapapisample.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddressController {
    @Value("${map-service.juso.key}")
    private String jusoKey;

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/juso-pop")
    public String jusoPopUp(Model model) {
        model.addAttribute("key", jusoKey);
        return "jusoPopUp";
    }
}
