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