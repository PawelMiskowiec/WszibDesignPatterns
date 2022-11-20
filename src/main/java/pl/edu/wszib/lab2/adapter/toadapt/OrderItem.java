package pl.edu.wszib.lab2.adapter.toadapt;

import java.math.BigDecimal;

public class OrderItem {
    private final ProductId productId;
    private final BigDecimal quantity;
    private final BigDecimal price;

    public OrderItem(ProductId productId, BigDecimal quantity, BigDecimal price) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    public ProductId getProductId() {
        return productId;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
