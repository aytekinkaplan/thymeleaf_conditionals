package com.thymeleafconditionals.thymeleafconditionals;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class ThymeleafConditionalsController7 {
    @GetMapping("/test010")
    public String test010(Model model) {
        ArrayList<ThymeleafConditionalsController7POJO> items = new ArrayList<ThymeleafConditionalsController7POJO>(
                Arrays.asList(
                        new ThymeleafConditionalsController7POJO("Chair", 20.99, 5.99),
                        new ThymeleafConditionalsController7POJO("Table", 40.99, 8.99),
                        new ThymeleafConditionalsController7POJO("Couch", 100.99, 105.99),
                        new ThymeleafConditionalsController7POJO("Fridge", 200.99, 59.99),
                        new ThymeleafConditionalsController7POJO("Laptop", 150.99, 205.99),
                        new ThymeleafConditionalsController7POJO("Bed", 250.99, 260.99)

                )
        );
        model.addAttribute("goods", items);
        return "test010";
    }
}
