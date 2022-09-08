package br.com.unibave.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compra")
public class compraController {

    @PostMapping
    public String efetuacompra() {
        return "Verificando dados do Comprador...";
    }

    @PutMapping
    public String ValidaCartao() {
        return "Cartao OK, compra realizada !";
    }



}
