package level01.exercise01.builder;

import level01.exercise01.model.Pizza;

/**
 * PROGRAM: PizzaMaster
 * AUTHOR: Diego Balaguer
 * DATE: 07/06/2025
 */

public class PizzaMaster {
    private static PizzaMaster instance;
    //private PizzaBuilder pizzaBuilder;


    private PizzaMaster() {
    }

    public static PizzaMaster getInstance() {
        if (instance == null) {
            synchronized (PizzaMaster.class) {
                if (instance == null) {
                    instance = new PizzaMaster();
                }
            }
        }
        return instance;
    }

    public Pizza preparePizza(PizzaBuilder pizzaBuilder) {
        pizzaBuilder.setSize();
        pizzaBuilder.setDough();
        pizzaBuilder.setToppings();
        return pizzaBuilder.builderPizza();
    }
}
