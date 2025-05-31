package com.exercicios.testes.exercicio09;

import org.springframework.web.bind.annotation.*;

@RestController
public class ConversorMoedaController {
    @GetMapping("/conversor")
    public double converter(@RequestParam double valor) {
        return valor * 5.0; // exemplo: dólar para real
    }
}
