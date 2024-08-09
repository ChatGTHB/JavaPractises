package _28_Encapsulation._02_Example;

public class BankAccount {

    // Müşteri bilgilerini temsil eden özellikler
    private String name;        // Müşterinin adı
    private int accountNumber;  // Müşterinin hesap numarası
    private double balance;     // Müşterinin hesap bakiyesi

    /**
     * BankAccount sınıfının yapıcı metodu (constructor).
     * Bu metod, bir BankAccount nesnesi oluşturulduğunda çalıştırılır
     * ve ilk değerlerin ayarlanmasını sağlar.
     *
     * @param name          Müşterinin adı
     * @param accountNumber Hesap numarası
     * @param balance       Başlangıç bakiyesi
     */
    public BankAccount(String name, int accountNumber, double balance) {
        this.name = name;  // Parametre olarak gelen name değeri sınıfın name değişkenine atanır
        this.accountNumber = accountNumber;  // Parametre olarak gelen accountNumber değeri sınıfın accountNumber değişkenine atanır
        this.balance = balance;  // Parametre olarak gelen balance değeri sınıfın balance değişkenine atanır
    }

    // Getter ve Setter metotları
    public String getName() {
        return name;  // name değerini döndürür
    }

    public void setName(String name) {
        this.name = name;  // name değerini günceller
    }

    public int getAccountNumber() {
        return accountNumber;  // accountNumber değerini döndürür
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;  // accountNumber değerini günceller
    }

    public double getBalance() {
        return balance;  // balance değerini döndürür
    }

    // Para yatırmak için metot
    public void deposit(double amount) {
        if (amount > 0) {  // Yatırılacak miktar pozitif olmalı
            balance += amount;  // Miktarı bakiyeye ekle
        }
    }

    // Para çekmek için metot
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {  // Çekilecek miktar pozitif olmalı ve bakiye yeterli olmalı
            balance -= amount;  // Miktarı bakiyeden çıkar
        }
    }
}
