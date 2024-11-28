package fr.carrefourkata.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "product")
@EntityListeners(AuditingEntityListener.class)
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduct;
    private String code;
    private String name;
    private String description;
    @ManyToOne
    @JoinColumn(name = "category", nullable = false)
    private Category category;
    private float price;
    private int quantity;
    private String inventoryStatus;
    private Long idOrder;
    @CreatedDate
    @Column(name = "createdAt", updatable = false)
    private LocalDateTime  createdAt;
    @LastModifiedDate
    @Column(name = "updatedAt")
    private LocalDateTime updatedAt;

    public Product() {
    }

    public Product(String code, String name, String description, Category category, float price, int quantity, String inventoryStatus, Long idOrder, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.inventoryStatus = inventoryStatus;
        this.idOrder = idOrder;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getInventoryStatus() {
        return inventoryStatus;
    }

    public void setInventoryStatus(String inventoryStatus) {
        this.inventoryStatus = inventoryStatus;
    }

    public Long getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Long idOrder) {
        this.idOrder = idOrder;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Float.compare(product.price, price) == 0 && quantity == product.quantity && Objects.equals(code, product.code) && Objects.equals(name, product.name) && Objects.equals(description, product.description) && Objects.equals(category, product.category) && Objects.equals(inventoryStatus, product.inventoryStatus) && Objects.equals(idOrder, product.idOrder) && Objects.equals(createdAt, product.createdAt) && Objects.equals(updatedAt, product.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, description, category, price, quantity, inventoryStatus, idOrder, createdAt, updatedAt);
    }
}
