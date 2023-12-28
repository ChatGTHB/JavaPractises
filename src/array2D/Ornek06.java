package array2D;

public class Ornek06 {
    public static void main(String[] args) {

        /**
         Soru: 3 farklı dersin 10'ar random notunu içeren çok boyutlu bir Array oluşturup içini doldurunuz ve notları tek tek yazdırınız.

         İpuçları:
         1. Tüm ders notlarını saklamak için bir 2 boyutlu dizi oluşturun. Bu dizi 3 satır ve 10 sütundan oluşmalıdır.
         2. İki adet döngü kullanarak, her bir dersin notlarını rastgele bir şekilde oluşturun ve ilgili dizilere kaydedin.
         İlk döngü dersleri temsil ederken, ikinci döngü notları temsil etmelidir.
         3. Her bir not oluşturulduğunda, ders ve not numarasını kullanarak ekrana yazdırın.
         */

//        int[] ders1Notlari = new int[10];
//        int[] ders2Notlari = new int[10];
//        int[] ders3Notlari = new int[10];

        int[][] tumDersNotlari = new int[3][10];

        for (int ders = 0; ders < tumDersNotlari.length; ders++) {
            for (int not = 0; not < tumDersNotlari[ders].length; not++) {
                tumDersNotlari[ders][not] = (int) (Math.random() * 101);
                System.out.println((ders + 1) + ".ders " + (not + 1) + ". not= "+tumDersNotlari[ders][not]);
            }
            System.out.println();
        }

//        for (int i = 0; i < tumDersNotlari.length; i++) {
//            for (int j = 0; j < tumDersNotlari[i].length; j++) {
//                tumDersNotlari[i][j] = (int) (Math.random() * 101);
//                System.out.println((i + 1) + ".i " + (j + 1) + ". j= "+tumDersNotlari[i][j]);
//            }
//            System.out.println();
//        }
    }
}
