package _26_AccessModifiersAndNonAccessModifiers._03_Example;

public final class FinalExample {
    // final değişken: İlk değer atandığında sabitlenir ve değiştirilemez
    public final int finalVar = 100;

    // final metod: Alt sınıflar tarafından override edilemez
    public final void finalMethod() {
        System.out.println("This is a final method.");
    }
}
