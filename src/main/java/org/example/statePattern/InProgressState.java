package org.example.statePattern;

class InProgressState implements OrderState {
    public void makeOrder(PizzaOrder order) {
        System.out.println("Order in progress, please wait...");
        order.setState(new CompletedState());
    }

}
