package com.exercicios.testes.exercicio02;

import org.springframework.web.bind.annotation.*;

@RestController
public class SomaController {
    @GetMapping("/soma")
    public int soma(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }
}
