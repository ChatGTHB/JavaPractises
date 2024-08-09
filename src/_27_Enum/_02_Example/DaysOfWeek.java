package _27_Enum._02_Example;

public enum DaysOfWeek {
    PAZARTESI, SALI, CARSAMBA, PERSEMBE, CUMA, CUMARTESI, PAZAR;

    // Enum içine metot tanımlama
    public boolean isWeekend() {
        return this == CUMARTESI || this == PAZAR;
    }
}
