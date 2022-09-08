package br.com.unibave.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cobranca")
public class cobrancaController {

    @PutMapping
    public String consulta() {
        return "Cliente sem pendencias!";
    }

    @PostMapping
    public String executaCobranca() {
        return "Email enviado com sucesso ...";
    }
}