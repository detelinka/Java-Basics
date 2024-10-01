package _3_ConditionalStatementsAdvanced.Exersises;

import java.util.Scanner;

public class _7_HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double apartmentPrice = 0.0;
        double studioPrice = 0.0;

        switch (month) {
            case "May":
            case "October":
                apartmentPrice = 65 * nights;
                studioPrice = 50 * nights;
                if (nights < 14 && nights > 7){
                    studioPrice = studioPrice - (0.05 * studioPrice);
                } else if (nights > 14) {
                    studioPrice = studioPrice - (0.30 * studioPrice);
                    apartmentPrice = apartmentPrice - (0.10 * apartmentPrice);
                }
                System.out.printf("Apartment: %.2f lv. %nStudio: %.2f lv.", apartmentPrice, studioPrice);
                break;

            case "June":
            case "September":
                apartmentPrice = 68.70 * nights;
                studioPrice = 75.20 * nights;
                if (nights > 14){
                    studioPrice = studioPrice - (0.20 * studioPrice);
                    apartmentPrice = apartmentPrice - (0.10 * apartmentPrice);
                }
                System.out.printf("Apartment: %.2f lv. %nStudio: %.2f lv.", apartmentPrice, studioPrice);
                break;

            case "July":
            case "August":
                apartmentPrice = 77 * nights;
                studioPrice = 76 * nights;
                if (nights > 14){
                    apartmentPrice = apartmentPrice - (0.10 * apartmentPrice);
                }
                System.out.printf("Apartment: %.2f lv. %nStudio: %.2f lv.", apartmentPrice, studioPrice);
                break;
        }
    }
}