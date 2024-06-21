package com.example.j_calculator;

import com.example.j_calculator.model.OperationModel;
import com.example.j_calculator.service.CalculateSimple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/j_calculator")
public class CalculatorController {
    OperationModel operationModel = new OperationModel();

    @Autowired
    private CalculateSimple calculateSimple;

    @GetMapping("/add")
    public String add(@RequestParam int a, @RequestParam int b) {
        return String.valueOf(a + b);
    }

    @GetMapping(value="/calculator", params="divide")
    public String divide(@ModelAttribute("operationModel") OperationModel operationModel, Model model ){
        model.addAttribute("result", calculateSimple.divide(operationModel));
        return "calculator";
    @GetMapping("/multiply")
    public String multiply(@RequestParam int a, @RequestParam int b) {
        return String.valueOf(a * b);

    }
}
