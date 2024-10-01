package _3_ConditionalStatementsAdvanced.Exersises;

import java.util.Scanner;

public class _5_Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        //do 100lv -Bulgaria ; do 1000lv - Balkans; nad 1000lv - Europe (hotel)
        String season = scanner.nextLine(); //summer - camping or winter - hotel

        switch (season) {
            case "summer":
            if (budget <= 100) { //Bulgaria - 30% of budget - camp
                double price = budget * 0.30;
                System.out.printf("Somewhere in Bulgaria  %nCamp - %.2f", price);


            } else if (budget <= 1000) { //Balkans - 40% of budget - camp
                double price = budget * 0.40;
                System.out.printf("Somewhere in Balkans  %nCamp - %.2f", price);


            } else if (budget > 1000) { // Europe - 90% of budget - hotel
                double price = budget * 0.90;
                System.out.printf("Somewhere in Europe  %nHotel - %.2f", price);

            } break;

            case "winter":
            if (budget <= 100) { //Bulgaria - 70% of budget - hotel
                double price = budget * 0.70;
                System.out.printf("Somewhere in Bulgaria  %nHotel - %.2f", price);


            } else if (budget <= 1000) { //Balkans - 80% of budget - hotel
                double price = budget * 0.80;
                System.out.printf("Somewhere in Balkans  %nHotel - %.2f", price);


            } else if (budget > 1000) { // Europe - 90% of budget - hotel
                double price = budget * 0.90;
                System.out.printf("Somewhere in Europe  %nHotel - %.2f", price);

            } break;
        }
    }
}
