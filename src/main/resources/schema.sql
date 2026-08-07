###
tengo que actualizar valores segun entidad
###

CREATE TABLE clientes (
    id UUID PRIMARY KEY NOT NULL,
    nombre VARCHAR(120) NOT NULL,
    email VARCHAR(254) NOT NULL,
    telefono VARCHAR(20),
    status_cliente VARCHAR(16) NOT NULL,
    categoria_cliente VARCHAR(16) NOT NULL,
    created_at TIMESTAMP NOT NULL,
    modified_at TIMESTAMP,
    notas VARCHAR(500)
);