package fr.carrefourkata.dao;

import fr.carrefourkata.entity.Product;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends CrudRepository<Product, Long> {

}
