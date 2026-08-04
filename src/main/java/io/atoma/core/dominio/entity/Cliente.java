package io.atoma.core.dominio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "clientes")
public class Cliente
{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;
    //id UUID PRIMARY KEY,

    @Column(name = "nombre", nullable = false)
    private String nombre;
    //    nombre VARCHAR(120), debería cubrir 99,9% de los nombres completos globales

    @Column(name = "email")
    private String email;
    //    email VARCHAR(254),  RFC 5321

    @Column(name = "telefono")
    private String telefono;
    //    telefono VARCHAR(20), E.164 dice 15, agrego un poco más para seguridad

    @Enumerated(EnumType.STRING)
    @Column(name = "status_cliente",  nullable = false)
    private StatusCliente status;
    //    status VARCHAR(16),

    @Enumerated(EnumType.STRING)
    @Column(name = "categoria_cliente", nullable = false)
    private CategoriaCliente categoria;
    //    categoria_cliente VARCHAR(16),

    @Column(name = "created_at", updatable = false, nullable = false)
    private LocalDateTime createdAt;
    //    creado_at TIMESTAMP,

    @Column(name = "modified_at")
    private LocalDateTime modifiedAt;
    //    modificado_at TIMESTAMP,

    //    notas VARCHAR(500)
    @Column(name = "notas", length=500)
    private String notas;

    //constructores
    public Cliente(){}

    public Cliente(UUID id, String nombre, String email, String telefono, StatusCliente status, CategoriaCliente categoria, LocalDateTime createdAt, LocalDateTime modifiedAt, String notas) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.status = status;
        this.categoria = categoria;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.notas = notas;
    }

    //getters y setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public StatusCliente getStatus() {
        return status;
    }

    public void setStatus(StatusCliente status) {
        this.status = status;
    }

    public CategoriaCliente getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaCliente categoria) {
        this.categoria = categoria;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(LocalDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    //equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", status=" + status +
                ", categoria=" + categoria +
                ", createdAt=" + createdAt +
                ", modifiedAt=" + modifiedAt +
                ", notas='" + notas + '\'' +
                '}';
    }
}
