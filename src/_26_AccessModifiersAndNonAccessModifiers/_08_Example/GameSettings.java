package _26_AccessModifiersAndNonAccessModifiers._08_Example;

public class GameSettings {
    // private static değişken: Sadece aynı sınıf içinden erişilebilir ve tüm nesneler arasında paylaşılır
    private static int score = 0;

    // public static metod: Skor değerini artırır
    public static void increaseScore() {
        score++;
    }

    // public static metod: Skor değerini döndürür
    public static int getScore() {
        return score;
    }
}
