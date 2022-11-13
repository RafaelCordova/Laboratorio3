package tienda.controllers;

import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;

<<<<<<< HEAD

public interface CustomerController {
    
    void create(@NotNull Context context);    
=======
public interface CustomerController {
    void create(@NotNull Context context);
>>>>>>> 831e962f4cbcb481952f4526c3cdd0402f4aa8ec

    void find(@NotNull Context context);

    void findAll(@NotNull Context context);

    void update(@NotNull Context context);

    void delete(@NotNull Context context);
<<<<<<< HEAD
    
=======
>>>>>>> 831e962f4cbcb481952f4526c3cdd0402f4aa8ec
}