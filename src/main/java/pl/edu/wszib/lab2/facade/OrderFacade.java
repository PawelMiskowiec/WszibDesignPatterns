package pl.edu.wszib.lab2.facade;

import pl.edu.wszib.lab2.facade.api.*;

public class OrderFacade implements OrderOperations {

    // create, read, update, delete
    private final OrderCreateOperation orderCreateOperation;
    private final OrderReadOperation orderReadOperation;
    private final OrderUpdateOperation orderUpdateOperation;
    private final OrderDeleteOperation orderDeleteOperation;
    private final OrderProcessOperation orderProcessOperation;

    public OrderFacade(
        final OrderCreateOperation orderCreateOperation,
        final OrderReadOperation orderReadOperation,
        final OrderUpdateOperation orderUpdateOperation,
        final OrderDeleteOperation orderDeleteOperation,
        final OrderProcessOperation orderProcessOperation) {
        this.orderCreateOperation = orderCreateOperation;
        this.orderReadOperation = orderReadOperation;
        this.orderUpdateOperation = orderUpdateOperation;
        this.orderDeleteOperation = orderDeleteOperation;
        this.orderProcessOperation = orderProcessOperation;
    }

    @Override
    public void create() {
        orderCreateOperation.create();
    }

    @Override
    public void read() {
        orderReadOperation.read();
    }

    @Override
    public void update() {
        orderUpdateOperation.update();
    }

    @Override
    public void delete() {
        orderDeleteOperation.delete();
    }

    @Override
    public void process() {
        orderProcessOperation.process();
    }
}
