package _28_Encapsulation._02_Example;

public class BankAccountManager {
    public static void main(String[] args) {
        // Yeni bir BankAccount nesnesi oluşturuluyor
        BankAccount bankAccount = new BankAccount("Ahmet", 123456, 5000.0);

        // BankAccount nesnesine para yatırılıyor
        bankAccount.deposit(1500.0);

        // BankAccount nesnesinden para çekiliyor
        bankAccount.withdraw(500.0);

        // BankAccount nesnesinin güncel bakiyesi ekrana yazdırılıyor
        System.out.println("Güncel bakiye: " + bankAccount.getBalance());
    }
}
