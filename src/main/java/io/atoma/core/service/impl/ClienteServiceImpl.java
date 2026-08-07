package io.atoma.core.service.impl;

import io.atoma.core.dto.CrearClienteRequest;
import io.atoma.core.dto.ClienteDto;
import io.atoma.core.dominio.entity.Cliente;
import io.atoma.core.mapper.ClienteMapper;
import io.atoma.core.repository.ClienteRepository;
import io.atoma.core.service.ClienteService;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;
    private final ClienteMapper clienteMapper;

    public ClienteServiceImpl(ClienteRepository clienteRepository, ClienteMapper clienteMapper){
        this.clienteRepository = clienteRepository;
        this.clienteMapper = clienteMapper;
    }

    //request. cada atributo a ponerle al objeto Cliente que le voy a dar a Response
    @Override
    public ClienteDto crearCliente(CrearClienteRequest request) {
        Instant ahora = Instant.now();
        Cliente cliente;

        //CrearClienteResponse response = new CrearClienteResponse(){

        //}
        return null; //clienteRepository.save(cliente);
    }
}
