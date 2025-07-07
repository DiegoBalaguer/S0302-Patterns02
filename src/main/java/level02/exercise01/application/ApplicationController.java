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


    public void run() {
        StockAgent stockAgent = new StockAgent();

        stockAgent.addObserver(new Agency("Agency01"));
        stockAgent.addObserver(new Agency("Agency02"));

        stockAgent.notifyObservers("UP");
        stockAgent.notifyObservers("DOWN");

    }
}

