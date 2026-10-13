package br.edu.faculdade.lequedevagas.model;

public class Empresa {

    private Long id;
    private String nome;
    private String slug;
    private String site;
    private String descricao;

    public Empresa() {
    }

    public Empresa(Long id, String nome, String slug, String site, String descricao) {

        this.id = id;
        this.nome = nome;
        this.slug = slug;
        this.site = site;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSlug() {
        return slug;
    }

    public String getSite() {
        return site;
    }

    public String getDescricao() {
        return descricao;
    }
}
