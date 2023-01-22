package org.example.decoratorPattern;

import org.example.factoryPattern.Pizza;

public class MushroomDecorator implements PizzaDecorator {
    private final Pizza pizza;

    public MushroomDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", with mushrooms";
    }

    public double getCost() {
        return pizza.getCost() + 2.00;
    }
}
