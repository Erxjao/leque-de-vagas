package br.edu.faculdade.lequedevagas.service;

import br.edu.faculdade.lequedevagas.Repository.EmpresaRepository;
import br.edu.faculdade.lequedevagas.model.Empresa;
import br.edu.faculdade.lequedevagas.model.Vaga;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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
        return vagaService.listar().stream()
                .filter(vaga -> vaga.empresaSlug().equals(empresa.getSlug()))
                .toList();
    }
}
