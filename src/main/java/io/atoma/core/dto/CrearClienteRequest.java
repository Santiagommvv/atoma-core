package io.atoma.core.dto;

import io.atoma.core.dominio.entity.CategoriaCliente;
import io.atoma.core.dominio.entity.StatusCliente;

import java.time.Instant;

public record CrearClienteRequest (
        String nombre,
        String email,
        String telefono,
        StatusCliente status,
        CategoriaCliente categoria,
        Instant createdAt,    //este "tampoco" correspondería
        String notas
){}

