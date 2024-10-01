package _8_ExamPreparation;

import java.util.Scanner;

public class _2_FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        double percentAdd = Double.parseDouble(scanner.nextLine());

        if (nights > 7){
            pricePerNight = pricePerNight * 0.95;
        }
        double total = (nights * pricePerNight) + (percentAdd / 100 * budget);
        double money = Math.abs(budget - total);
        if (total <= budget){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", money);
        } else {
            System.out.printf("%.2f leva needed.", money);
        }
    }
}
