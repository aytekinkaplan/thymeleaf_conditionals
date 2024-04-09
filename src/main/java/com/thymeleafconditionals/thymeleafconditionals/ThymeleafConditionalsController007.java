package com.thymeleafconditionals.thymeleafconditionals;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class ThymeleafConditionalsController007 {
    @GetMapping("/test010")
    public String test010(Model model) {
        ArrayList<ThymeleafConditionalsController007POJO> items = new ArrayList<ThymeleafConditionalsController007POJO>(
                Arrays.asList(
                        new ThymeleafConditionalsController007POJO("Chair", 20.99, 5.99),
                        new ThymeleafConditionalsController007POJO("Table", 40.99, 8.99),
                        new ThymeleafConditionalsController007POJO("Couch", 100.99, 105.99),
                        new ThymeleafConditionalsController007POJO("Fridge", 200.99, 59.99),
                        new ThymeleafConditionalsController007POJO("Laptop", 150.99, 205.99),
                        new ThymeleafConditionalsController007POJO("Bed", 250.99, 260.99)

                )
        );
        model.addAttribute("goods", items);
        return "test010";
    }
}
