package br.edu.faculdade.lequedevagas.service;

import br.edu.faculdade.lequedevagas.model.Empresa;
import br.edu.faculdade.lequedevagas.model.Vaga;
import br.edu.faculdade.lequedevagas.Repository.EmpresaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpresaService {

    private final EmpresaRepository empresaRepository;
    private final VagaService vagaService;

    public EmpresaService(EmpresaRepository empresaRepository, VagaService vagaService) {
        this.empresaRepository = empresaRepository;
        this.vagaService = vagaService;
    }

    public List<Empresa> listar() {
        return empresaRepository.listar();
    }

    public List<Vaga> listarVagas(String slug) {

        Empresa empresa = empresaRepository.buscarPorSlug(slug);

        if (empresa == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Empresa não encontrada");
        }

        // Enquanto não existe a relação Empresa → Vagas no banco, liga pelo nome.
        List<Vaga> vagasDaEmpresa = new ArrayList<>();

        for (Vaga vaga : vagaService.listar()) {

            if (vaga.getEmpresa().equals(empresa.getNome())) {
                vagasDaEmpresa.add(vaga);
            }
        }

        return vagasDaEmpresa;
    }
}
