package _14_ForLoop;

public class _02_Example {
    public static void main(String[] args) {
        /**
         Javada 1'den 10'a kadar olan sayıları ekrana yazdıran
         ancak 5 sayısına gelindiğinde sonlanan bir for döngüsü oluşturunuz.
         */

        for (int i = 1; i < 11; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
