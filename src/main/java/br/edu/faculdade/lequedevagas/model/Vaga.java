package br.edu.faculdade.lequedevagas.model;

public record Vaga(
        String id,
        String titulo,
        String descricao,
        String area,
        String senioridade,
        String local,
        boolean aceitaIniciante,
        String empresaSlug
) {
}
