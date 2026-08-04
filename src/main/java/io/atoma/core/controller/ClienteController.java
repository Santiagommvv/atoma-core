package io.atoma.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/listarClientes")
public class ClienteController {

    @GetMapping(value = "/raw", produces = "application/json")
    public String test() throws Exception {
        return new String(
                getClass()
                        .getClassLoader()
                        .getResourceAsStream("data.json")
                        .readAllBytes()
        );
    }

    @Autowired
    JdbcTemplate jdbc;

    @GetMapping(produces = "application/json")
    public List<Map<String, Object>> getAll() {
        return jdbc.queryForList("SELECT * FROM cliente");
    }
}
    /*private final ClienteCollectionRepository clienteCollectionRepository;



    @GetMapping("/api/v1/listar")
    public List<Cliente> listarClientes(ClienteCollectionRepository clienteCollectionRepository){
        return clienteCollectionRepository.findAll();
    }*/

