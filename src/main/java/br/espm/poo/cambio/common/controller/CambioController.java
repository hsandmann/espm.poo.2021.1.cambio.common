package br.espm.poo.cambio.common.controller;

import br.espm.poo.cambio.common.datatype.Cotacao;
import br.espm.poo.cambio.common.datatype.Moeda;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("cambio-service")
public interface CambioController {

    @GetMapping("/moedas")
    List<Moeda> moedas();

    @GetMapping("/moedas/{simbolo}")
    List<Moeda> moedas(String simbolo);

    @GetMapping("/cotacoes/{id}")
    Cotacao cotacao(String id);

    @GetMapping("/cotacoes")
    List<Cotacao> cotacoes(
            @RequestParam String simbolo,
            @RequestParam String ini,
            @RequestParam String fim
    );

}
