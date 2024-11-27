package fr.carrefourkata.process;

import fr.carrefourkata.dto.ProductDto;
import fr.carrefourkata.entity.Product;
import fr.carrefourkata.process.mapper.ProductMapper;
import fr.carrefourkata.service.ProductService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


@Service
public class ProductProcessImpl implements ProductProcess {

    private final ProductService productService;

    private final ProductMapper productMapper;


    public ProductProcessImpl(ProductService productService, ProductMapper productMapper) {
        this.productService = productService;
        this.productMapper = productMapper;
    }


    @Override
    public List<ProductDto> getAllProducts() {
        List<Product> productList = productService.getAllProducts() ;
        return productMapper.productListToProductDtoList(productList) ;
    }


    @Override
    public void addProduct(ProductDto productDto) {
        Product product = productMapper.productDtoToProduct(productDto);
        product.setCreatedAt(LocalDateTime.now());
        productService.saveProduct(product);

    }

    @Override
    public ProductDto getProduct(int productId) {
       Optional<Product> product = productService.getProduct(productId);
        return productMapper.productToProductDto(product.get());
    }

    @Override
    public void deleteProduct(int id) {
        Optional<Product> product = productService.getProduct(id);
         productService.deleteProduct(product.get());

    }

    @Override
    public void updateProduct(int productId, ProductDto product) {
        if(productService.ifExistProduct(productId)){
            Product productDB = productService.getProduct(productId).get();
            Product productPatch = productMapper.productDtoToProduct(product);
            productDB.setCode(productPatch.getCode());
            productDB.setName(productPatch.getName());
            productDB.setDescription(productPatch.getDescription());
            productDB.setImage(productPatch.getImage());
            productDB.setPrice(productPatch.getPrice());
            productDB.setQuantity(productPatch.getQuantity());
            productDB.setInternalReference(productPatch.getInternalReference());
            productDB.setShellId(productPatch.getShellId());
            productDB.setInventoryStatus(productPatch.getInventoryStatus());
            productDB.setRating(productPatch.getRating());
            productDB.setUpdatedAt(LocalDateTime.now());

            productService.saveProduct(productDB);
        }
    }
}
