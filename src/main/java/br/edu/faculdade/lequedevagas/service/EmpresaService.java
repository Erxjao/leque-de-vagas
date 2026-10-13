package br.edu.faculdade.lequedevagas.service;

import br.edu.faculdade.lequedevagas.Repository.EmpresaRepository;
import br.edu.faculdade.lequedevagas.model.Empresa;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {
    private final EmpresaRepository empresaRepository;

    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    public List<Empresa> listar() { return empresaRepository.listar(); }

    public Empresa buscarPorSlug(String slug) { return empresaRepository.buscarPorSlug(slug); }
}
