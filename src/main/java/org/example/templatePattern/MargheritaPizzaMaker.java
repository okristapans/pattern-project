package org.example.templatePattern;

import org.example.factoryPattern.MargheritaPizzaFactory;
import org.example.factoryPattern.Pizza;
import org.example.factoryPattern.PizzaFactory;

public class MargheritaPizzaMaker extends PizzaMaker {
    public PizzaFactory createFactory() {
        return new MargheritaPizzaFactory();
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
