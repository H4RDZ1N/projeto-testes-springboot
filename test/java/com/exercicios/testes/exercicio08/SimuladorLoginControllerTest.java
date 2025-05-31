package com.exercicios.testes.exercicio08;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(SimuladorLoginController.class)
public class SimuladorLoginControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testLoginSucesso() throws Exception {
        mockMvc.perform(post("/login?usuario=admin&senha=1234"))
                .andExpect(status().isOk())
                .andExpect(content().string("Login bem-sucedido"));
    }
}
