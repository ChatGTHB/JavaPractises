package _23_ClassMethod._00_Example;

public class Main {
    public static void main(String[] args) {
        // Yeni bir Person nesnesi oluşturuluyor
        Person person = new Person();

        // Person nesnesinin değişkenlerine değer atama
        person.name = "John Doe";
        person.age = 25;

        // displayInfo metodu ile kişinin bilgilerini yazdırma
        person.displayInfo();
    }
}
