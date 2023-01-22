package org.example.templatePattern;

import org.example.factoryPattern.Pizza;
import org.example.factoryPattern.PizzaFactory;

public abstract class PizzaMaker {
  public final void makePizza() {
    PizzaFactory factory = createFactory();
    Pizza pizza = factory.createPizza();
    preparePizza(pizza);
    bakePizza(pizza);
    boxPizza(pizza);
  }
  public abstract PizzaFactory createFactory();
  abstract void preparePizza(Pizza pizza);
  abstract void bakePizza(Pizza pizza);
  abstract void boxPizza(Pizza pizza);
}

