package _27_Enum._04_Example;

public enum DaysOfWeek {
    PAZARTESI("09:00-17:00"),
    SALI("09:00-17:00"),
    CARSAMBA("09:00-17:00"),
    PERSEMBE("09:00-17:00"),
    CUMA("09:00-17:00"),
    CUMARTESI("10:00-14:00"),
    PAZAR("Kapalı");

    private String workingHours; // Günün çalışma saatleri

    private DaysOfWeek(String workingHours) {
        this.workingHours = workingHours;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public boolean isWeekend() {
        return this == CUMARTESI || this == PAZAR;
    }
}
