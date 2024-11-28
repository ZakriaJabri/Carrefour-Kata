package fr.carrefourkata.dto;

import fr.carrefourkata.entity.Category;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;


public class ProductDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idProduct;
    private String code;
    private String name;
    private String description;
    private String image;
    private CategoryDTO category;
    private float price;
    private int quantity;
    private String internalReference;
    private Long shellId;
    private String inventoryStatus;
    private int rating;
    private Long order_id;
    private LocalDateTime  createdAt;
    private LocalDateTime updatedAt;

    public ProductDto() {

    }

    public ProductDto(String code, String name, String description, String image, CategoryDTO category, float price, int quantity, String internalReference, Long shellId, String inventoryStatus, int rating, Long order_id, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.image = image;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.internalReference = internalReference;
        this.shellId = shellId;
        this.inventoryStatus = inventoryStatus;
        this.rating = rating;
        this.order_id = order_id;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public CategoryDTO getCategory() {
        return category;
    }

    public void setCategory(CategoryDTO category) {
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

    public String getInternalReference() {
        return internalReference;
    }

    public void setInternalReference(String internalReference) {
        this.internalReference = internalReference;
    }

    public Long getShellId() {
        return shellId;
    }

    public void setShellId(Long shellId) {
        this.shellId = shellId;
    }

    public String getInventoryStatus() {
        return inventoryStatus;
    }

    public void setInventoryStatus(String inventoryStatus) {
        this.inventoryStatus = inventoryStatus;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
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
        if (!(o instanceof ProductDto that)) return false;
        return Float.compare(that.price, price) == 0 && quantity == that.quantity && rating == that.rating && Objects.equals(code, that.code) && Objects.equals(name, that.name) && Objects.equals(description, that.description) && Objects.equals(image, that.image) && Objects.equals(category, that.category) && Objects.equals(internalReference, that.internalReference) && Objects.equals(shellId, that.shellId) && Objects.equals(inventoryStatus, that.inventoryStatus) && Objects.equals(order_id, that.order_id) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, description, image, category, price, quantity, internalReference, shellId, inventoryStatus, rating, order_id, createdAt, updatedAt);
    }
}
