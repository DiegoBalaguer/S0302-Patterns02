package level03.exercise01.paymentMethods;

/**
 * PROGRAM: PaymentGateway
 * AUTHOR: Diego Balaguer
 * DATE: 08/06/2025
 */

public class PaymentGateway {
    public void processPayment(double amount, PaymentMethod method) {
        System.out.println("Starting payment gateway...");
        method.pay(amount);
        System.out.println("Payment processed successfully.\n");
    }
}
