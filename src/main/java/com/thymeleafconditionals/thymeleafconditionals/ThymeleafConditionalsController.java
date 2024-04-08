package com.thymeleafconditionals.thymeleafconditionals;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafConditionalsController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("sales", 100);
        model.addAttribute("sales", 75);
        model.addAttribute("sales", 50);
        model.addAttribute("sales", 25);
        return "index";
    }
}
