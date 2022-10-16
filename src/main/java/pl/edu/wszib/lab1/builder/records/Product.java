package pl.edu.wszib.lab1.builder.records;

import java.util.Objects;

public final class Product {
    private final String description;
    private final String price;

    public Product(String description, String price) {
        this.description = description;
        this.price = price;
    }

    public String description() {
        return description;
    }

    public String price() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Product) obj;
        return Objects.equals(this.description, that.description) &&
                Objects.equals(this.price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, price);
    }

    @Override
    public String toString() {
        return "Product[" +
                "description=" + description + ", " +
                "price=" + price + ']';
    }

}
