package com.exercicios.testes.exercicio05;

import org.springframework.web.bind.annotation.*;

@RestController
public class IdadeValidatorController {
    @PostMapping("/validar-idade")
    public String validarIdade(@RequestParam int idade) {
        return idade >= 18 ? "Maior de idade" : "Menor de idade";
    }
}
