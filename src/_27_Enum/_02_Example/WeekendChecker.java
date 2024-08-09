package _27_Enum._02_Example;

public class WeekendChecker {
    public static void main(String[] args) {
        DaysOfWeek today = DaysOfWeek.CUMA; // Enum sabiti seçimi
        System.out.println("Bugün hafta sonu mu? " + today.isWeekend());
    }
}
