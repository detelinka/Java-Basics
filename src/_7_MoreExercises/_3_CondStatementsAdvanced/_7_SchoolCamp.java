package _7_MoreExercises._3_CondStatementsAdvanced;

import java.util.Scanner;

public class _7_SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String group = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());

        String sport = "";
        double price = count * nights;

        switch (season){
            case "Winter":
            switch (group){
                case "mixed":
                    sport = "Ski";
                    price *= 10; break;
                case "girls":
                    sport = "Gymnastics";
                    price *= 9.60; break;
                case "boys":
                    sport = "Judo";
                    price *= 9.60; break;
            }
            break;
            case "Spring":
            switch (group){
                case "mixed":
                    sport = "Cycling";
                    price *= 9.50; break;
                case "girls":
                    sport = "Athletics";
                    price *= 7.20; break;
                case "boys":
                    sport = "Tennis";
                    price *= 7.20; break;
            }
            break;
            case "Summer":
            switch (group){
                case "mixed":
                    sport = "Swimming";
                    price *= 20; break;
                case "girls":
                    sport = "Volleyball";
                    price *= 15; break;
                case "boys":
                    sport = "Football";
                    price *= 15; break;
            }
            break;
        }
        if (count >= 50){
            price *= 0.50;
        }else if (count >= 20){
            price *= 0.85;
        }else if (count >= 10){
            price *= 0.95;
        }


        System.out.printf("%s %.2f lv.", sport, price);
    }
}