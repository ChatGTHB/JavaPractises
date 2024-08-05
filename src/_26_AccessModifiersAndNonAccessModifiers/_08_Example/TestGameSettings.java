package _26_AccessModifiersAndNonAccessModifiers._08_Example;

public class TestGameSettings {
    public static void main(String[] args) {
        // Skoru arttır
        GameSettings.increaseScore();
        GameSettings.increaseScore();

        // Skor değerini ekrana yazdır
        System.out.println("Score: " + GameSettings.getScore());
    }
}
