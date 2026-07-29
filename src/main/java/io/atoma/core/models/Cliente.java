package io.atoma.core.models;

import java.time.LocalDateTime;

public record Cliente(
        //@Id
        Integer id,
        String nombre,
        String email,
        String docNumero,
        StatusCliente status,
        CategoriaCliente categoria,
        LocalDateTime creadoAt,
        LocalDateTime modificadoAt,
        String notas
) {

}
