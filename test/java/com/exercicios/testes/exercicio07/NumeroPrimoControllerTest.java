package com.exercicios.testes.exercicio07;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(NumeroPrimoController.class)
public class NumeroPrimoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testIsPrimo() throws Exception {
        mockMvc.perform(get("/primo?numero=7"))
                .andExpect(status().isOk())
                .andExpect(content().string("true"));
    }
}
