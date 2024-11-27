package fr.carrefourkata.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

public class OrderDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idOrder;
    private Date orderDate;
    private Set<ProductDto> products;

    public OrderDTO() {
    }

    public OrderDTO(Date orderDate, Set<ProductDto> products) {
        this.orderDate = orderDate;
        this.products = products;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Set<ProductDto> getProducts() {
        return products;
    }

    public void setProducts(Set<ProductDto> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderDTO oderDTO)) return false;
        return Objects.equals(orderDate, oderDTO.orderDate) && Objects.equals(products, oderDTO.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderDate, products);
    }
}
