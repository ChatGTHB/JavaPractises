package _28_Encapsulation._03_Example;

import java.util.List;

public class BankAccountManager {
    public static void main(String[] args) {
        // Yeni bir BankAccount nesnesi oluşturuluyor
        BankAccount bankAccount = new BankAccount("Ahmet", "Yılmaz", 123456, 5000.0);

        // BankAccount nesnesine yeni bir hesap hareketi ekleniyor
        bankAccount.addTransaction("22.01.2024", "Para yatırma", 1000.0, "Deposit");

        // BankAccount nesnesindeki tüm hesap hareketleri alınıyor
        List<Transaction> transactions = bankAccount.getTransactions();

        // BankAccount nesnesinin tüm bilgileri ekrana yazdırılıyor
        System.out.println("bankAccount = " + bankAccount);

        // Hesap hareketleri ekrana yazdırılıyor
        System.out.println("Hesap Hareketleri:");
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
}
