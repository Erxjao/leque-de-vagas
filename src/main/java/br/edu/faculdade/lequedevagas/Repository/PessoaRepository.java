package br.edu.faculdade.lequedevagas.Repository;

import br.edu.faculdade.lequedevagas.model.Pessoa;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PessoaRepository {
    private final List<Pessoa> pessoas = List.of(
            new Pessoa("1", "Ana Souza", "ana@exemplo.com", "Front-end", "Júnior"),
            new Pessoa("2", "Bruno Lima", "bruno@exemplo.com", "Back-end", "Pleno"),
            new Pessoa("3", "Carla Melo", "carla@exemplo.com", "Dados", "Estágio"),
            new Pessoa("4", "Diego Alves", "diego@exemplo.com", "Mobile", "Júnior"),
            new Pessoa("5", "Elisa Costa", "elisa@exemplo.com", "Dados", "Pleno"),
            new Pessoa("6", "Felipe Ramos", "felipe@exemplo.com", "Back-end", "Sênior")
    );
    public List<Pessoa> todas() { return pessoas; }
}
