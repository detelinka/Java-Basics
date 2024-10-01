package _3_ConditionalStatementsAdvanced.Exersises;

import java.util.Scanner;

public class _1_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ticket = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double incomePremiere = rows * columns * 12.00;
        double incomeNormal = rows * columns * 7.50;
        double incomeDiscount = rows * columns * 5.00;

        switch (ticket) {
            case "Premiere": System.out.printf("%.2f leva", incomePremiere); break;
            case "Normal": System.out.printf("%.2f leva", incomeNormal); break;
            case "Discount": System.out.printf("%.2f leva", incomeDiscount); break;
        }
    }
}