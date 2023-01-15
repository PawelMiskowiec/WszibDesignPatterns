package pl.edu.wszib.lab4;

import java.util.Map;
import java.util.UUID;
import pl.edu.wszib.lab4.order.*;

public class Application {

    public static void main(String[] args) {
        final OrderFacade orderFacade = new OrderFacade();
        final CommandBus commandBus = new CommandBus(Map.of(
            OrderCreateCommand.class, (CommandHandler<OrderCreateCommand>) orderFacade::create,
            OrderItemAddCommand.class, (CommandHandler<OrderItemAddCommand>) orderFacade::addItem
        ));
        final OrderCreateCommand orderCreateCommand = new OrderCreateCommand(UUID.randomUUID().toString());
        commandBus.execute(orderCreateCommand);
        final OrderItemAddCommand orderItemAddCommand = new OrderItemAddCommand(12L, 350L, 12);
        commandBus.execute(orderItemAddCommand);

    }
}
