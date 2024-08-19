package _29_Inheritance._03_Example;

// BankAccount sınıfı, tüm banka hesaplarının ortak özelliklerini ve metotlarını temsil eder
public class BankAccount {

    protected int accountNumber;
    protected double balance;

    // Yapıcı metot (constructor), hesap numarasını ve bakiyeyi başlatır
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Para yatırma metodu
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Yatırılan: " + amount + ". Yeni bakiye: " + balance);
    }

    // Para çekme metodu (alt sınıflarda özelleştirilebilir)
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Çekilen: " + amount + ". Kalan bakiye: " + balance);
    }
}
