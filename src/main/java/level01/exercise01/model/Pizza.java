package level01.exercise01.model;

import java.util.List;

/**
 * PROGRAM: Pizza
 * AUTHOR: Diego Balaguer
 * DATE: 07/06/2025
 */

public class Pizza {
    private String pizzaName;
    private String pizzaSize;
    private String pizzaDough;
    private List<String> pizzaToppings;

    public Pizza(String pizzaName, String pizzaSize, String pizzaDough, List<String> pizzaToppings) {
        this.pizzaName = pizzaName;
        this.pizzaSize = pizzaSize;
        this.pizzaDough = pizzaDough;
        this.pizzaToppings = pizzaToppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaName='" + pizzaName + '\'' +
                ", pizzaSize='" + pizzaSize + '\'' +
                ", pizzaDough='" + pizzaDough + '\'' +
                ", pizzaToppings=" + pizzaToppings +
                '}';
    }
}
