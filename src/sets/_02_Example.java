package sets;

import java.util.TreeSet;

public class _02_Example {
    public static void main(String[] args) {

        /**
         Soru: Bir TreeSet oluşturun ve içine 0 ila 100 arası 10 adet rastgele sayı ekleyin.
         Sonra TreeSet’in ilk, son, en küçük ve en büyük elemanlarını yazdırın.
         Ayrıca, TreeSet’in 20’den küçük ve 80’den büyük elemanlarını içeren bir alt kümesini yazdırın.
         */

        // Bir TreeSet oluşturun(1 ila 100 arası 10 adet rastgele sayı)
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < 10; i++) {
            int sayi = (int) (Math.random() * 101);
            treeSet.add(sayi);
        }

//        Random random=new Random();

//        for (int i = 0; i < 10; i++) {
//            int sayi2= random.nextInt(101);
//            treeSet.add(sayi2);
//        }

        // TreeSet'in elemanlarını yazdırın
        System.out.println("TreeSet'in elemanları: " + treeSet);

        // TreeSet'in ilk elemanını yazdırın
        System.out.println("TreeSet'in ilk elamanı: " + treeSet.first());

        // TreeSet'in son elemanını yazdırın
        System.out.println("TreeSet'in son elamanı: " + treeSet.last());

        // TreeSet'in en küçük elemanını yazdırın
        System.out.println("TreeSet'in en küçük elemanı: " + treeSet.first());

        // TreeSet'in en büyük elemanını yazdırın
        System.out.println("TreeSet'in en büyük elamanı: " + treeSet.last());

        // TreeSet'in 20'den küçük ve 80'den büyük elemanlarını içeren bir alt kümesini oluşturun

        TreeSet<Integer> altKume = new TreeSet<>();

        for (int sayi : treeSet) {
            if (sayi < 20 || sayi > 80) {
                altKume.add(sayi);
            }
        }

        // Alt kümenin elemanlarını yazdırın
        System.out.println("TreeSet'in 20'den küçük ve 80'den büyük elemanları: " + altKume);
    }
}
