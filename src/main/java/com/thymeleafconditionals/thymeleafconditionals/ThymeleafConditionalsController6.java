package com.thymeleafconditionals.thymeleafconditionals;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class ThymeleafConditionalsController6 {
    @GetMapping("/test009")
    public String test009(Model model) {
        ArrayList<ThymeleafConditionalsController5POJO> people = new ArrayList<ThymeleafConditionalsController5POJO>(
                Arrays.asList(
                        new ThymeleafConditionalsController5POJO("Yusuf", 25, "admin"),
                        new ThymeleafConditionalsController5POJO("Mohammad", 30, "user"),
                        new ThymeleafConditionalsController5POJO("Ali", 40, "manager"),
                        new ThymeleafConditionalsController5POJO("Ahmed", 20, "editor"),
                        new ThymeleafConditionalsController5POJO("Michael", 40, "user"),
                        new ThymeleafConditionalsController5POJO("Ross", 45, "manager"),
                        new ThymeleafConditionalsController5POJO("Harry", 20, "editor"),
                        new ThymeleafConditionalsController5POJO("Nora", 30, "user"),
                        new ThymeleafConditionalsController5POJO("John", 25, "admin"),
                        new ThymeleafConditionalsController5POJO("Maria", 30, "user"),
                        new ThymeleafConditionalsController5POJO("Fred", 40, "manager"),
                        new ThymeleafConditionalsController5POJO("Terry", 40, "user")
                )
        );
        model.addAttribute("persons", people);
        return "test009";
    }
}
