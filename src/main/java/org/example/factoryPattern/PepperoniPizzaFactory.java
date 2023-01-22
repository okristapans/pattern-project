package org.example.factoryPattern;

public class PepperoniPizzaFactory extends PizzaFactory {
    public Pizza createPizza() {
        return new PepperoniPizza();
    }
}
