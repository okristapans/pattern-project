package org.example.factoryPattern;

public class MargheritaPizzaFactory extends PizzaFactory {
    public Pizza createPizza() {
        return new MargheritaPizza();
    }
}
