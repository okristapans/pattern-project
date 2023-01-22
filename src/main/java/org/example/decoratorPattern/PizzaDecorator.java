package org.example.decoratorPattern;

import org.example.factoryPattern.Pizza;

public interface PizzaDecorator extends Pizza {
  String getDescription();
  double getCost();
}

