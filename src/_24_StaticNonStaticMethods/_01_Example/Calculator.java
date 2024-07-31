package _24_StaticNonStaticMethods._01_Example;

public class Calculator {
    // İki sayıyı toplayan statik bir metot oluşturalım
    public static int topla(int number1, int number2) {
        return number1 + number2;
    }

    // İki sayıyı çıkaran statik bir metot
    public static int fark(int number1, int number2) {
        return number1 - number2;
    }

    // İki sayıyı çarpan non-statik bir metot
    public int carp(int number1, int number2) {
        return number1 * number2;
    }

    // İki sayıyı bölen non-statik bir metot
    public int bol(int number1, int number2) {
        return number1 / number2;
    }
}
