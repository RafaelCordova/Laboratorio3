package tienda;

import io.javalin.Javalin;
import io.javalin.plugin.openapi.OpenApiOptions;
import io.javalin.plugin.openapi.OpenApiPlugin;
import io.javalin.plugin.openapi.ui.SwaggerOptions;
import io.swagger.v3.oas.models.info.Info;

<<<<<<< HEAD
<<<<<<< HEAD


import tienda.Lab3_Pregunta3.ClienteFlyweightMain;
import tienda.Lab3_Pregunta4.controllers.Impl.EntregasControllerImpl;
import tienda.Lab3_Pregunta4.repositories.EntregasRepositorio;
import tienda.Lab3_Pregunta4.repositories.Impl.EntregasRepositorioImpl;

=======
import tienda.Lab3_Pregunta3.ClienteFlyweightMain;
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
import tienda.config.DBConnectionManager;
import tienda.controllers.impl.CustomerControllerImpl;
import tienda.controllers.impl.OrderControllerImpl;
import tienda.controllers.impl.ProductControllerImpl;
import tienda.repositories.impl.ClienteRepositorioImpl;
import tienda.repositories.impl.PedidoRepositorioImpl;
import tienda.repositories.impl.ProductoRepositorioImpl;
<<<<<<< HEAD
=======
import tienda.config.DBConnectionManager;
import tienda.controllers.impl.CustomerControllerImpl;
import tienda.controllers.impl.OrderControllerImpl;
import tienda.repositories.impl.ClienteRepositorioImpl;
import tienda.repositories.impl.PedidoRepositorioImpl;
>>>>>>> 831e962f4cbcb481952f4526c3cdd0402f4aa8ec
=======
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34

public class Main {

    private final DBConnectionManager manager;
    private final CustomerControllerImpl customerController;
    private final OrderControllerImpl orderController;
<<<<<<< HEAD
<<<<<<< HEAD
    private final ProductControllerImpl productController;
    private final EntregasControllerImpl entregaController;
=======
>>>>>>> 831e962f4cbcb481952f4526c3cdd0402f4aa8ec
=======
    private final ProductControllerImpl productController;
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34

    public Main() {
        this.manager = new DBConnectionManager();

        ClienteRepositorioImpl customerRepositoryImpl = new ClienteRepositorioImpl(this.manager.getDatabase());
        this.customerController = new CustomerControllerImpl(customerRepositoryImpl);

        PedidoRepositorioImpl orderRepositoryImpl = new PedidoRepositorioImpl(this.manager.getDatabase());
        this.orderController = new OrderControllerImpl(orderRepositoryImpl, customerRepositoryImpl);

<<<<<<< HEAD
<<<<<<< HEAD
        ProductoRepositorioImpl productRepositoryImpl = new ProductoRepositorioImpl(this.manager.getDatabase()); 
        this.productController = new ProductControllerImpl(productRepositoryImpl);

        EntregasRepositorioImpl entregasRepositorioImpl = new EntregasRepositorioImpl(this.manager.getDatabase());
        this.entregaController = new EntregasControllerImpl(entregasRepositorioImpl);
=======
>>>>>>> 831e962f4cbcb481952f4526c3cdd0402f4aa8ec
=======
        ProductoRepositorioImpl productRepositoryImpl = new ProductoRepositorioImpl(this.manager.getDatabase()); 
        this.productController = new ProductControllerImpl(productRepositoryImpl);
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
    }

    public void startup() {
        Info applicationInfo = new Info()
                .version("1.0")
                .description("Demo API");
        OpenApiOptions openApi = new OpenApiOptions(applicationInfo)
                .path("/api")
                .swagger(new SwaggerOptions("/api-ui")); // endpoint for swagger-ui
<<<<<<< HEAD
<<<<<<< HEAD
        Javalin server = Javalin.create(  
                config -> {
                        config.registerPlugin(new OpenApiPlugin(openApi));
                        config.enableCorsForAllOrigins();
                    }
                    
=======
=======
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
        Javalin server = Javalin.create(
                config -> {
                    config.registerPlugin(new OpenApiPlugin(openApi));
                }
<<<<<<< HEAD
>>>>>>> 831e962f4cbcb481952f4526c3cdd0402f4aa8ec
=======
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
        ).start(7000);

        server.get("api/customer/:id", this.customerController::find);
        server.delete("api/customer/:id", this.customerController::delete);
        server.get("api/customers", this.customerController::findAll);
        server.post("api/customer", this.customerController::create);
<<<<<<< HEAD
<<<<<<< HEAD
      //  server.post("api/customer", this.customerController::createGUI);
        
=======
>>>>>>> 831e962f4cbcb481952f4526c3cdd0402f4aa8ec
=======
      //  server.post("api/customer", this.customerController::createGUI);
        
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34

        server.get("api/order/:id", this.orderController::find);
        server.delete("api/order/:id", this.orderController::delete);
        server.get("api/orders", this.orderController::findAll);
        server.post("api/order", this.orderController::create);
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
        
        server.get("api/product/:id", this.productController::find);
        server.delete("api/product/:id", this.productController::delete);
        server.get("api/products", this.productController::findAll);
        server.post("api/product", this.productController::create);
        
        //server.post("api/order/pay/:id", this.orderController::pay);

<<<<<<< HEAD
        //Entregas
        server.post("api/entrega", this.entregaController::create);
        server.get("api/entregas", this.entregaController::findAll);
=======

        //server.post("api/order/pay/:id", this.orderController::pay);
>>>>>>> 831e962f4cbcb481952f4526c3cdd0402f4aa8ec

=======
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            this.manager.closeDatabase();
            server.stop();
        }));
    }

<<<<<<< HEAD
<<<<<<< HEAD

    public static void main(String[] args) {//4 comentario

        new Main().startup();
     
=======
    public static void main(String[] args) {
        new Main().startup();
        ClienteFlyweightMain.test();
                                }
                                        }
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34

        /*
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Cliente().setVisible(true);
            }
        }); */

<<<<<<< HEAD
    }
                                        }



=======
                    
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
        
        
     
    

<<<<<<< HEAD
=======
    public static void main(String[] args) {
        new Main().startup();
    }
}
>>>>>>> 831e962f4cbcb481952f4526c3cdd0402f4aa8ec
=======
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
