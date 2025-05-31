package com.exercicios.testes.exercicio04;

import org.springframework.web.bind.annotation.*;

@RestController
public class TempConverterController {
    @GetMapping("/celsius-para-fahrenheit")
    public double convert(@RequestParam double celsius) {
        return (celsius * 9/5) + 32;
    }
}
