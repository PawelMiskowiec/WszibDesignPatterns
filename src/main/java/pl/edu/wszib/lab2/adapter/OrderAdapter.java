package pl.edu.wszib.lab2.adapter;

import java.util.stream.Collectors;
import pl.edu.wszib.lab2.adapter.toadapt.Order;
import pl.edu.wszib.lab2.adapter.toadapt.OrderId;
import pl.edu.wszib.lab2.adapter.toadapt.OrderItem;

public class OrderAdapter {
    private final OrderService orderService;

    public OrderAdapter(OrderService orderService) {
        this.orderService = orderService;
    }

    public void handle(Order order) {
        pl.edu.wszib.lab2.adapter.Order adaptedOrder = adaptOrder(order);// TODO zad 1 adaptacja niekompatybilnego interfejsu
        orderService.handle(adaptedOrder);
    }

    public pl.edu.wszib.lab2.adapter.Order adaptOrder(Order order) {
        return
            new pl.edu.wszib.lab2.adapter.Order(
                order.getId().getId(),
                order.getItems().stream()
                    .map(orderItem -> adaptOrderItem(orderItem))
                    .collect(Collectors.toList()));
    }

    public pl.edu.wszib.lab2.adapter.OrderId adaptOrderId(OrderId id) {
        return new pl.edu.wszib.lab2.adapter.OrderId(id.getId());
    }

    public pl.edu.wszib.lab2.adapter.OrderItem adaptOrderItem(OrderItem orderItem) {
        return new pl.edu.wszib.lab2.adapter.OrderItem(
            orderItem.getProductId().getId(),
            orderItem.getQuantity(),
            orderItem.getPrice()
        );
    }
}
