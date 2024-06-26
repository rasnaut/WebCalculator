package com.example.j_calculator;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/j_calculator")
public class CalculatorController {
    
    @GetMapping("/add")
    public String add(@RequestParam int a, @RequestParam int b) {
        return String.valueOf(a + b);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam int a, @RequestParam int b) {
        return String.valueOf(a * b);
    }
    
    @GetMapping("/devide")
    public String devide(@RequestParam int a, @RequestParam int b) {
        return String.valueOf(a / b);
    }

    @GetMapping("/subtract")
    public String substruct(@RequestParam int a, @RequestParam int b) {
        return String.valueOf(a - b);
    }
}
