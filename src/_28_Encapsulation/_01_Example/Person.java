package _28_Encapsulation._01_Example;

public class Person {
    // "name" özelliği private olarak tanımlandı
    private String name;

    // "age" özelliği private olarak tanımlandı
    private int age;

    // Getter metodu: name özelliğinin değerini döndürür
    public String getName() {
        return name;
    }

    // Setter metodu: name özelliğini ayarlar
    public void setName(String name) {
        // Parametre olarak alınan name, sınıfın name özelliğine atanır
        this.name = name;
    }

    // Getter metodu: age özelliğinin değerini döndürür
    public int getAge() {
        return age;
    }

    // Setter metodu: age özelliğini ayarlar
    public void setAge(int age) {
        // Yaşın negatif olmaması için bir kontrol ekliyoruz
        if (age > 0) {
            this.age = age;
        } else {
            // Negatif bir değer girildiğinde uyarı mesajı veriyoruz
            System.out.println("Yaş negatif olamaz!");
        }
    }
}
