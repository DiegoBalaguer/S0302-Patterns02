package level02.exercise01.model;

import level02.exercise01.observer.StockObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * PROGRAM: StockAgent
 * AUTHOR: Diego Balaguer
 * DATE: 07/06/2025
 */

public class StockAgent {
    private static StockAgent instance;
    private List<StockObserver> observers;
    private String stockExchange;

    private StockAgent() {
        observers  = new ArrayList<>();
        stockExchange = "STABLE";
    }

    public static StockAgent getInstance() {
        if (instance == null) {
            synchronized (StockAgent.class) {
                if (instance == null) {
                    instance = new StockAgent();
                }
            }
        }
        return instance;
    }

    public void addObserver(StockObserver observer) {
        observers.add(observer);
        System.out.println("ADDED TO STOCK AGENT: " + observer);
    }

    public void delObserver(StockObserver observer) {
        observers.remove(observer);
        System.out.println("REMOVED TO STOCK AGENT: " + observer);
    }

    public void notifyObservers(String message) {
        for (StockObserver observer : observers) {
            observer.update(message);
        }
    }

    public void setStockExchange(String stockExchange) {
        if  (!this.stockExchange.equals(stockExchange)) {
            this.stockExchange = stockExchange;
            notifyObservers(stockExchange);
        }
    }
}
