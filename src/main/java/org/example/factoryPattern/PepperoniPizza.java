package org.example.factoryPattern;

public class PepperoniPizza implements Pizza {
    public String getDescription() {
        return "Pepperoni Pizza";
    }

    public double getCost() {
        return 7.99;
    }
}
