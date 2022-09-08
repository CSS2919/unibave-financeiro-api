package br.com.unibave.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boletos")
public class boletoController {

    @PutMapping
    public String consulta() {
        return "Juros atualizados co sucesso !";
    }

    @PostMapping
    public String calculandojuros() {
        return "Calclando juros ...";
    }
}
