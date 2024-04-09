package com.thymeleafconditionals.thymeleafconditionals;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafConditionalsController001 {
    @GetMapping("/")
    public String index(Model model) {
        int[] sales = {100, 75, 50, 25};
        model.addAttribute("sales", sales);
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("personName", "John");
        model.addAttribute("personName", "Maria");
        model.addAttribute("personName", "Fred");
        model.addAttribute("personName", "Michael");
        model.addAttribute("personName", "Yusuf");
        return "about";
    }

    @GetMapping("/test001")
    public String test001(Model model) {
        model.addAttribute("name", "Yusuf");
        return "test001";
    }

    @GetMapping("/test002")
    public String test002(Model model) {
        model.addAttribute("sales", 30);
        return "test002";
    }

    @GetMapping("/test003")
    public String test003(Model model) {
        model.addAttribute("speed", 100);
        return "test003";
    }

    @GetMapping("/test004")
    public String test004(Model model) {
        model.addAttribute("speed", 100);
        return "test004";
    }



}
