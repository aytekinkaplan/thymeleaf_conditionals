package com.thymeleafconditionals.thymeleafconditionals;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class ThymeleafConditionalsController006 {
    @GetMapping("/test009")
    public String test009(Model model) {
        ArrayList<ThymeleafConditionalsController005POJO> people = new ArrayList<ThymeleafConditionalsController005POJO>(
                Arrays.asList(
                        new ThymeleafConditionalsController005POJO("Yusuf", 25, "admin"),
                        new ThymeleafConditionalsController005POJO("Mohammad", 30, "user"),
                        new ThymeleafConditionalsController005POJO("Ali", 40, "manager"),
                        new ThymeleafConditionalsController005POJO("Ahmed", 20, "editor"),
                        new ThymeleafConditionalsController005POJO("Michael", 40, "user"),
                        new ThymeleafConditionalsController005POJO("Ross", 45, "manager"),
                        new ThymeleafConditionalsController005POJO("Harry", 20, "editor"),
                        new ThymeleafConditionalsController005POJO("Nora", 30, "user"),
                        new ThymeleafConditionalsController005POJO("John", 25, "admin"),
                        new ThymeleafConditionalsController005POJO("Maria", 30, "user"),
                        new ThymeleafConditionalsController005POJO("Fred", 40, "manager"),
                        new ThymeleafConditionalsController005POJO("Terry", 40, "user")
                )
        );
        model.addAttribute("persons", people);
        return "test009";
    }
}
