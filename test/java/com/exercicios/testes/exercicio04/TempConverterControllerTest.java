package com.exercicios.testes.exercicio04;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(TempConverterController.class)
public class TempConverterControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testConvert() throws Exception {
        mockMvc.perform(get("/celsius-para-fahrenheit?celsius=0"))
                .andExpect(status().isOk())
                .andExpect(content().string("32.0"));
    }
}
