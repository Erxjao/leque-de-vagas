package br.edu.faculdade.lequedevagas;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class EstatisticasControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void retornaEstatisticasDoCatalogo() throws Exception {
        mockMvc.perform(get("/estatisticas"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.totalDeVagas").value(12))
                .andExpect(jsonPath("$.aceitamIniciante").value(8))
                .andExpect(jsonPath("$.porArea['Back-end']").value(3))
                .andExpect(jsonPath("$.porArea['Front-end']").value(3))
                .andExpect(jsonPath("$.porArea['Dados']").value(3))
                .andExpect(jsonPath("$.porArea['Mobile']").value(3))
                .andExpect(jsonPath("$.porSenioridade['Estágio']").value(3))
                .andExpect(jsonPath("$.porSenioridade['Júnior']").value(4))
                .andExpect(jsonPath("$.porSenioridade['Pleno']").value(3))
                .andExpect(jsonPath("$.porSenioridade['Sênior']").value(2));
    }
}
