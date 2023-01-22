package org.example.statePattern;

import org.example.decoratorPattern.PizzaDecorator;
import org.example.templatePattern.PizzaMaker;

public class PizzaOrder {
    private final PizzaMaker maker;
    private PizzaDecorator decorator;
    private OrderState state;

    public PizzaOrder(PizzaMaker maker) {
        this.maker = maker;
        this.state = new PendingState();
    }

    public void setDecorator(PizzaDecorator decorator) {
        this.decorator = decorator;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void makeOrder() {
        state.makeOrder(this);
        maker.makePizza();
        if (decorator != null) {
            System.out.println("Adding decorator: " + decorator.getDescription());
        }
        System.out.println("Total cost: $" + (decorator != null ? decorator.getCost() : maker.createFactory().createPizza().getCost()));
    }
}

