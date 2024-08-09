package _27_Enum._04_Example;

public class DayInfoDisplay {
    public static void main(String[] args) {
        DaysOfWeek today = DaysOfWeek.CUMA; // Enum sabiti seçimi

        // Switch-case yapısı kullanarak gün bilgisi işleme
        switch (today) {
            case PAZARTESI:
            case SALI:
            case CARSAMBA:
            case PERSEMBE:
            case CUMA:
                System.out.println("Bugün hafta içi.");
                break;
            case CUMARTESI:
            case PAZAR:
                System.out.println("Bugün hafta sonu.");
                break;
        }

        // Çalışma saatlerini göster
        System.out.println("Bugünün çalışma saatleri: " + today.getWorkingHours());
    }
}
