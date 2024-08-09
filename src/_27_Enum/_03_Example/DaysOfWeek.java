package _27_Enum._03_Example;

public enum DaysOfWeek {
    PAZARTESI("09:00-17:00"),
    SALI("09:00-17:00"),
    CARSAMBA("09:00-17:00"),
    PERSEMBE("09:00-17:00"),
    CUMA("09:00-17:00"),
    CUMARTESI("10:00-14:00"),
    PAZAR("Kapalı");

    private String workingHours; // Günün çalışma saatleri

    // Constructor: Enum sabitlerinin çalışma saatlerini başlatır
    private DaysOfWeek(String workingHours) {
        this.workingHours = workingHours;
    }

    // Çalışma saatlerini döndüren metot
    public String getWorkingHours() {
        return workingHours;
    }
}
