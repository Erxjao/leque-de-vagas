package br.edu.faculdade.lequedevagas.controller;

import br.edu.faculdade.lequedevagas.model.Estatisticas;
import br.edu.faculdade.lequedevagas.service.EstatisticasService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estatisticas")
public class EstatisticasController {

    private final EstatisticasService estatisticasService;

    public EstatisticasController(EstatisticasService estatisticasService) {
        this.estatisticasService = estatisticasService;
    }

    @GetMapping
    public Estatisticas calcular() {
        return estatisticasService.calcular();
    }
}
