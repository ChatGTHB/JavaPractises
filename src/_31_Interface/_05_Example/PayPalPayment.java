package _31_Interface._05_Example;

public class PayPalPayment implements IPayment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal."); // PayPal ile ödeme
    }
}
