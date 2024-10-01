package _3_ConditionalStatementsAdvanced.LAB;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());
        double price = 0;

        switch (day){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch (fruit){
                    case "banana": price = count * 2.50;
                        System.out.printf("%.2f",price); break;
                    case "apple": price = count * 1.20;
                        System.out.printf("%.2f",price); break;
                    case "orange": price = count * 0.85;
                        System.out.printf("%.2f",price); break;
                    case "grapefruit": price = count * 1.45;
                        System.out.printf("%.2f",price); break;
                    case "kiwi": price = count * 2.70;
                        System.out.printf("%.2f",price); break;
                    case "pineapple": price = count * 5.50;
                        System.out.printf("%.2f",price); break;
                    case "grapes": price = count * 3.85;
                        System.out.printf("%.2f",price); break;
                    default:
                        System.out.println("error"); break;
                } break;
            case "Saturday":
            case "Sunday":
                switch (fruit){
                    case "banana": price = count * 2.70;
                        System.out.printf("%.2f",price); break;
                    case "apple": price = count * 1.25;
                        System.out.printf("%.2f",price); break;
                    case "orange": price = count * 0.90;
                        System.out.printf("%.2f",price); break;
                    case "grapefruit": price = count * 1.60;
                        System.out.printf("%.2f",price); break;
                    case "kiwi": price = count * 3.00;
                        System.out.printf("%.2f",price); break;
                    case "pineapple": price = count * 5.60;
                        System.out.printf("%.2f",price); break;
                    case "grapes": price = count * 4.20;
                        System.out.printf("%.2f",price); break;
                    default:
                        System.out.println("error"); break;
                } break;
            default: System.out.println("error");
        }
    }
}
