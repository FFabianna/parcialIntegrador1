package repositories;

import entity.Products;


import org.springframework.data.repository.CrudRepository;

public interface ProductsRepository extends CrudRepository<Products, Long> {

}