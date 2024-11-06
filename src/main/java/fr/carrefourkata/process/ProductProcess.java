package fr.carrefourkata.process;

import fr.carrefourkata.dto.ProductDto;

import java.util.List;

public interface ProductProcess {

    List<ProductDto> getAllProducts();

    void addProduct(ProductDto product);

    ProductDto getProduct(int productId);

    void deleteProduct(int productId);

    void updateProduct(int productId, ProductDto product);
}

