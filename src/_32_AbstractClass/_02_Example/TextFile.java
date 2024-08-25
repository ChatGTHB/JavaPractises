package _32_AbstractClass._02_Example;

public class TextFile extends TextFileBase {
    @Override
    public void read() {
        System.out.println("Reading the text file."); // Read metodunun özelleştirilmesi
    }

    @Override
    public void write() {
        System.out.println("Writing to the text file."); // Write metodunun özelleştirilmesi
    }

    public static void main(String[] args) {
        TextFile file = new TextFile();
        file.read();  // Çıktı: Reading the text file.
        file.write(); // Çıktı: Writing to the text file.
    }
}
