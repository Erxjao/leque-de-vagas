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
class PessoaControllerTest {
    @Autowired MockMvc mockMvc;
    @Test void listaPessoasEBuscaPorId() throws Exception {
        mockMvc.perform(get("/pessoas")).andExpect(status().isOk()).andExpect(jsonPath("$.length()").value(6));
        mockMvc.perform(get("/pessoas/1")).andExpect(status().isOk()).andExpect(jsonPath("$[0].email").value("ana@exemplo.com"));
    }
}
