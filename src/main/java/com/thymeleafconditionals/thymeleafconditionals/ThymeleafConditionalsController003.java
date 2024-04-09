package com.thymeleafconditionals.thymeleafconditionals;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafConditionalsController003 {

    @GetMapping("/test006")
    public String test006(Model model) {
        model.addAttribute("string", "The sun shone brightly as the children played in the park. " +
                "Birds chirped happily in the trees, and a gentle breeze rustled the leaves. " +
                "Laughter filled the air as families enjoyed picnics on the lush green grass. It was a perfect day for outdoor fun.");
        return "test006";
    }
}
