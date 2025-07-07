package level03.exercise01.application;


import level03.exercise01.model.ShoeStore;
import level03.exercise01.paymentMethods.BankDebitPayment;
import level03.exercise01.paymentMethods.CreditCardPayment;
import level03.exercise01.paymentMethods.PaymentMethod;
import level03.exercise01.paymentMethods.PaypalPayment;

/**
 * PROGRAM: ApplicationController
 * AUTHOR: Diego Balaguer
 * DATE: 08/06/2025
 */

public class ApplicationController {


    public void run() {
        ShoeStore shoeStore = new ShoeStore();

        PaymentMethod creditCard = new CreditCardPayment();
        PaymentMethod paypal = new PaypalPayment();
        PaymentMethod bankDebit = new BankDebitPayment();

        shoeStore.sellShoes(88.80, creditCard);
        shoeStore.sellShoes(128.68, paypal);
        shoeStore.sellShoes(220.00, bankDebit);
    }
}

