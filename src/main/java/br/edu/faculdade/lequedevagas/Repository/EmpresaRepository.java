package br.edu.faculdade.lequedevagas.Repository;

import br.edu.faculdade.lequedevagas.model.Empresa;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmpresaRepository {
    private final List<Empresa> empresas = List.of(
            new Empresa("1", "Tech Solutions", "tech-solutions", "https://techsolutions.com.br", "Consultoria de software."),
            new Empresa("2", "WebTech", "webtech", "https://webtech.com.br", "Agência digital."),
            new Empresa("3", "Data Nordeste", "data-nordeste", "https://datanordeste.com.br", "Soluções de dados."),
            new Empresa("4", "Mobile Lab", "mobile-lab", "https://mobilelab.com.br", "Produtos móveis."),
            new Empresa("5", "CloudWorks", "cloudworks", "https://cloudworks.com.br", "Infraestrutura em nuvem.")
    );

    public List<Empresa> listar() { return empresas; }

    public Empresa buscarPorSlug(String slug) {
        return empresas.stream().filter(empresa -> empresa.slug().equals(slug)).findFirst().orElse(null);
    }
}
