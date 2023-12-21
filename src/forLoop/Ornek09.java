package forLoop;

public class Ornek09 {

    public static void main(String[] args) {

        // 1 den 7 ye kadar (7 dahil) olan sayıların toplamını aşağıdaki gibi yazdırınız.

        // Toplama tablosu

        // 1 + 1 = 2
        // 1 + 2 = 3
        // 1 + 3 = 4
        // 1 + 4 = 5
        // 1 + 5 = 6
        // .....
        // 7 + 1 = 8
        // 7 + 2 = 9
        // 7 + 3 = 10
        // 7 + 4 = 11
        // 7 + 5 = 12
        // ......

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println(i + " + " + j + " = " + (i + j));
            }
            System.out.println();
        }
    }
}
