package level03.exercise01.paymentMethods;

/**
 * PROGRAM: PaypalPayment
 * AUTHOR: Diego Balaguer
 * DATE: 08/06/2025
 */

public class PaypalPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + "€ with PayPal.");
    }
}
