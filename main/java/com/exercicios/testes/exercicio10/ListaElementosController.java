package com.exercicios.testes.exercicio10;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ListaElementosController {
    @GetMapping("/elementos")
    public List<String> listar() {
        return List.of("Elemento1", "Elemento2", "Elemento3");
    }
}
