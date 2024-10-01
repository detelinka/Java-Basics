package _7_MoreExercises._2_ConditionalStatements;

import java.util.Scanner;

public class _7_FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuel = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        switch (fuel){
            case "Diesel":
                if (n >= 25){
                    System.out.println("You have enough diesel.");
                }else {
                    System.out.println("Fill your tank with diesel!");
                }
                break;
            case "Gasoline":
                if (n >= 25){
                    System.out.println("You have enough gasoline.");
                }else {
                    System.out.println("Fill your tank with gasoline!");
                }
                break;
            case "Gas":
                if (n >= 25){
                    System.out.println("You have enough gas.");
                }else {
                    System.out.println("Fill your tank with gas!");
                }
                break;
            default:
                System.out.println("Invalid fuel!");
        }
    }
}