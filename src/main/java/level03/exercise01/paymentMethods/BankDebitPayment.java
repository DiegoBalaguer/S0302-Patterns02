package level03.exercise01.paymentMethods;

/**
 * PROGRAM: BankDebitPayment
 * AUTHOR: Diego Balaguer
 * DATE: 08/06/2025
 */

public class BankDebitPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + "€ with bank debit.");
    }
}
