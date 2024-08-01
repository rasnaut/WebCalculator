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
 47-backend-root-calculation1
    @GetMapping("/root")
    public String root(@RequestParam int a) {
        if (a < 0) {
            return "Square root of negative numbers is not allowed.";
        }
        return String.valueOf(Math.sqrt(a));
    }
}