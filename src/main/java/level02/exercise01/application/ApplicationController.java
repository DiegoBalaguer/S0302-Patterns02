package level02.exercise01.application;

import level02.exercise01.model.Agency;
import level02.exercise01.model.StockAgent;
import level02.exercise01.observer.StockObserver;

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
        StockAgent stockAgent = StockAgent.getInstance();

        Agency agency01 = new Agency("Agency 01");
        Agency agency02 = new Agency("Agency 02");

        stockAgent.addObserver(agency01);
        stockAgent.addObserver(agency02);

        stockAgent.setStockExchange("UP");
        stockAgent.setStockExchange("DOWN");

        stockAgent.delObserver(agency01);
    }
}

