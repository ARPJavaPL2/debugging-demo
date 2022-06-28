package com.sda.debuggingdemo.controllers;

import com.sda.debuggingdemo.services.CalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {

    private final CalculationService calculationService;

    @Autowired
    public MainController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @GetMapping("sum")
    public ResponseEntity<Long> sum(@RequestParam List<Integer> numbers) {
        return ResponseEntity.ok(calculationService.sum(numbers));
    }

    @GetMapping("subtract")
    public ResponseEntity<Long> subtract(@RequestParam List<Integer> numbers) {
        return ResponseEntity.ok(calculationService.subtract(numbers));
    }

    @GetMapping("multiply")
    public ResponseEntity<String> multiply(@RequestParam List<Integer> numbers) {
        return ResponseEntity.ok(calculationService.multiply(numbers));
    }

    @GetMapping("concatenate")
    public ResponseEntity<String> concatenate(@RequestParam List<String> strings) {
        return ResponseEntity.ok(calculationService.concatenate(strings));
    }

    @GetMapping("division")
    public ResponseEntity<Long> division(@RequestParam List<Integer> numbers) {
        return ResponseEntity.ok(calculationService.divide(numbers));
    }

    @GetMapping("to-upper-case")
    public ResponseEntity<String> toUpperCase(@RequestParam String string) {
        return ResponseEntity.ok(calculationService.toUppercase(string));
    }

    @GetMapping("capitalize")
    public ResponseEntity<String> capitalize(@RequestParam String string) {
        return ResponseEntity.ok(calculationService.capitalize(string));
    }

    @GetMapping("to-lower-case")
    public ResponseEntity<String> toLowerCase(@RequestParam String string) {
        return ResponseEntity.ok(calculationService.toLowerCase(string));
    }
}


