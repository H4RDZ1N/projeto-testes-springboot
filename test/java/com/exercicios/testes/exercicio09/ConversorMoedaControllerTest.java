package com.exercicios.testes.exercicio09;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ConversorMoedaController.class)
public class ConversorMoedaControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testConversao() throws Exception {
        mockMvc.perform(get("/conversor?valor=2"))
                .andExpect(status().isOk())
                .andExpect(content().string("10.0"));
    }
}
