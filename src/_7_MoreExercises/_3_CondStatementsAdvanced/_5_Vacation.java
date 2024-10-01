package _7_MoreExercises._3_CondStatementsAdvanced;

import java.util.Scanner;

public class _5_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget =  Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine(); // Summer и Winter

        String place = "";
        String country = "";
        double price = 0.0;

        if (budget <= 1000){
            place = "Camp";
            switch (season){
                case "Summer":
                    country = "Alaska";
                    price = budget * 0.65;
                    break;
                case "Winter":
                    country = "Morocco";
                    price = budget * 0.45;
                    break;
            }
        } else if (budget > 1000 && budget <=3000) {
            place = "Hut";
            switch (season){
                case "Summer":
                    country = "Alaska";
                    price = budget * 0.80;
                    break;
                case "Winter":
                    country = "Morocco";
                    price = budget * 0.60;
                    break;
            }
        } else {
            place = "Hotel";
            price = budget * 0.90;
            switch (season){
                case "Summer":
                    country = "Alaska";
                    break;
                case "Winter":
                    country = "Morocco";
                    break;
            }
        }
        System.out.printf("%s - %s - %.2f", country, place, price);
    }
}