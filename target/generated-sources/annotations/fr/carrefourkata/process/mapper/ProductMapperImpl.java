package fr.carrefourkata.process.mapper;

import fr.carrefourkata.dto.ProductDto;
import fr.carrefourkata.entity.Product;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-06T15:11:06+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.13 (Eclipse Adoptium)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product productDtoToProduct(ProductDto productDto) {
        if ( productDto == null ) {
            return null;
        }

        Product product = new Product();

        product.setUpdatedAt( productDto.getUpdatedAt() );
        product.setCreatedAt( productDto.getCreatedAt() );
        product.setRating( productDto.getRating() );
        product.setInventoryStatus( productDto.getInventoryStatus() );
        product.setShellId( productDto.getShellId() );
        product.setInternalReference( productDto.getInternalReference() );
        product.setQuantity( productDto.getQuantity() );
        product.setPrice( productDto.getPrice() );
        product.setCategory( productDto.getCategory() );
        product.setImage( productDto.getImage() );
        product.setDescription( productDto.getDescription() );
        product.setName( productDto.getName() );
        product.setCode( productDto.getCode() );

        return product;
    }

    @Override
    public ProductDto productToProductDto(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDto productDto = new ProductDto();

        productDto.setUpdatedAt( product.getUpdatedAt() );
        productDto.setCreatedAt( product.getCreatedAt() );
        productDto.setRating( product.getRating() );
        productDto.setInventoryStatus( product.getInventoryStatus() );
        productDto.setShellId( product.getShellId() );
        productDto.setInternalReference( product.getInternalReference() );
        productDto.setQuantity( product.getQuantity() );
        productDto.setPrice( product.getPrice() );
        productDto.setCategory( product.getCategory() );
        productDto.setImage( product.getImage() );
        productDto.setDescription( product.getDescription() );
        productDto.setName( product.getName() );
        productDto.setCode( product.getCode() );

        return productDto;
    }

    @Override
    public List<ProductDto> productListToProductDtoList(Iterable<Product> productList) {
        if ( productList == null ) {
            return null;
        }

        List<ProductDto> list = new ArrayList<ProductDto>();
        for ( Product product : productList ) {
            list.add( productToProductDto( product ) );
        }

        return list;
    }
}
