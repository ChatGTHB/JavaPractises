package _31_Interface._01_Example;

public class Document implements IPrintable {
    @Override
    public void print() {
        // Document sınıfı, print() metodunu kendi ihtiyaçlarına göre tanımlar
        System.out.println("Document is being printed.");
    }

    public static void main(String[] args) {
        Document document = new Document();
        document.print(); // Çıktı: Document is being printed.
    }
}
