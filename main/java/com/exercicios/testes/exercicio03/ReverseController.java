package com.exercicios.testes.exercicio03;

import org.springframework.web.bind.annotation.*;

@RestController
public class ReverseController {
    @GetMapping("/reverse")
    public String reverse(@RequestParam String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
