package generalReview.ornek02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ornek02 {

    public static void main(String[] args) {

        /*
        Java ile Matematik, Fizik, Kimya, Türkçe, Tarih ve Müzik
        derslerinin sınav puanlarını kullanıcıdan alan ve
        ortalamalarını hesaplayıp ekrana bastıran programı yazın.

        Not : If ve Else kullanılmayacak...
         */

        Scanner input = new Scanner(System.in);

        List<String> lessons = new ArrayList<>(Arrays.asList("Matematik", "Fizik", "Kimya", "Türkçe", "Tarih", "Müzik"));

        int total = 0;

        for (String lesson : lessons) {
            System.out.print(lesson + " notunuzu giriniz: ");
            int examGrade = input.nextInt();
            // total = total + examGrade;
            total += examGrade;
        }

        double averageGrade = total / lessons.size();

        System.out.println("Average Grade = " + averageGrade);
        System.out.println(averageGrade >= 60 ? "Passed the Class" : "Failed in Class");

    }
}
