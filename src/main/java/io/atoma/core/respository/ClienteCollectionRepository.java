package io.atoma.core.respository;

import io.atoma.core.models.Cliente;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ClienteCollectionRepository {

    private final List<Cliente> clientes = new ArrayList<>();

    public  ClienteCollectionRepository(){}

    public List<Cliente> findAll(){
        return clientes;
    }

    public Optional<Cliente> findById(Integer id){
        return clientes.stream().filter(cl -> cl.id().equals(id)).findFirst();
    }
}
