package br.edu.faculdade.lequedevagas.Repository;

import br.edu.faculdade.lequedevagas.model.Vaga;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VagaRepository {

    private final List<Vaga> vagas = List.of(
            new Vaga("1", "Desenvolvedor Java Júnior", "APIs Java e Spring Boot.", "Back-end", "Júnior", "João Pessoa", true, "tech-solutions"),
            new Vaga("2", "Desenvolvedor Front-end", "Interfaces web modernas.", "Front-end", "Pleno", "Remoto", false, "webtech"),
            new Vaga("3", "Estagiário de Dados", "Relatórios e análises.", "Dados", "Estágio", "Recife", true, "data-nordeste"),
            new Vaga("4", "Desenvolvedor Mobile Júnior", "Aplicativos Android e iOS.", "Mobile", "Júnior", "Remoto", true, "mobile-lab"),
            new Vaga("5", "Desenvolvedor Back-end Pleno", "Serviços Java em nuvem.", "Back-end", "Pleno", "São Paulo", false, "tech-solutions"),
            new Vaga("6", "Estagiário de Front-end", "Componentes React.", "Front-end", "Estágio", "João Pessoa", true, "webtech"),
            new Vaga("7", "Cientista de Dados Sênior", "Produtos de dados.", "Dados", "Sênior", "Remoto", false, "data-nordeste"),
            new Vaga("8", "Desenvolvedor Mobile Pleno", "Integrações REST.", "Mobile", "Pleno", "Recife", true, "mobile-lab"),
            new Vaga("9", "Arquiteto Back-end", "Arquitetura de APIs.", "Back-end", "Sênior", "São Paulo", false, "cloudworks"),
            new Vaga("10", "Desenvolvedor Front-end Júnior", "Páginas acessíveis.", "Front-end", "Júnior", "Remoto", true, "webtech"),
            new Vaga("11", "Analista de Dados Júnior", "Indicadores de negócio.", "Dados", "Júnior", "João Pessoa", true, "data-nordeste"),
            new Vaga("12", "Estagiário Mobile", "Testes de aplicativos.", "Mobile", "Estágio", "Recife", true, "mobile-lab")
    );

    public List<Vaga> todas() {
        return vagas;
    }
}
