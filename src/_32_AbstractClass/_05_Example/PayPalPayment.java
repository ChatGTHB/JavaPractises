package _32_AbstractClass._05_Example;

public class PayPalPayment extends PaymentBase {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal."); // PayPal ile ödeme
    }
}

