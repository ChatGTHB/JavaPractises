package _32_AbstractClass._05_Example;

public class PaymentProcessor {
    public void processPayment(PaymentBase payment, double amount) {
        payment.pay(amount); // Ödeme işlemi gerçekleştirilir
    }

    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.processPayment(new CreditCardPayment(), 100.0); // Çıktı: Paid 100.0 using Credit Card.
        processor.processPayment(new PayPalPayment(), 200.0); // Çıktı: Paid 200.0 using PayPal.
        processor.processPayment(new BitcoinPayment(), 300.0); // Çıktı: Paid 300.0 using Bitcoin.
    }
}

