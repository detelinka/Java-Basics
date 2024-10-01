package _7_MoreExercises._3_CondStatementsAdvanced;

import java.util.Scanner;

public class _4_CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String clas = "";
        String car = "";
        double price = 0.0;

        if (budget <= 100){
            clas = "Economy class";
            switch (season){
                case "Summer":
                    car = "Cabrio";
                    price = 0.35 * budget;
                    break;
                case "Winter":
                    car = "Jeep";
                    price = 0.65 * budget;
                    break;
            }
        } else if (budget > 500) {
            clas = "Luxury class";
            car = "Jeep";
            switch (season){
                case "Summer":
                case "Winter":
                    price = 0.90 * budget;
                    break;
            }

        } else { // между 100 и 500
            clas = "Compact class";
            switch (season){
                case "Summer":
                    car = "Cabrio";
                    price = 0.45 * budget;
                    break;
                case "Winter":
                    car = "Jeep";
                    price = 0.80 * budget;
                    break;
            }
        }
        System.out.printf("%s%n%s - %.2f", clas, car, price);
    }
}
