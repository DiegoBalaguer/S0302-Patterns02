package level01.exercise01.builder;

import level01.exercise01.model.Pizza;

/**
 * PROGRAM: PizzaBuilder
 * AUTHOR: Diego Balaguer
 * DATE: 07/06/2025
 */

public interface PizzaBuilder {
    void setSize();
    void setDough();
    void setToppings();
    Pizza builderPizza();

}
