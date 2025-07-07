package level03.exercise01.paymentMethods;

/**
 * PROGRAM: CreditCardPayment
 * AUTHOR: Diego Balaguer
 * DATE: 08/06/2025
 */

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + "€ with credit card.");
    }
}
