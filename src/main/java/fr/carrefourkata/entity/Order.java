package fr.carrefourkata.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrder;
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;
    @ManyToMany
    @JoinTable(name = "order_products", joinColumns = @JoinColumn(name = "order_id"), inverseJoinColumns = @JoinColumn(name = "product_id"))
    private Set<Product> products;

    public Order() {
    }

    public Order(Date orderDate, Set<Product> products) {
        this.orderDate = orderDate;
        this.products = products;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order oder)) return false;
        return Objects.equals(orderDate, oder.orderDate) && Objects.equals(products, oder.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderDate, products);
    }
}

