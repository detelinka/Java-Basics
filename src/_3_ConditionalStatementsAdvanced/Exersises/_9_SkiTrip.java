package _3_ConditionalStatementsAdvanced.Exersises;

import java.util.Scanner;

public class _9_SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String review = scanner.nextLine();

        int nights = days - 1;
        double total = 0.0;
        double discount1 = 0.0;

        switch (room){
            case "room for one person":
                total = nights * 18.00;
                if (review.equals("positive")){
                    total = total + (0.25 * total);
                } else if (review.equals("negative")) {
                    total = total - (0.10 * total);
                }System.out.printf("%.2f", total);
                break;

            case "apartment":
                total = nights * 25.00;
                if (days < 10){
                    discount1 = total * 0.30;
                    total = total -discount1;
                    if (review.equals("positive")){
                        total = total + (0.25 * total);
                    } else if (review.equals("negative")) {
                        total = total - (0.10 * total);
                    }System.out.printf("%.2f", total);

                } else if (days <= 15) {
                    discount1 = total * 0.35;
                    total = total -discount1;
                    if (review.equals("positive")){
                        total = total + (0.25 * total);
                    } else if (review.equals("negative")) {
                        total = total - (0.10 * total);
                    }System.out.printf("%.2f", total);

                }else {
                    discount1 = total * 0.50;
                    total = total -discount1;
                    if (review.equals("positive")){
                        total = total + (0.25 * total);
                    } else if (review.equals("negative")) {
                        total = total - (0.10 * total);
                    }System.out.printf("%.2f", total);
                }
                break;

            case "president apartment":
                total = nights * 35.00;
                if (days < 10){
                    discount1 = total * 0.10;
                    total = total -discount1;
                    if (review.equals("positive")){
                        total = total + (0.25 * total);
                    } else if (review.equals("negative")) {
                        total = total - (0.10 * total);
                    }System.out.printf("%.2f", total);

                } else if (days <= 15) {
                    discount1 = total * 0.15;
                    total = total -discount1;
                    if (review.equals("positive")){
                        total = total + (0.25 * total);
                    } else if (review.equals("negative")) {
                        total = total - (0.10 * total);
                    }System.out.printf("%.2f", total);

                }else {
                    discount1 = total * 0.20;
                    total = total -discount1;
                    if (review.equals("positive")){
                        total = total + (0.25 * total);
                    } else if (review.equals("negative")) {
                        total = total - (0.10 * total);
                    }System.out.printf("%.2f", total);

                }
                break;
        }
    }
}
