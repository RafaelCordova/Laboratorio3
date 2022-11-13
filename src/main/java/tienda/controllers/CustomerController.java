package tienda.controllers;

import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34

public interface CustomerController {
    
    void create(@NotNull Context context);    
<<<<<<< HEAD
=======
public interface CustomerController {
    void create(@NotNull Context context);
>>>>>>> 831e962f4cbcb481952f4526c3cdd0402f4aa8ec
=======
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34

    void find(@NotNull Context context);

    void findAll(@NotNull Context context);

    void update(@NotNull Context context);

    void delete(@NotNull Context context);
<<<<<<< HEAD
<<<<<<< HEAD
    
=======
>>>>>>> 831e962f4cbcb481952f4526c3cdd0402f4aa8ec
=======
    
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
}