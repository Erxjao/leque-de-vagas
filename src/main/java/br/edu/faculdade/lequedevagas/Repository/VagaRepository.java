package br.edu.faculdade.lequedevagas.Repository;

import br.edu.faculdade.lequedevagas.model.Vaga;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class VagaRepository {

    private final List<Vaga> vagas = new ArrayList<>();

    public VagaRepository() {

        vagas.add(new Vaga(
                1L,
                "Desenvolvedor Java Júnior",
                "Desenvolvimento de APIs utilizando Java e Spring Boot.",
                "Back-end",
                "Júnior",
                "João Pessoa",
                true,
                "Tech Solutions",
                "2026-09-15"
        ));

        vagas.add(new Vaga(
                2L,
                "Desenvolvedor Front-end",
                "Desenvolvimento de interfaces web.",
                "Front-end",
                "Pleno",
                "Remoto",
                false,
                "WebTech",
                "2026-09-14"
        ));

        vagas.add(new Vaga(
                3L,
                "Estagiário de Dados",
                "Apoio na organização e análise de dados para relatórios.",
                "Dados",
                "Estágio",
                "Recife",
                true,
                "Tech Solutions",
                "2026-09-13"
        ));

        vagas.add(new Vaga(
                4L,
                "Desenvolvedor Mobile Júnior",
                "Criação de funcionalidades para aplicativos Android e iOS.",
                "Mobile",
                "Júnior",
                "Remoto",
                true,
                "WebTech",
                "2026-09-12"
        ));

        vagas.add(new Vaga(
                5L,
                "Desenvolvedor Back-end Pleno",
                "Manutenção e evolução de serviços Java em nuvem.",
                "Back-end",
                "Pleno",
                "São Paulo",
                false,
                "Tech Solutions",
                "2026-09-11"
        ));

        vagas.add(new Vaga(
                6L,
                "Estagiário de Front-end",
                "Apoio no desenvolvimento de componentes com React.",
                "Front-end",
                "Estágio",
                "João Pessoa",
                true,
                "WebTech",
                "2026-09-10"
        ));

        vagas.add(new Vaga(
                7L,
                "Cientista de Dados Sênior",
                "Modelagem estatística e criação de produtos de dados.",
                "Dados",
                "Sênior",
                "Remoto",
                false,
                "Tech Solutions",
                "2026-09-09"
        ));

        vagas.add(new Vaga(
                8L,
                "Desenvolvedor Mobile Pleno",
                "Integração de aplicativos móveis com serviços REST.",
                "Mobile",
                "Pleno",
                "Recife",
                true,
                "WebTech",
                "2026-09-08"
        ));

        vagas.add(new Vaga(
                9L,
                "Arquiteto Back-end",
                "Definição de arquitetura para APIs distribuídas.",
                "Back-end",
                "Sênior",
                "São Paulo",
                false,
                "Tech Solutions",
                "2026-09-07"
        ));

        vagas.add(new Vaga(
                10L,
                "Desenvolvedor Front-end Júnior",
                "Implementação de páginas responsivas e acessíveis.",
                "Front-end",
                "Júnior",
                "Remoto",
                true,
                "WebTech",
                "2026-09-06"
        ));

        vagas.add(new Vaga(
                11L,
                "Analista de Dados Júnior",
                "Construção de consultas e indicadores de negócio.",
                "Dados",
                "Júnior",
                "João Pessoa",
                true,
                "Tech Solutions",
                "2026-09-05"
        ));

        vagas.add(new Vaga(
                12L,
                "Estagiário de Desenvolvimento Mobile",
                "Apoio em testes e correções de aplicativos móveis.",
                "Mobile",
                "Estágio",
                "Recife",
                true,
                "WebTech",
                "2026-09-04"
        ));
    }

    public List<Vaga> listar() {
        return vagas;
    }

    public Vaga buscarPorId(Long id) {

        for (Vaga vaga : vagas) {

            if (vaga.getId().equals(id)) {
                return vaga;
            }
        }

        return null;
    }
}