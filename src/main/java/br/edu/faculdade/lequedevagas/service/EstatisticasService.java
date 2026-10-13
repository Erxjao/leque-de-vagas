package br.edu.faculdade.lequedevagas.service;

import br.edu.faculdade.lequedevagas.Repository.VagaRepository;
import br.edu.faculdade.lequedevagas.model.Estatisticas;
import br.edu.faculdade.lequedevagas.model.Vaga;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class EstatisticasService {

    private final VagaRepository vagaRepository;

    public EstatisticasService(VagaRepository vagaRepository) {
        this.vagaRepository = vagaRepository;
    }

    public Estatisticas calcular() {
        List<Vaga> vagas = vagaRepository.todas();
        Map<String, Long> porArea = vagas.stream()
                .collect(Collectors.groupingBy(Vaga::area, LinkedHashMap::new, Collectors.counting()));
        Map<String, Long> porSenioridade = vagas.stream()
                .collect(Collectors.groupingBy(Vaga::senioridade, LinkedHashMap::new, Collectors.counting()));

        return new Estatisticas(
                vagas.size(),
                vagas.stream().filter(Vaga::aceitaIniciante).count(),
                porArea,
                porSenioridade
        );
    }
}
