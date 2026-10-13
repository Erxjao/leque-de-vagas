package br.edu.faculdade.lequedevagas;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class VagaControllerTest {
    @Autowired MockMvc mockMvc;

    @Test
    void listaVagasEBuscaPorId() throws Exception {
        mockMvc.perform(get("/vagas"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(12));
        mockMvc.perform(get("/vagas/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].id").value("1"));
        mockMvc.perform(get("/vagas/inexistente"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(0));
    }
}
