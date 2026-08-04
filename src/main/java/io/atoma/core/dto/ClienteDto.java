package io.atoma.core.dto;

import io.atoma.core.dominio.entity.CategoriaCliente;
import io.atoma.core.dominio.entity.StatusCliente;

import java.time.LocalDateTime;
import java.util.UUID;

public record ClienteDto(
        UUID id,
        String nombre,
        String email,
        String numeroDocumento,
        StatusCliente status,
        CategoriaCliente categoria,
        LocalDateTime creadoAt,
        LocalDateTime modificadoAt,
        String notas
) {

}
