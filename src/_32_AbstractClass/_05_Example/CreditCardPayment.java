package _32_AbstractClass._05_Example;

public class CreditCardPayment extends PaymentBase {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card."); // Kredi kartıyla ödeme
    }
}

