package _1_FirstStepsInCoding.Exersises;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantityNylon = Integer.parseInt(scanner.nextLine());
        int quantityPaint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double sumNylon = (quantityNylon +2) * 1.50;
        double sumPaint = (quantityPaint + quantityPaint* 0.10) * 14.50;
        double sumThinner = thinner * 5.00;
        double sumMaterials = (sumNylon + sumThinner + sumPaint + 0.40);
        double sumWorkers = (sumMaterials * 30/100) * hours;

        double sumALL = sumMaterials + sumWorkers;
        System.out.print(sumALL);
    }
}