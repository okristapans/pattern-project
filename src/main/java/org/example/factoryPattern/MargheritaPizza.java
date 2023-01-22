package org.example.factoryPattern;

public class MargheritaPizza implements Pizza {
    public String getDescription() {
        return "Margherita Pizza";
    }

    public double getCost() {
        return 5.99;
    }
}
