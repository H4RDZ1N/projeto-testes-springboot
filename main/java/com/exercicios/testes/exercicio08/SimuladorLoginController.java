package com.exercicios.testes.exercicio08;

import org.springframework.web.bind.annotation.*;

@RestController
public class SimuladorLoginController {
    @PostMapping("/login")
    public String login(@RequestParam String usuario, @RequestParam String senha) {
        return "admin".equals(usuario) && "1234".equals(senha) ? "Login bem-sucedido" : "Falha no login";
    }
}
