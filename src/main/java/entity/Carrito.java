package entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "carrito")

public class Carrito{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int cantidad;
    private String nameProduct;

    @OneToMany(mappedBy = "carrito") //Nombre de la clase
    @JsonIgnore
    private List<Products> products;

    public List<Products> getProducts() {
        return products;
    }

    public void setCourses(List<Products> courses) {
        this.products = products;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }





}

