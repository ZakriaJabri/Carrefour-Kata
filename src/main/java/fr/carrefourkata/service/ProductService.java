package fr.carrefourkata.service;

import fr.carrefourkata.dto.ProductDto;
import fr.carrefourkata.entity.Product;
import jakarta.validation.constraints.NotBlank;
import org.apache.kafka.clients.consumer.ConsumerRecord;

import java.util.List;
import java.util.Optional;

public interface ProductService {


    List<Product> getAllProducts();

    Optional<Product> getProduct(int productId);

    void deleteProduct(Product product);

    void saveProduct(Product product);

    Boolean ifExistProduct(int productId);

  //  String onMessageProduct (ConsumerRecord messageProduit);
}
