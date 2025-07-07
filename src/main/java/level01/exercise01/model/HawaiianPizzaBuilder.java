package level01.exercise01.model;

import level01.exercise01.builder.PizzaBuilder;

import java.util.Arrays;
import java.util.List;

/**
 * PROGRAM: HawaiianPizzaBuilder
 * AUTHOR: Diego Balaguer
 * DATE: 07/06/2025
 */

public class HawaiianPizzaBuilder implements PizzaBuilder {
    private String size;
    private String dough;
    private List<String> toppings;

    @Override
    public void setSize() {
        size = "Medium";
    }

    @Override
    public void setDough() {
        dough = "Thick";
    }

    @Override
    public void setToppings() {
        toppings = Arrays.asList("Tomato", "Cheese", "Ham", "Pineapple");
    }

    @Override
    public Pizza builderPizza() {
        return new Pizza("Hawaiian Pizza", size, dough, toppings);
    }
}

