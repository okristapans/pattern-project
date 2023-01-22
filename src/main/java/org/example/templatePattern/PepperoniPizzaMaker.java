package org.example.templatePattern;

import org.example.factoryPattern.PepperoniPizzaFactory;
import org.example.factoryPattern.Pizza;
import org.example.factoryPattern.PizzaFactory;

public class PepperoniPizzaMaker extends PizzaMaker {
    public PizzaFactory createFactory() {
        return new PepperoniPizzaFactory();
    }

    void preparePizza(Pizza pizza) {
        System.out.println("Preparing " + pizza.getDescription());
    }

    void bakePizza(Pizza pizza) {
        System.out.println("Baking " + pizza.getDescription());
    }

    void boxPizza(Pizza pizza) {
        System.out.println("Boxing " + pizza.getDescription());
    }
}
