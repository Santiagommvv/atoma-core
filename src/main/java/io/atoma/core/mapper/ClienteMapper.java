package io.atoma.core.mapper;

import io.atoma.core.dominio.entity.Cliente;
import io.atoma.core.dto.CrearClienteRequest;
import io.atoma.core.dto.ClienteDto;

public interface ClienteMapper {
    Cliente toEntity(CrearClienteRequest request);
    ClienteDto toDto(Cliente response);
    CrearClienteRequest from(ClienteDto response);

}

