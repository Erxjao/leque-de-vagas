package br.edu.faculdade.lequedevagas.Repository;

import br.edu.faculdade.lequedevagas.model.Empresa;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmpresaRepository {

    private final List<Empresa> empresas = new ArrayList<>();

    public EmpresaRepository() {

        empresas.add(new Empresa(
                1L,
                "Tech Solutions",
                "tech-solutions",
                "https://techsolutions.com.br",
                "Consultoria de software especializada em sistemas back-end com Java."
        ));

        empresas.add(new Empresa(
                2L,
                "WebTech",
                "webtech",
                "https://webtech.com.br",
                "Agência digital focada em interfaces web modernas."
        ));
    }

    public List<Empresa> listar() {
        return empresas;
    }

    public Empresa buscarPorSlug(String slug) {

        for (Empresa empresa : empresas) {

            if (empresa.getSlug().equals(slug)) {
                return empresa;
            }
        }

        return null;
    }
}
