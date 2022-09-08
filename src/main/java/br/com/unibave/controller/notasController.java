package br.com.unibave.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notas")
public class notasController {

    @PostMapping
    public String lancar() {
        return "NFE em Processamento...";
    }

    @PutMapping
    public String nootificaPagamento() {
        return "NFE: 154447";
    }



}
