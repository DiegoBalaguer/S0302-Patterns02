package level01.exercise01.model;

import level01.exercise01.builder.PizzaBuilder;

import java.util.Arrays;
import java.util.List;

/**
 * PROGRAM: VegetarianPizzaBuilder
 * AUTHOR: Diego Balaguer
 * DATE: 07/06/2025
 */

public class VegetarianPizzaBuilder implements PizzaBuilder {
    private String size;
    private String dough;
    private List<String> toppings;

    @Override
    public void setSize() {
        size = "Large";
    }

    @Override
    public void setDough() {
        dough = "Thin";
    }

    @Override
    public void setToppings() {
        toppings = Arrays.asList("Tomato", "Cheese", "Onion", "Peppers", "Olives");
    }

    @Override
    public Pizza builderPizza() {
        return new Pizza("Vegetarian Pizza", size, dough, toppings);
    }
}

