package controllers;


import entity.Users;
import entity.Products;
import entity.Carrito;
import repositories.ProductsRepository;
import repositories.UsersRepository;
import repositories.CarritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Echocontroller {

    @Autowired
    ProductsRepository productsRepositoryRepository;

    @Autowired
    UsersRepository usersRepositoryRepository;

    @GetMapping("echo")
    public String echo(){

        Products product = new Products();
        product.setNameProduct("Bicicleta");
        product.setPrice(product.getPrice());
        //ProductsRepository.save(product);

        Users user = new Users();
        user.setID(user.getID());
        user.setName(user.getName());
        //UsersRepository.save(user);

        Carrito carrito= new Carrito();
        carrito.setCantidad(carrito.getCantidad());
        carrito.setNameProduct(product.getNameProduct());
        //carritoRepository.save(carrito);

        return "echo";
    }

}

