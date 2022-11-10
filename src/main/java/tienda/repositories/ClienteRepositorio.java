package tienda.repositories;
import java.util.LinkedList;
import tienda.Lab3_Pregunta3.*;


import tienda.Lab3_Pregunta3.ClienteFlyweight;
import tienda.models.Cliente;

import java.util.List;

public interface ClienteRepositorio {

    void create(Cliente cliente);

    Cliente find(String id);

    List<Cliente> findAll();

    Cliente update(Cliente post, String id);

    void delete(String id);

}