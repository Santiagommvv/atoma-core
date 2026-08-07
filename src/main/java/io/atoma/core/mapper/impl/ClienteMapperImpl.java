package io.atoma.core.mapper.impl;

import io.atoma.core.dominio.entity.Cliente;
import io.atoma.core.dto.CrearClienteRequest;
import io.atoma.core.dto.ClienteDto;
import io.atoma.core.mapper.ClienteMapper;

//a chequear qué pasó en esta autoasignación recursiva

public class ClienteMapperImpl implements ClienteMapper {

    @Override
    public Cliente toEntity(CrearClienteRequest request) {
        return new Cliente(
                null,
                request.nombre(),
                request.email(),
                request.telefono(),
                request.status(),
                request.categoria(),
                request.createdAt(),
                null,
                request.notas()
        );
    }

    @Override
    public ClienteDto toDto(Cliente response) {
        return new ClienteDto(
                response.getNombre(),
                response.getEmail(),
                response.getTelefono(),
                response.getStatus(),
                response.getCategoria(),
                response.getCreatedAt(),
                response.getNotas()
        );
    }

    @Override
    public CrearClienteRequest from(ClienteDto response) {
        //algo estilo...
        //new ClienteDto dto
        //CrearClienteRequest dto = dto.toDto(respuesta)
        //¿?
        return null;
    }
}
