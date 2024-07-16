package _20_ArrayList2D;

import java.util.ArrayList;

public class _00_Java2DArrayListKullanimOrnekleri {
    public static void main(String[] args) {
        // 2D ArrayList oluşturma
        // 2D ArrayList, ArrayList içinde ArrayList'ler bulundurur.
        ArrayList<ArrayList<Integer>> twoDArrayList = new ArrayList<>();

        // Satır ekleme
        // Birinci satırı oluşturuyoruz ve eleman ekliyoruz.
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);
        twoDArrayList.add(row1); // Birinci satırı 2D ArrayList'e ekliyoruz.

        // İkinci satırı oluşturuyoruz ve eleman ekliyoruz.
        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);
        twoDArrayList.add(row2); // İkinci satırı 2D ArrayList'e ekliyoruz.

        // Üçüncü satırı oluşturuyoruz ve eleman ekliyoruz.
        ArrayList<Integer> row3 = new ArrayList<>();
        row3.add(7);
        row3.add(8);
        row3.add(9);
        twoDArrayList.add(row3); // Üçüncü satırı 2D ArrayList'e ekliyoruz.

        // Eleman okuma
        // İkinci satırın üçüncü elemanını (indeks 1 ve 2) alıyoruz.
        int element = twoDArrayList.get(1).get(2);
        System.out.println("Element at (1, 2): " + element);

        // Eleman güncelleme
        // Birinci satırın ikinci elemanını (indeks 0 ve 1) güncelliyoruz.
        twoDArrayList.get(0).set(1, 10);

        // Yeni bir satır oluşturuyoruz ve eleman ekliyoruz.
        ArrayList<Integer> newRow = new ArrayList<>();
        newRow.add(11);
        newRow.add(12);
        newRow.add(13);
        twoDArrayList.add(newRow); // Yeni satırı 2D ArrayList'e ekliyoruz.

        // Her satıra yeni bir sütun ekliyoruz.
        for (ArrayList<Integer> row : twoDArrayList) {
            row.add(14); // Her satıra yeni bir eleman (14) ekliyoruz.
        }

        // Üçüncü satırı (indeks 2) siliyoruz.
        twoDArrayList.remove(2);

        // Her satırdan ikinci elemanı (indeks 1) siliyoruz.
        for (ArrayList<Integer> row : twoDArrayList) {
            row.remove(1);
        }

        // 2D ArrayList'i yazdırma
        System.out.println("2D ArrayList:");
        for (ArrayList<Integer> row : twoDArrayList) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
