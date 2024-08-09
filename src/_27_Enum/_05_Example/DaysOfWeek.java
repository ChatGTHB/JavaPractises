package _27_Enum._05_Example;

public enum DaysOfWeek {
    PAZARTESI("09:00-17:00", 10),
    SALI("09:00-17:00", 5),
    CARSAMBA("09:00-17:00", 15),
    PERSEMBE("09:00-17:00", 10),
    CUMA("09:00-17:00", 20),
    CUMARTESI("10:00-14:00", 30),
    PAZAR("Kapalı", 25);

    private String workingHours; // Günün çalışma saatleri
    private int discountPercentage; // Günlük indirim yüzdesi

    // Constructor: Enum sabitlerinin çalışma saatlerini ve indirim yüzdesini başlatır
    private DaysOfWeek(String workingHours, int discountPercentage) {
        this.workingHours = workingHours;
        this.discountPercentage = discountPercentage;
    }

    // Çalışma saatlerini döndüren metot
    public String getWorkingHours() {
        return workingHours;
    }

    // İndirim yüzdesini döndüren metot
    public int getDiscountPercentage() {
        return discountPercentage;
    }

    // İndirimli fiyatı hesaplayan metot
    public double calculateDiscountedPrice(double originalPrice) {
        return originalPrice - (originalPrice * discountPercentage / 100);
    }
}
