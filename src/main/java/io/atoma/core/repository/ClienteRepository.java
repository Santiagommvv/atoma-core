package io.atoma.core.repository;

import io.atoma.core.dominio.entity.Cliente;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Profile("prod")
@Repository
public interface ClienteRepository extends JpaRepository<UUID, Cliente> {


}
