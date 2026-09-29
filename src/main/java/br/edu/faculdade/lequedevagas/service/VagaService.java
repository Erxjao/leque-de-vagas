package br.edu.faculdade.lequedevagas.service;

import br.edu.faculdade.lequedevagas.model.Vaga;
import br.edu.faculdade.lequedevagas.Repository.VagaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VagaService {

    private final VagaRepository vagaRepository;

    public VagaService(VagaRepository vagaRepository) {
        this.vagaRepository = vagaRepository;
    }

    public List<Vaga> listar() {
        return vagaRepository.listar();
    }

    public Vaga buscarPorId(Long id) {
        return vagaRepository.buscarPorId(id);
    }
}