package com.exercicios.testes.exercicio03;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ReverseController.class)
public class ReverseControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testReverse() throws Exception {
        mockMvc.perform(get("/reverse?input=abc"))
                .andExpect(status().isOk())
                .andExpect(content().string("cba"));
    }
}
