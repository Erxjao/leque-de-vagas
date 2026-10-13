package br.edu.faculdade.lequedevagas.model;

public record Pessoa(
        Long id,
        String nome,
        String email,
        String senha,
        String perfil
) {}
