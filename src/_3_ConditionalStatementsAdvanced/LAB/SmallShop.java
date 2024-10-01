package _3_ConditionalStatementsAdvanced.LAB;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());

        if (city.equals("Sofia")){
            switch (product) {
                case "coffee":
                    double price = count * 0.50;
                    System.out.printf("%.2f", price);
                    break;
                case "water":
                    price = count * 0.80;
                    System.out.printf("%.2f", price);
                    break;
                case "beer":
                    price = count * 1.20;
                    System.out.printf("%.2f", price);
                    break;
                case "sweets":
                    price = count * 1.45;
                    System.out.printf("%.2f", price);
                    break;
                case "peanuts":
                    price = count * 1.60;
                    System.out.printf("%.2f", price);
                    break;
            }
        } else if (city.equals("Plovdiv")) {
            switch (product) {
                case "coffee":
                    double price = count * 0.40;
                    System.out.printf("%.2f", price);
                    break;
                case "water":
                    price = count * 0.70;
                    System.out.printf("%.2f", price);
                    break;
                case "beer":
                    price = count * 1.15;
                    System.out.printf("%.2f", price);
                    break;
                case "sweets":
                    price = count * 1.30;
                    System.out.printf("%.2f", price);
                    break;
                case "peanuts":
                    price = count * 1.50;
                    System.out.printf("%.2f", price);
                    break;
            }

        } else if (city.equals("Varna")) {
            switch (product) {
                case "coffee":
                    double price = count * 0.45;
                    System.out.printf("%.2f", price);
                    break;
                case "water":
                    price = count * 0.70;
                    System.out.printf("%.2f", price);
                    break;
                case "beer":
                    price = count * 1.10;
                    System.out.printf("%.2f", price);
                    break;
                case "sweets":
                    price = count * 1.35;
                    System.out.printf("%.2f", price);
                    break;
                case "peanuts":
                    price = count * 1.55;
                    System.out.printf("%.2f", price);
                    break;
            }
        }
    }
}
