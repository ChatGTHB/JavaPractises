package _30_Polymorphism._04_Example;

// SavingsAccount sınıfı, BankAccount sınıfından miras alır
public class SavingsAccount extends BankAccount {

    // Yapıcı metot
    public SavingsAccount(double balance) {
        super(balance);
    }

    // SavingsAccount'ta ek bir özellik olarak faiz eklenebilir
    public void addInterest(double rate) {
        double interest = balance * rate / 100;
        balance += interest;
        System.out.println("Eklenen faiz: " + interest + ". Yeni bakiye: " + balance);
    }
}
