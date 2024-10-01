package Exam;

import java.util.Scanner;

public class _3_FootballSouvenirs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String team = scanner.nextLine();
        String souvenirs = scanner.nextLine();
        int countSouvenirs = Integer.parseInt(scanner.nextLine());

        double price = 0.0;

        switch (team){
            case "Argentina":
            switch (souvenirs){
                case "flags": price = countSouvenirs * 3.25; System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countSouvenirs, souvenirs, team, price); break;
                case "caps": price = countSouvenirs * 7.20; System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countSouvenirs, souvenirs, team, price); break;
                case "posters": price = countSouvenirs * 5.10; System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countSouvenirs, souvenirs, team, price); break;
                case "stickers": price = countSouvenirs * 1.25; System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countSouvenirs, souvenirs, team, price); break;
                default: System.out.println("Invalid stock!"); break;
            }break;
            case "Brazil":
                switch (souvenirs){
                    case "flags": price = countSouvenirs * 4.20; System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countSouvenirs, souvenirs, team, price); break;
                    case "caps": price = countSouvenirs * 8.50; System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countSouvenirs, souvenirs, team, price); break;
                    case "posters": price = countSouvenirs * 5.35; System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countSouvenirs, souvenirs, team, price); break;
                    case "stickers": price = countSouvenirs * 1.20; System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countSouvenirs, souvenirs, team, price); break;
                    default: System.out.println("Invalid stock!"); break;
                }break;
            case "Croatia":
                switch (souvenirs){
                    case "flags": price = countSouvenirs * 2.75; System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countSouvenirs, souvenirs, team, price); break;
                    case "caps": price = countSouvenirs * 6.90; System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countSouvenirs, souvenirs, team, price); break;
                    case "posters": price = countSouvenirs * 4.95; System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countSouvenirs, souvenirs, team, price); break;
                    case "stickers": price = countSouvenirs * 1.10; System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countSouvenirs, souvenirs, team, price); break;
                    default: System.out.println("Invalid stock!"); break;
                }break;
            case "Denmark":
                switch (souvenirs){
                    case "flags": price = countSouvenirs * 3.10; System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countSouvenirs, souvenirs, team, price); break;
                    case "caps": price = countSouvenirs * 6.50; System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countSouvenirs, souvenirs, team, price); break;
                    case "posters": price = countSouvenirs * 4.80; System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countSouvenirs, souvenirs, team, price); break;
                    case "stickers": price = countSouvenirs * 0.90; System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countSouvenirs, souvenirs, team, price); break;
                    default: System.out.println("Invalid stock!"); break;
                }break;
            default: System.out.println("Invalid country!"); break;

        }
    }
}
