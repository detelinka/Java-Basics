package _4_ForLoops.Exersises;

import java.util.Scanner;

public class _7_TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countGroups = Integer.parseInt(scanner.nextLine());

        int allPeople = 0;
        double musala = 0;
        double monblan = 0;
        double kilimandjaro = 0;
        double k2 = 0;
        double everest = 0;

        for (int i = 1; i <= countGroups; i++) {
            int peoplePerGroup = Integer.parseInt(scanner.nextLine());
            allPeople += peoplePerGroup;

            if (peoplePerGroup <= 5){
                musala += peoplePerGroup;
            } else if (peoplePerGroup <= 12){
                monblan += peoplePerGroup;
            }else if (peoplePerGroup <= 25){
                kilimandjaro += peoplePerGroup;
            } else if (peoplePerGroup <= 40){
                k2 += peoplePerGroup;
            } else {
                everest += peoplePerGroup;
            }
        }

        musala = musala / allPeople * 100;
        monblan = monblan / allPeople * 100;
        kilimandjaro = kilimandjaro / allPeople * 100;
        k2 = k2 / allPeople * 100;
        everest= everest / allPeople * 100;


        System.out.printf("%.2f%%%n",musala);
        System.out.printf("%.2f%%%n",monblan);
        System.out.printf("%.2f%%%n",kilimandjaro);
        System.out.printf("%.2f%%%n",k2);
        System.out.printf("%.2f%%",everest);
    }
}
