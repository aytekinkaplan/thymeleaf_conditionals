package com.thymeleafconditionals.thymeleafconditionals;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class ThymeleafConditionalsController2 {
    @GetMapping("/test005")
    public String test005(Model model) {
        List<String> colors = Arrays.asList("red", "blue", "green", "yellow");
        model.addAttribute("colors", colors);
        model.addAttribute("defaultColor", "white"); // Varsayılan renk
        return "test005";
    }

    @PostMapping("/test005")
    public String changeColor(String selectedColor, Model model) {
        model.addAttribute("selectedColor", selectedColor);
        return "test005";
    }
}
