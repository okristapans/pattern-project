package org.example;

import org.example.decoratorPattern.CheeseDecorator;
import org.example.decoratorPattern.MushroomDecorator;
import org.example.statePattern.PizzaOrder;
import org.example.templatePattern.MargheritaPizzaMaker;
import org.example.templatePattern.PepperoniPizzaMaker;
import org.example.templatePattern.PizzaMaker;

public class Main {
    public static void main(String[] args) {
        PizzaMaker margheritaPizzaMaker = new MargheritaPizzaMaker();
        PizzaOrder plainMargherita = new PizzaOrder(margheritaPizzaMaker);
        plainMargherita.makeOrder();
        System.out.println("-----------------------------");

        PizzaMaker pepperoniPizzaMaker = new PepperoniPizzaMaker();
        PizzaOrder plainPepperoni = new PizzaOrder(pepperoniPizzaMaker);
        plainPepperoni.makeOrder();
        System.out.println("-----------------------------");

        PizzaOrder pepperoniWithCheese = new PizzaOrder(pepperoniPizzaMaker);
        pepperoniWithCheese.setDecorator(new CheeseDecorator(pepperoniPizzaMaker.createFactory().createPizza()));
        pepperoniWithCheese.makeOrder();
        System.out.println("-----------------------------");

        PizzaOrder margheritaWithMushrooms = new PizzaOrder(margheritaPizzaMaker);
        margheritaWithMushrooms.setDecorator(new MushroomDecorator(margheritaPizzaMaker.createFactory().createPizza()));
        margheritaWithMushrooms.makeOrder();
    }

}