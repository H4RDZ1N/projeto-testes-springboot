package com.exercicios.testes.exercicio06;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.http.MediaType.APPLICATION_JSON;

@WebMvcTest(ContadorPalavrasController.class)
public class ContadorPalavrasControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testContarPalavras() throws Exception {
        mockMvc.perform(post("/contar-palavras")
                .contentType(APPLICATION_JSON)
                .content("uma frase com cinco palavras"))
                .andExpect(status().isOk())
                .andExpect(content().string("5"));
    }
}
