package forLoop;

public class _02_Example {

    public static void main(String[] args) {

        /**
         Javada 1'den 10'a kadar (10 dahil) olan sayıları ekrana yazdıran
         ancak 5 sayısına gelindiğinde sonlanan (5'i yazmasın) bir for döngüsü oluşturunuz.
         */

        for (int i = 1; i <=10 ; i++) {
            if(i==5){
                break;
            }
            System.out.print(i+" ");
        }

//        System.out.println();
//        for (int i = 1; i <5 ; i++) {
//            System.out.print(i+" ");
//        }


    }
}
