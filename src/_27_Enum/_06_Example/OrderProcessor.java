package _27_Enum._06_Example;

import java.util.Scanner;

/**
 * OrderProcessor sınıfı, içecek siparişlerini işleyen ana sınıftır.
 */
public class OrderProcessor {
    public static void main(String[] args) {
        BeverageType selectedBeverage = takeSelectBeverage();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç adet? ");
        int pcs = scanner.nextInt();

        BeverageOrder order = new BeverageOrder();
        order.addOrder(selectedBeverage, pcs);

        order.showOrderDetails();
    }

    private static BeverageType takeSelectBeverage() {
        System.out.println("İçecek Seçiniz:");
        for (BeverageType beverage : BeverageType.values()) {
            System.out.println(beverage.ordinal() + 1 + ". " + beverage.getName());
        }

        Scanner scanner = new Scanner(System.in);
        int selection;
        do {
            System.out.print("Seçiminizi yapınız (1-" + BeverageType.values().length + "): ");
            selection = scanner.nextInt();
        } while (selection < 1 || selection > BeverageType.values().length);

        return BeverageType.values()[selection - 1];
    }
}


/*
Özet:
- Main sınıfı, programın giriş noktasıdır ve kullanıcıdan alınan verileri işleyip sipariş oluşturur.
- Kullanıcıdan alınan seçimler, enum sabitleri (Drinks) olarak saklanır.
- Enum'lar sayesinde, sadece tanımlı içeceklerin seçilmesi garanti altına alınır.
- Sipariş detayları, Order sınıfı tarafından işlenir ve gösterilir.
*/
