package com.thymeleafconditionals.thymeleafconditionals;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class ThymeleafConditionalsController009 {
    @GetMapping("/test012")
    public String test012(Model model) {
        ArrayList<ThymeleafConditionalsController009POJO> controllers = new ArrayList<ThymeleafConditionalsController009POJO>(
                Arrays.asList(
                        new ThymeleafConditionalsController009POJO("Chair", 20.99, 5.99),
                        new ThymeleafConditionalsController009POJO("Table", 40.99, 8.99),
                        new ThymeleafConditionalsController009POJO("Couch", 100.99, 105.99),
                        new ThymeleafConditionalsController009POJO("Fridge", 200.99, 59.99),
                        new ThymeleafConditionalsController009POJO("Laptop", 150.99, 205.99),
                        new ThymeleafConditionalsController009POJO("Bed", 250.99, 260.99)
                )
        );
        model.addAttribute("controllers", controllers);
        return "test012";
    }
}
