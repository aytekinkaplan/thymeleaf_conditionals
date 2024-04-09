package com.thymeleafconditionals.thymeleafconditionals;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class ThymeleafConditionalsController8 {
    @GetMapping("/test011")
    public String test011(Model model) {
        ArrayList<ThymeleafConditionalsController8POJO> controllers = new ArrayList<ThymeleafConditionalsController8POJO>(
                Arrays.asList(
                        new ThymeleafConditionalsController8POJO("Chair", 20.99, 5.99),
                        new ThymeleafConditionalsController8POJO("Table", 40.99, 8.99),
                        new ThymeleafConditionalsController8POJO("Couch", 100.99, 105.99),
                        new ThymeleafConditionalsController8POJO("Fridge", 200.99, 59.99),
                        new ThymeleafConditionalsController8POJO("Laptop", 150.99, 205.99),
                        new ThymeleafConditionalsController8POJO("Bed", 250.99, 260.99)
                )
        );
        model.addAttribute("controllers", controllers);
        return "test011";
    }

    ;
}
