package io.atoma.core.service;

import io.atoma.core.dto.CrearClienteRequest;
import io.atoma.core.dto.ClienteDto;

public interface ClienteService {

    ClienteDto crearCliente(CrearClienteRequest request);
}
