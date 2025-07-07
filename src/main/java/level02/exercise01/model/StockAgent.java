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
    private List<StockObserver> observers = new ArrayList<>();

    public void addObserver(StockObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers(String status) {
        for (StockObserver observer : observers) {
            observer.update(status);
        }
    }
}

