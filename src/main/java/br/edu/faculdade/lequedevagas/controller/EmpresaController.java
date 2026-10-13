package br.edu.faculdade.lequedevagas.controller;

import br.edu.faculdade.lequedevagas.model.Empresa;
import br.edu.faculdade.lequedevagas.service.EmpresaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {
    private final EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService) { this.empresaService = empresaService; }

    @GetMapping
    public List<Empresa> listar() { return empresaService.listar(); }

    @GetMapping("/{slug}")
    public Empresa buscarPorSlug(@PathVariable String slug) { return empresaService.buscarPorSlug(slug); }
}
