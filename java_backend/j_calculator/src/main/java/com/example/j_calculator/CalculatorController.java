package com.example.j_calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/j_calculator")
public class CalculatorController {

    @GetMapping("/add")
    public String add(@RequestParam int a, @RequestParam int b) {
        return String.valueOf(a + b);
    }

    @GetMapping("/persent/add")
    public String persentAdd(@RequestParam int a, @RequestParam int b) {
        return String.valueOf(a + a * b / 100);
    }

    @GetMapping("/persent/multiple")
    public String persentMultiple(@RequestParam int a, @RequestParam int b) {
        return String.valueOf(a * b / 100);
    }

}
