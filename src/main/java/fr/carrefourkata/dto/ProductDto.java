package fr.carrefourkata.dto;

import java.io.Serializable;
import java.time.LocalDateTime;


public class ProductDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String code;
    private String name;
    private String description;
    private String image;
    private String category;
    private float price;
    private int quantity;
    private String internalReference;
    private Long shellId;
    private String inventoryStatus;
    private int rating;
    private LocalDateTime  createdAt;
    private LocalDateTime updatedAt;

    public ProductDto(LocalDateTime  updatedAt, LocalDateTime  createdAt, int rating, String inventoryStatus, Long shellId, String internalReference, int quantity, float price, String category, String image, String description, String name, String code) {
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.rating = rating;
        this.inventoryStatus = inventoryStatus;
        this.shellId = shellId;
        this.internalReference = internalReference;
        this.quantity = quantity;
        this.price = price;
        this.category = category;
        this.image = image;
        this.description = description;
        this.name = name;
        this.code = code;
    }

    public ProductDto() {

    }

    public LocalDateTime  getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime  updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime  getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime  createdAt) {
        this.createdAt = createdAt;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getInventoryStatus() {
        return inventoryStatus;
    }

    public void setInventoryStatus(String inventoryStatus) {
        this.inventoryStatus = inventoryStatus;
    }

    public Long getShellId() {
        return shellId;
    }

    public void setShellId(Long shellId) {
        this.shellId = shellId;
    }

    public String getInternalReference() {
        return internalReference;
    }

    public void setInternalReference(String internalReference) {
        this.internalReference = internalReference;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
