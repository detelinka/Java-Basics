package _6_NestedLoops.LAB;

import java.util.Scanner;

public class _5_Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();

        while(!destination.equals("End")){
            double budget = Double.parseDouble(scanner.nextLine());
            double neededMoney = 0;

            while (neededMoney < budget){
                neededMoney += Double.parseDouble(scanner.nextLine());
            }
            System.out.printf("Going to %s!%n", destination);
            destination = scanner.nextLine();
        }
    }
}
