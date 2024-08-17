package _29_Inheritance._03_Example;

// CheckingAccount sınıfı, BankAccount sınıfından miras alır
public class CheckingAccount extends BankAccount {

    // Yapıcı metot (constructor), üst sınıftaki yapıcı metodu çağırır
    public CheckingAccount(int accountNumber, double balance) {
        super(accountNumber, balance); // Üst sınıftaki accountNumber ve balance özelliklerini başlatır
    }

    // Para çekme metodunu özelleştiriyoruz (override)
    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Yetersiz bakiye: " + amount + " çekilemez.");
        } else {
            balance -= amount;
            System.out.println("Çekilen: " + amount + ". Kalan bakiye: " + balance);
        }
    }
}
