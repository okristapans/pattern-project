package org.example.statePattern;

class PendingState implements OrderState {
    public void makeOrder(PizzaOrder order) {
        System.out.println("Order received, preparing...");
        order.setState(new InProgressState());
    }
}
