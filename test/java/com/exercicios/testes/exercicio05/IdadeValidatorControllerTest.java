package com.exercicios.testes.exercicio05;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(IdadeValidatorController.class)
public class IdadeValidatorControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testMaiorDeIdade() throws Exception {
        mockMvc.perform(post("/validar-idade?idade=20"))
                .andExpect(status().isOk())
                .andExpect(content().string("Maior de idade"));
    }
}
