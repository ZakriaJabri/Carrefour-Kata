package fr.carrefourkata.process.mapper;

import fr.carrefourkata.dto.ProductDto;
import fr.carrefourkata.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    Product productDtoToProduct(ProductDto productDto);
    ProductDto productToProductDto(Product product);
    List<ProductDto> productListToProductDtoList(List<Product> productList);
}
