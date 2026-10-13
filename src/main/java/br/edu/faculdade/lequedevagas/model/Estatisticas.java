package br.edu.faculdade.lequedevagas.model;

import java.util.Map;

public record Estatisticas(
        long totalDeVagas,
        long aceitamIniciante,
        Map<String, Long> porArea,
        Map<String, Long> porSenioridade
) {
}
