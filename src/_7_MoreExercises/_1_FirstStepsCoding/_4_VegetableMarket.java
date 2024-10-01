package _7_MoreExercises._1_FirstStepsCoding;

import java.util.Scanner;

public class _4_VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceVeggie = Double.parseDouble(scanner.nextLine());
        double priceFruits = Double.parseDouble(scanner.nextLine());
        int kgVeggie = Integer.parseInt(scanner.nextLine());
        int kgFruits = Integer.parseInt(scanner.nextLine());

        double totalVeggie  =(priceVeggie * kgVeggie) / 1.94;
        double totalFruits = (priceFruits * kgFruits) / 1.94;
        double total = totalFruits + totalVeggie;

        System.out.printf("%.2f", total);
    }
}
