package _31_Interface._05_Example;

public class BitcoinPayment implements IPayment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Bitcoin."); // Bitcoin ile ödeme
    }
}
