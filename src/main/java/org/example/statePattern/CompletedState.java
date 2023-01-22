package org.example.statePattern;

class CompletedState implements OrderState {
    public void makeOrder(PizzaOrder order) {
        System.out.println("Order completed, enjoy your meal!");
    }
}
