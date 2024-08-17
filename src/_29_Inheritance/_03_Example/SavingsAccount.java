package _29_Inheritance._03_Example;

// SavingsAccount sınıfı, BankAccount sınıfından miras alır
public class SavingsAccount extends BankAccount {

    // Yapıcı metot (constructor), üst sınıftaki yapıcı metodu çağırır
    public SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance); // Üst sınıftaki accountNumber ve balance özelliklerini başlatır
    }

    // Para yatırma ve çekme işlemleri SavingsAccount'ta da mevcuttur, miras alınmıştır.
}
