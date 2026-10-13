package br.edu.faculdade.lequedevagas.Repository;

import br.edu.faculdade.lequedevagas.model.Candidatura;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CandidaturaRepository {

    public List<Candidatura> buscarTodas() {
        // Dados mocado/simulados em memória para a Aula 02
        return List.of(
                new Candidatura(1L, 10L, 100L, "EM_ANALISE", "2026-10-13"),
                new Candidatura(2L, 11L, 101L, "APROVADO", "2026-10-12")
        );
    }
}