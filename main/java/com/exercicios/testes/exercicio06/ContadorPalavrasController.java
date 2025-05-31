package com.exercicios.testes.exercicio06;

import org.springframework.web.bind.annotation.*;

@RestController
public class ContadorPalavrasController {
    @PostMapping("/contar-palavras")
    public int contar(@RequestBody String texto) {
        return texto.trim().split("\s+").length;
    }
}
