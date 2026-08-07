package io.atoma.core.dto;

import io.atoma.core.dominio.entity.CategoriaCliente;
import io.atoma.core.dominio.entity.StatusCliente;

import java.util.UUID;
import java.time.Instant;

//como body del post tengo t-odo-
public record CrearClienteResponse(
        UUID id,
        String nombre,
        String email,
        String telefono,
        CategoriaCliente categoriaCliente,
        StatusCliente statusCliente,
        Instant createdAt,
        Instant modifiedAt,
        String notas
) {
}
