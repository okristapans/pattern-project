package org.example.decoratorPattern;

import org.example.factoryPattern.Pizza;

public class CheeseDecorator implements PizzaDecorator {
    private final Pizza pizza;

    public CheeseDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", with extra cheese";
    }

    public double getCost() {
        return pizza.getCost() + 1.50;
    }
}
