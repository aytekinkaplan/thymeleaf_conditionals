package com.thymeleafconditionals.thymeleafconditionals;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class ThymeleafConditionalsController5 {

    @GetMapping("/test008")
    public String test008(Model model) {
        ArrayList<ThymeleafConditionalsController5POJO> people = new ArrayList<ThymeleafConditionalsController5POJO>(
                Arrays.asList(
                        new ThymeleafConditionalsController5POJO("John", 30, "admin"),
                        new ThymeleafConditionalsController5POJO("Maria", 25, "user"),
                        new ThymeleafConditionalsController5POJO("Fred", 20, "manager"),
                        new ThymeleafConditionalsController5POJO("Michael", 15, "editor"),
                        new ThymeleafConditionalsController5POJO("Yusuf", 10, "viewer")
                )
        );
        model.addAttribute("people", people);
        return "test008";
    }
}
