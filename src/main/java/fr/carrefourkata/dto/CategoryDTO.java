package fr.carrefourkata.dto;

import fr.carrefourkata.entity.Product;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

public class CategoryDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idCategory;
    private String name;
    private Set<Product> products;

    public CategoryDTO() {
    }

    public CategoryDTO(String name, Set<Product> products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        if (!(o instanceof CategoryDTO that)) return false;
        return Objects.equals(name, that.name) && Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, products);
    }
}
