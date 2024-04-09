package com.thymeleafconditionals.thymeleafconditionals;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafConditionalsController4 {

    @GetMapping("/test007")
    public String test007(Model model) {
        model.addAttribute("name", "Ahmed Yusuf");
        return "test007";
    }
}
