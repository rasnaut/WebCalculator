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
    
    @GetMapping("/squaring")
    public String squaring(@RequestParam int a) {
        return String.valueOf(a * a);
    }

    @GetMapping("/modulus")
    public String modulus(@RequestParam int a) {
        return String.valueOf(Math.abs(a));
    }

    @GetMapping("/cube")
    public String cube (@RequestParam int a) { return String.valueOf(a * a * a);
    }


    @GetMapping("/division")
    public String divisionWithRemainder(@RequestParam int a, @RequestParam int b) {
        return String.valueOf(a % b);

    }

}
