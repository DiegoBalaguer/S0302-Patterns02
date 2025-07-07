package level03.exercise01.model;

import level03.exercise01.paymentMethods.PaymentGateway;
import level03.exercise01.paymentMethods.PaymentMethod;

/**
 * PROGRAM: ShoeStore
 * AUTHOR: Diego Balaguer
 * DATE: 08/06/2025
 */

public class ShoeStore {
    private PaymentGateway paymentGateway = new PaymentGateway();

    public void sellShoes(double price, PaymentMethod method) {
        System.out.println("Customer has purchased shoes for " + price + "€");
        paymentGateway.processPayment(price, method);
        System.out.println("Store: Thank you for your purchase!");
    }
}
