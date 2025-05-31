package com.exercicios.testes.exercicio10;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(ListaElementosController.class)
public class ListaElementosControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testListar() throws Exception {
        mockMvc.perform(get("/elementos"))
                .andExpect(status().isOk())
                .andExpect(content().json("["Elemento1","Elemento2","Elemento3"]"));
    }
}
