package fr.carrefourkata.controller;

import fr.carrefourkata.dto.ProductDto;
import fr.carrefourkata.entity.Product;
import jakarta.validation.constraints.NotBlank;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

public interface ProductController {


    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<ProductDto>> getAllProducts();

    @ResponseStatus(HttpStatus.CREATED)
    ResponseEntity<Void> creatProduct(@RequestBody ProductDto productDto);

    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<ProductDto> getProduct(@PathVariable int productId);

    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<Void> deleteProduct(@PathVariable int productId);

    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<Void> updateProduct(@PathVariable int productId, @RequestBody ProductDto productDto);

    ResponseEntity<String> publishMessage(@PathVariable String messageProduit);
}
