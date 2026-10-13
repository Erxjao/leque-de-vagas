package br.edu.faculdade.lequedevagas.model;

public record Candidatura(
        Long id,
        Long pessoaId,
        Long vagaId,
        String situacao,
        String enviadaEm
) {}
