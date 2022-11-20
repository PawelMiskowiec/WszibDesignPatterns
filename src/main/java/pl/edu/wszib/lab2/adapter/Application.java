package pl.edu.wszib.lab2.adapter;

import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;
import pl.edu.wszib.lab2.adapter.toadapt.Order;
import pl.edu.wszib.lab2.adapter.toadapt.OrderId;
import pl.edu.wszib.lab2.adapter.toadapt.OrderItem;
import pl.edu.wszib.lab2.adapter.toadapt.ProductId;

public class Application {

    public static void main(String[] args) {
        Order order = new Order(
                new OrderId(UUID.randomUUID().toString()),
                Set.of(
                        new OrderItem(new ProductId(UUID.randomUUID().toString()), BigDecimal.valueOf(1), BigDecimal.valueOf(1)),
                        new OrderItem(new ProductId(UUID.randomUUID().toString()), BigDecimal.valueOf(10), BigDecimal.valueOf(3)),
                        new OrderItem(new ProductId(UUID.randomUUID().toString()), BigDecimal.valueOf(7), BigDecimal.valueOf(5))
                )
        );

        OrderService orderService = new OrderService();

        OrderAdapter orderAdapter = new OrderAdapter(orderService);
        orderAdapter.handle(order);
    }
}
