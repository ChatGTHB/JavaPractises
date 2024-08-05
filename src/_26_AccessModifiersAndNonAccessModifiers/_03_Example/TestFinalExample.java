package _26_AccessModifiersAndNonAccessModifiers._03_Example;

public class TestFinalExample {
    public static void main(String[] args) {
        FinalExample example = new FinalExample();

        // Final değişken: Erişilebilir, ancak değiştirilemez
        System.out.println("Final Variable: " + example.finalVar);

        // Final metod: Erişilebilir ve çağrılabilir
        example.finalMethod();
    }
}
