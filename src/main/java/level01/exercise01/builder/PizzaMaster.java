package level01.exercise01.builder;

import level01.exercise01.model.Pizza;

/**
 * PROGRAM: PizzaMaster
 * AUTHOR: Diego Balaguer
 * DATE: 07/06/2025
 */

public class PizzaMaster {
    private PizzaBuilder pizzaBuilder;

    public PizzaMaster(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza preparePizza() {
        pizzaBuilder.setSize();
        pizzaBuilder.setDough();
        pizzaBuilder.setToppings();
        return pizzaBuilder.builderPizza();
    }
}
