package br.edu.faculdade.lequedevagas.service;

import br.edu.faculdade.lequedevagas.model.Candidatura;
import br.edu.faculdade.lequedevagas.Repository.CandidaturaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidaturaService {

    private final CandidaturaRepository candidaturaRepository;

    // Injeção por construtor (obrigatório)
    public CandidaturaService(CandidaturaRepository candidaturaRepository) {
        this.candidaturaRepository = candidaturaRepository;
    }

    public List<Candidatura> listarCandidaturas() {
        return candidaturaRepository.buscarTodas();
    }
}