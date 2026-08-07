package io.atoma.core.controller;

import io.atoma.core.dto.CrearClienteRequest;
import io.atoma.core.dto.ClienteDto;
import io.atoma.core.service.ClienteService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteController {

    private final ClienteService clienteService;


    public ClienteController(ClienteService clienteService){
        this.clienteService = clienteService;
    }

    @PostMapping
    public ClienteDto crearCliente(CrearClienteRequest request){
        return null;
    }

}



