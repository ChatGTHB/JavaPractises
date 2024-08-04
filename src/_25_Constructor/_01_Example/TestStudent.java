package _25_Constructor._01_Example;

public class TestStudent {
    public static void main(String[] args) {
        // Varsayılan yaş ile bir öğrenci nesnesi oluşturma
        // "Ali Veli" isimli bir öğrenci nesnesi oluşturulur ve yaş değeri belirtilmediği için 18 atanır
        Student student1 = new Student("Ali", "Bulur");
        // Oluşturulan öğrenci nesnesinin bilgilerini ekrana yazdırma
        student1.displayInfo();

        // Öğrenciler arasında boş bir satır eklemek için
        System.out.println(); // Boş satır

        // Belirtilen yaş ile bir öğrenci nesnesi oluşturma
        // "Ayşe Yılmaz" isimli bir öğrenci nesnesi oluşturulur ve yaş değeri 22 olarak atanır
        Student student2 = new Student("Ayşe", "Yılmaz", 22);
        // Oluşturulan öğrenci nesnesinin bilgilerini ekrana yazdırma
        student2.displayInfo();
    }
}
