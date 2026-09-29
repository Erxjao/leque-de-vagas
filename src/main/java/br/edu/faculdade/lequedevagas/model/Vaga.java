package br.edu.faculdade.lequedevagas.model;

public class Vaga {

    private Long id;
    private String titulo;
    private String descricao;
    private String area;
    private String senioridade;
    private String local;
    private boolean aceitaIniciante;
    private String empresa;
    private String publicadaEm;

    public Vaga() {
    }

    public Vaga(Long id, String titulo, String descricao, String area,
                String senioridade, String local, boolean aceitaIniciante,
                String empresa, String publicadaEm) {

        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.area = area;
        this.senioridade = senioridade;
        this.local = local;
        this.aceitaIniciante = aceitaIniciante;
        this.empresa = empresa;
        this.publicadaEm = publicadaEm;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getArea() {
        return area;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public String getLocal() {
        return local;
    }

    public boolean isAceitaIniciante() {
        return aceitaIniciante;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getPublicadaEm() {
        return publicadaEm;
    }
}