package br.edu.faculdade.lequedevagas.controller;

import br.edu.faculdade.lequedevagas.model.Vaga;
import br.edu.faculdade.lequedevagas.service.VagaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vagas")
public class VagaController {

    private final VagaService vagaService;

    public VagaController(VagaService vagaService) {
        this.vagaService = vagaService;
    }

    @GetMapping
    public List<Vaga> listar() {
        return vagaService.listar();
    }

    @GetMapping("/{id}")
    public List<Vaga> buscarPorId(@PathVariable String id) {
        return vagaService.buscarPorId(id);
    }
}
