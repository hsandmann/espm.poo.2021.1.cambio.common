package br.espm.poo.cambio.common.controller;

import br.espm.poo.cambio.common.datatype.Cotacao;
import br.espm.poo.cambio.common.datatype.Moeda;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("cambio-service")
public interface CambioController {

    @GetMapping("/moedas")
    List<Moeda> moedas();

    @GetMapping("/cotacoes/{id}")
    Cotacao cotacao(String id);

    @GetMapping("/cotacoes/{moeda}")
    List<Cotacao> cotacoes(String moeda);

}
