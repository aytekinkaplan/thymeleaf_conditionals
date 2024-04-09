package com.thymeleafconditionals.thymeleafconditionals;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class ThymeleafConditionalsController005 {

    @GetMapping("/test008")
    public String test008(Model model) {
        ArrayList<ThymeleafConditionalsController005POJO> people = new ArrayList<ThymeleafConditionalsController005POJO>(
                Arrays.asList(
                        new ThymeleafConditionalsController005POJO("John", 30, "admin"),
                        new ThymeleafConditionalsController005POJO("Maria", 25, "user"),
                        new ThymeleafConditionalsController005POJO("Fred", 20, "manager"),
                        new ThymeleafConditionalsController005POJO("Michael", 15, "editor"),
                        new ThymeleafConditionalsController005POJO("Yusuf", 10, "viewer")
                )
        );
        model.addAttribute("people", people);
        return "test008";
    }
}
