package _8_ExamPreparation;

import java.util.Scanner;

public class _1_FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberriesPrice = Double.parseDouble(scanner.nextLine());
        double bananasKg = Double.parseDouble(scanner.nextLine());
        double orangesKg = Double.parseDouble(scanner.nextLine());
        double raspberriesKg = Double.parseDouble(scanner.nextLine());
        double strawberriesKg = Double.parseDouble(scanner.nextLine());

        double raspberriesPrice = strawberriesPrice / 2;
        double orangesPrice = raspberriesPrice * 0.6;
        double bananasPrice = raspberriesPrice * 0.2;

        double total = (raspberriesKg * raspberriesPrice) + (orangesPrice * orangesKg) + (bananasPrice * bananasKg) + (strawberriesKg * strawberriesPrice);
        System.out.printf("%.2f", total);
    }
}
