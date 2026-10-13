package br.edu.faculdade.lequedevagas.service;

import br.edu.faculdade.lequedevagas.Repository.PessoaRepository;
import br.edu.faculdade.lequedevagas.model.Pessoa;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {
    private final PessoaRepository pessoaRepository;
    public PessoaService(PessoaRepository pessoaRepository) { this.pessoaRepository = pessoaRepository; }
    public List<Pessoa> listar() { return pessoaRepository.todas(); }
    public List<Pessoa> buscarPorId(String id) { return pessoaRepository.todas().stream().filter(pessoa -> pessoa.id().equals(id)).toList(); }
}
