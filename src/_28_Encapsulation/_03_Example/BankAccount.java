package _28_Encapsulation._03_Example;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    // Müşteri bilgilerini temsil eden özellikler
    private String firstName;   // Müşterinin adı
    private String lastName;    // Müşterinin soyadı
    private int accountNumber;  // Müşterinin hesap numarası
    private double balance;     // Müşterinin hesap bakiyesi

    // Hesap hareketlerini tutmak için bir liste
    private List<Transaction> transactions;

    /**
     * BankAccount sınıfının yapıcı metodu (constructor).
     * Bu metod, bir BankAccount nesnesi oluşturulduğunda çalıştırılır
     * ve ilk değerlerin ayarlanmasını sağlar.
     *
     * @param firstName     Müşterinin adı
     * @param lastName      Müşterinin soyadı
     * @param accountNumber Hesap numarası
     * @param balance       Başlangıç bakiyesi
     */
    public BankAccount(String firstName, String lastName, int accountNumber, double balance) {
        this.firstName = firstName;  // Ad parametresini sınıfın firstName değişkenine atar
        this.lastName = lastName;    // Soyad parametresini sınıfın lastName değişkenine atar
        this.accountNumber = accountNumber;  // Hesap numarasını sınıfın accountNumber değişkenine atar
        this.balance = balance;  // Başlangıç bakiyesini sınıfın balance değişkenine atar
        this.transactions = new ArrayList<>();  // Hesap hareketleri listesi oluşturur
    }

    // Getter ve Setter metotları, private değişkenlere erişimi sağlar ve değişiklik yapar
    public String getFirstName() {
        return firstName;  // firstName değerini döndürür
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;  // firstName değerini günceller
    }

    public String getLastName() {
        return lastName;  // lastName değerini döndürür
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;  // lastName değerini günceller
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

    public void setBalance(double balance) {
        this.balance = balance;  // balance değerini günceller
    }

    /**
     * Bu metot, hesap hareketi eklemek için kullanılır.
     * Yeni bir Transaction nesnesi oluşturur ve transactions listesine ekler.
     * Ayrıca, işlem türüne göre bakiyeyi günceller.
     *
     * @param date            Hesap hareketinin tarihi
     * @param description     Hesap hareketinin açıklaması
     * @param amount          Hesap hareketinin miktarı
     * @param transactionType Hesap hareketinin türü (Deposit/Yatırım veya Withdrawal/Çekim)
     */
    public void addTransaction(String date, String description, double amount, String transactionType) {
        // Yeni bir Transaction nesnesi oluşturuluyor
        Transaction transaction = new Transaction(date, description, amount, transactionType);

        // Oluşturulan Transaction nesnesi, transactions listesine ekleniyor
        this.transactions.add(transaction);

        // İşlem türüne göre bakiyeyi güncelle
        if (transactionType.equalsIgnoreCase("Deposit")) {
            this.balance += amount;  // Yatırım ise, bakiyeye ekle
        } else if (transactionType.equalsIgnoreCase("Withdrawal")) {
            this.balance -= amount;  // Çekim ise, bakiyeden çıkar
        }
    }

    /**
     * Bu metot, tüm hesap hareketlerini döndürür.
     *
     * @return Hesap hareketlerinin bulunduğu listeyi döndürür
     */
    public List<Transaction> getTransactions() {
        return transactions;  // transactions listesini döndürür
    }

    /**
     * Bu metot, BankAccount nesnesinin tüm bilgilerini bir string olarak döndürür.
     *
     * @return BankAccount nesnesinin string gösterimi
     */
    @Override
    public String toString() {
        return "BankAccount{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", transactions=" + transactions +
                '}';
    }
}
