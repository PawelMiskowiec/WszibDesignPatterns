package pl.edu.wszib.lab4.order;

import pl.edu.wszib.lab4.Command;

public record OrderItemAddCommand(
    Long orderId,
    Long productId,
    Integer quantity
) implements Command {
}
