package _28_Encapsulation._03_Example;

public class Transaction {
    // Hesap hareketi bilgilerini temsil eden özellikler
    private final String date;         // Hesap hareketinin tarihi
    private final String description;  // Hesap hareketinin açıklaması
    private final double amount;       // Hesap hareketinin miktarı
    private final String transactionType;  // Hesap hareketinin türü (Deposit/Yatırım veya Withdrawal/Çekim)

    /**
     * Transaction sınıfının yapıcı metodu (constructor).
     * Bu metod, yeni bir Transaction nesnesi oluşturulduğunda çalıştırılır.
     *
     * @param date            Hesap hareketinin tarihi
     * @param description     Hesap hareketinin açıklaması
     * @param amount          Hesap hareketinin miktarı
     * @param transactionType Hesap hareketinin türü
     */
    public Transaction(String date, String description, double amount, String transactionType) {
        this.date = date;  // Parametre olarak gelen date değeri sınıfın date değişkenine atanır
        this.description = description;  // Parametre olarak gelen description değeri sınıfın description değişkenine atanır
        this.amount = amount;  // Parametre olarak gelen amount değeri sınıfın amount değişkenine atanır
        this.transactionType = transactionType;  // Parametre olarak gelen transactionType değeri sınıfın transactionType değişkenine atanır
    }

    // Getter metotları, private değişkenlere erişimi sağlar
    public String getDate() {
        return date;  // date değerini döndürür
    }

    public String getDescription() {
        return description;  // description değerini döndürür
    }

    public double getAmount() {
        return amount;  // amount değerini döndürür
    }

    public String getTransactionType() {
        return transactionType;  // transactionType değerini döndürür
    }

    /**
     * Bu metot, Transaction nesnesinin tüm bilgilerini bir string olarak döndürür.
     *
     * @return Transaction nesnesinin string gösterimi
     */
    @Override
    public String toString() {
        return "Transaction{" +
                "date='" + date + '\'' +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                ", transactionType='" + transactionType + '\'' +
                '}';
    }
}
