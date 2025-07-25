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
    private static ApplicationController instance;

    private ApplicationController() {
    }

    public static ApplicationController getInstance() {
        if (instance == null) {
            synchronized (ApplicationController.class) {
                if (instance == null) {
                    instance = new ApplicationController();
                }
            }
        }
        return instance;
    }

    public void run() {
        PizzaBuilder hawaiianBuilder = new HawaiianPizzaBuilder();
        Pizza hawaiian = PizzaMaster.getInstance().preparePizza(hawaiianBuilder);
        System.out.println(hawaiian);

        PizzaBuilder vegetarianBuilder = new VegetarianPizzaBuilder();
        Pizza vegetarian = PizzaMaster.getInstance().preparePizza(vegetarianBuilder);
        System.out.println(vegetarian);
    }
}
