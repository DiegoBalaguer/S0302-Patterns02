package level01.exercise01.application;

import level01.exercise01.builder.PizzaBuilder;
import level01.exercise01.builder.PizzaMaster;
import level01.exercise01.model.HawaiianPizzaBuilder;
import level01.exercise01.model.Pizza;
import level01.exercise01.model.VegetarianPizzaBuilder;

/**
 * PROGRAM: ApplicationController
 * AUTHOR: Diego Balaguer
 * DATE: 07/06/2025
 */

public class ApplicationController {


    public void run() {

        PizzaMaster pizzaMaster;

        PizzaBuilder hawaiianBuilder = new HawaiianPizzaBuilder();
        pizzaMaster = new PizzaMaster(hawaiianBuilder);
        Pizza hawaiian = pizzaMaster.preparePizza();
        System.out.println(hawaiian);

        PizzaBuilder vegetarianBuilder = new VegetarianPizzaBuilder();
        pizzaMaster = new PizzaMaster(vegetarianBuilder);
        Pizza vegetarian = pizzaMaster.preparePizza();
        System.out.println(vegetarian);
    }
}
