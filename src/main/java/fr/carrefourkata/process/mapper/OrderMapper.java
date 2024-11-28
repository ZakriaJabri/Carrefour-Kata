package fr.carrefourkata.process.mapper;

import fr.carrefourkata.dto.OrderDTO;
import fr.carrefourkata.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    OrderDTO orderToOrderDto (Order order);

    Order orderDtoToOrder (OrderDTO orderDTO);


}
