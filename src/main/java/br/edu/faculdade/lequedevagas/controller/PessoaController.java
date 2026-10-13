package br.edu.faculdade.lequedevagas.controller;

import br.edu.faculdade.lequedevagas.model.Pessoa;
import br.edu.faculdade.lequedevagas.service.PessoaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
    private final PessoaService pessoaService;
    public PessoaController(PessoaService pessoaService) { this.pessoaService = pessoaService; }
    @GetMapping public List<Pessoa> listar() { return pessoaService.listar(); }
    @GetMapping("/{id}") public List<Pessoa> buscarPorId(@PathVariable String id) { return pessoaService.buscarPorId(id); }
}
