package Exam;

import java.util.Scanner;

public class _5_PuppyCare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int foodKg = Integer.parseInt(scanner.nextLine());
        String foodG = scanner.nextLine();

        int allFood = 0;
        while (!foodG.equals("Adopted")){
            int food = Integer.parseInt(foodG);
            allFood += food;
            foodG = scanner.nextLine();
        }
        if (allFood <= foodKg * 1000){
            System.out.printf("Food is enough! Leftovers: %d grams.", foodKg * 1000 - allFood);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", allFood - foodKg * 1000);
        }
    }
}
