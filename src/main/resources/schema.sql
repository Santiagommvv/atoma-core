###
tengo que actualizar valores segun entidad
###

CREATE TABLE clientes (
    id UUID PRIMARY KEY,
    nombre VARCHAR(120),
    email VARCHAR(254),
    telefono VARCHAR(20),
    status_cliente VARCHAR(16),
    categoria_cliente VARCHAR(16),
    created_at TIMESTAMP,
    modified_at TIMESTAMP,
    notas VARCHAR(500)
);