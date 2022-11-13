package tienda.repositories;
<<<<<<< HEAD
<<<<<<< HEAD
import java.util.LinkedList;
=======
>>>>>>> 831e962f4cbcb481952f4526c3cdd0402f4aa8ec
=======
import java.util.LinkedList;
import tienda.Lab3_Pregunta3.*;


import tienda.Lab3_Pregunta3.ClienteFlyweight;
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
import tienda.models.Cliente;

import java.util.List;

public interface ClienteRepositorio {

    void create(Cliente cliente);

    Cliente find(String id);

    List<Cliente> findAll();

    Cliente update(Cliente post, String id);

    void delete(String id);
<<<<<<< HEAD
<<<<<<< HEAD

   
=======
>>>>>>> 831e962f4cbcb481952f4526c3cdd0402f4aa8ec
=======

>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
}