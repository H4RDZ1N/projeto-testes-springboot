package com.exercicios.testes.exercicio07;

import org.springframework.web.bind.annotation.*;

@RestController
public class NumeroPrimoController {
    @GetMapping("/primo")
    public boolean isPrimo(@RequestParam int numero) {
        if (numero < 2) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}
