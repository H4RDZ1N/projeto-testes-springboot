package com.exercicios.testes.exercicio02;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(SomaController.class)
public class SomaControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testSoma() throws Exception {
        mockMvc.perform(get("/soma?a=2&b=3"))
                .andExpect(status().isOk())
                .andExpect(content().string("5"));
    }
}
