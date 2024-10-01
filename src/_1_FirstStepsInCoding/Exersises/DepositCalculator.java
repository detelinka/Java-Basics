package _1_FirstStepsInCoding.Exersises;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double depositedSum = Double.parseDouble(scanner.nextLine());
        int deadline = Integer.parseInt(scanner.nextLine());
        double interest = Double.parseDouble(scanner.nextLine());
        double lihva = depositedSum * (interest/100);
        double lihvaFor1Month = lihva /12;
         double sum =  depositedSum + deadline * lihvaFor1Month;

         System.out.print(sum);

    }
}