package tienda.controllers.impl;

<<<<<<< HEAD
=======
import tienda.Lab3_Pregunta3.ClienteFlyweight;
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
import tienda.config.Paths;
//import tienda.config.Paths;
import tienda.controllers.CustomerController;
import tienda.models.Cliente;
import tienda.repositories.ClienteRepositorio;
import io.javalin.http.Context;
import io.javalin.http.BadRequestResponse;
import io.javalin.http.NotFoundResponse;
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
import java.util.LinkedList;
import java.util.List;
//import org.bson.types.ObjectId;
import org.eclipse.jetty.http.HttpHeader;
import org.eclipse.jetty.http.HttpStatus;
import tienda.InterfazCliente.GUI_Cliente;

public class CustomerControllerImpl implements CustomerController {
    
<<<<<<< HEAD
=======
//import org.bson.types.ObjectId;
import org.eclipse.jetty.http.HttpHeader;
import org.eclipse.jetty.http.HttpStatus;


public class CustomerControllerImpl implements CustomerController {
>>>>>>> 831e962f4cbcb481952f4526c3cdd0402f4aa8ec
=======
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
    private static final String ID = "id";

    private ClienteRepositorio customerRepository;

    public CustomerControllerImpl(ClienteRepositorio custRepository) {
        this.customerRepository = custRepository;
    }

    @Override
<<<<<<< HEAD
    public void create(Context context) {
<<<<<<< HEAD
=======
    public void  create(Context context) {
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
                   
    Cliente customer = context.bodyAsClass(Cliente.class);
      customerRepository.create(customer);
        
        context.status(HttpStatus.CREATED_201)
<<<<<<< HEAD
                .header(HttpHeader.LOCATION.name(), Paths.formatPostLocation(customer.getId()));
        
    }
       
=======

        Cliente customer = context.bodyAsClass(Cliente.class);
        System.out.println("Cliente: " + customer);

        //if (customer.getId() != null) {
        //    throw new BadRequestResponse(String.format("Unable to create a new post with existing id: %s", customer));
        //}

        customerRepository.create(customer);
        context.status(HttpStatus.CREATED_201)
                .header(HttpHeader.LOCATION.name(), Paths.formatPostLocation(customer.getId().toString()));

    }

>>>>>>> 831e962f4cbcb481952f4526c3cdd0402f4aa8ec
    @Override
    public void delete(Context context) {
        customerRepository.delete(context.pathParam(ID));

    }
=======
               .header(HttpHeader.LOCATION.name(), Paths.formatPostLocation(customer.getId()));

                                            }

    @Override
    public void delete(Context context) {
        customerRepository.delete(context.pathParam(ID));
                            }
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34

    @Override
    public void find(Context context) {
        String id = context.pathParam(ID);
        Cliente customer = customerRepository.find(id);

        if (customer == null) {
            throw new NotFoundResponse(String.format("A customer with id '%s' is not found", id));
        }
<<<<<<< HEAD

        context.json(customer);

    }
=======
        context.json(customer);
                                    }
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34

    @Override
    public void findAll(Context context) {
        context.json(customerRepository.findAll());
    }

    @Override
    public void update(Context context) {
<<<<<<< HEAD
        Cliente customer = context.bodyAsClass(Cliente.class);
=======
        ClienteFlyweight customer = context.bodyAsClass(ClienteFlyweight.class);
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
        String id = context.pathParam(ID);

        if (customer.getId() != null && !customer.getId().toString().equals(id)) {
            throw new BadRequestResponse("Id update is not allowed");
        }
<<<<<<< HEAD

        customerRepository.update(customer, id);

    }

<<<<<<< HEAD
   

=======
>>>>>>> 831e962f4cbcb481952f4526c3cdd0402f4aa8ec
=======
        customerRepository.update(customer, id);

                                         }

>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
}