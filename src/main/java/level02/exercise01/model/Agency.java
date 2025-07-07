package level02.exercise01.model;

import level02.exercise01.observer.StockObserver;

/**
 * PROGRAM: Agency
 * AUTHOR: Diego Balaguer
 * DATE: 07/06/2025
 */

public class Agency implements StockObserver {
    private String name;

    public Agency(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockStatus) {
        System.out.println(name + " is now informed of the status of the Stock Exchange: " + stockStatus);
    }
}

