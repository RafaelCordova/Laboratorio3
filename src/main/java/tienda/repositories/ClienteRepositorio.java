package tienda.repositories;
<<<<<<< HEAD
import java.util.LinkedList;
=======
>>>>>>> 831e962f4cbcb481952f4526c3cdd0402f4aa8ec
import tienda.models.Cliente;

import java.util.List;

public interface ClienteRepositorio {

    void create(Cliente cliente);

    Cliente find(String id);

    List<Cliente> findAll();

    Cliente update(Cliente post, String id);

    void delete(String id);
<<<<<<< HEAD

   
=======
>>>>>>> 831e962f4cbcb481952f4526c3cdd0402f4aa8ec
}