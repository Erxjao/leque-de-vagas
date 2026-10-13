package br.edu.faculdade.lequedevagas.service;

import br.edu.faculdade.lequedevagas.Repository.VagaRepository;
import br.edu.faculdade.lequedevagas.model.Vaga;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VagaService {

    private final VagaRepository vagaRepository;

    public VagaService(VagaRepository vagaRepository) {
        this.vagaRepository = vagaRepository;
    }

    public List<Vaga> listar() {
        return vagaRepository.todas();
    }

    public List<Vaga> buscarPorId(String id) {
        return vagaRepository.todas().stream()
                .filter(vaga -> vaga.id().equals(id))
                .toList();
    }
}
