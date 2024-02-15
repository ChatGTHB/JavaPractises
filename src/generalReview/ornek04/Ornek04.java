package generalReview.ornek04;

import java.util.Scanner;

public class Ornek04 {
    public static void main(String[] args) {

        int artikYil;
        boolean artikMi = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz: ");
        artikYil = input.nextInt();

        if (artikYil % 4 == 0) {
            if (artikYil % 100 == 0) {
                if (artikYil % 400 == 0){
                    artikMi=true;
                }
            }else{
                artikMi=true;
            }
        }

        if(artikMi){
            System.out.println(artikYil+ " artık yıldır.");
        }else{
            System.out.println(artikYil+ " artık yıl değildir.");
        }
    }
}
