package _1_FirstStepsInCoding.Exersises;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int veggie = Integer.parseInt(scanner.nextLine());

        double ChickenPrice = chicken * 10.35;
        double FishPrice = fish * 12.40;
        double VeggiePrice = veggie * 8.15;

        double SumFood = ChickenPrice + FishPrice + VeggiePrice;
        double sumDessert = 0.20 * SumFood;

        System.out.print(SumFood + sumDessert + 2.50);

    }
}
