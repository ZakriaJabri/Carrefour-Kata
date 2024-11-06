package fr.carrefourkata.service;

import fr.carrefourkata.dao.ProductRepository;
import fr.carrefourkata.entity.Product;
import fr.carrefourkata.process.mapper.ProductMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {


    private final ProductRepository productRepository;


    public ProductServiceImpl(ProductMapper productMapper, ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public List<Product> getAllProducts() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public Optional<Product> getProduct(int productId) {
        return Optional.of(productRepository.findById((long) productId).orElseThrow());
    }

    @Override
    public void deleteProduct(Product product) {
         productRepository.delete(product);
    }

    @Override
    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public Boolean ifExistProduct(int productId) {
        if (productRepository.existsById((long) productId)) {
            return true;
        }else{
            return false;
        }
    }
}
