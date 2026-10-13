package br.edu.faculdade.lequedevagas.controller;

import br.edu.faculdade.lequedevagas.model.Candidatura;
import br.edu.faculdade.lequedevagas.service.CandidaturaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/candidaturas")
public class CandidaturaController {

    private final CandidaturaService candidaturaService;

    // Injeção por construtor (obrigatório)
    public CandidaturaController(CandidaturaService candidaturaService) {
        this.candidaturaService = candidaturaService;
    }

    @GetMapping
    public List<Candidatura> listar() {
        return candidaturaService.listarCandidaturas();
    }
}
