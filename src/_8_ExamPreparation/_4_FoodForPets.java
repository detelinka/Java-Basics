package _8_ExamPreparation;

import java.util.Scanner;

public class _4_FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day =  Integer.parseInt(scanner.nextLine());
        double food = Double.parseDouble(scanner.nextLine());

        double biscuits = 0;
        double dog = 0.0;
        double cat = 0.0;

        for (int i = 1; i <= day; i++){
            double dogFood = Double.parseDouble(scanner.nextLine());
            double catFood = Double.parseDouble(scanner.nextLine());

            dog += dogFood;
            cat += catFood;

            if (i % 3 == 0){
                double biscuits1 = (dogFood + catFood) * 0.1;
                biscuits += biscuits1;
            }
        }

        double totalFood = cat + dog;
        double totalFoodPercent = totalFood / food * 100;
        double dogFoodPercent = dog / totalFood * 100;
        double catFoodPercent = cat / totalFood * 100;

        System.out.printf("Total eaten biscuits: %dgr.%n", Math.round(biscuits));
        System.out.printf("%.2f%% of the food has been eaten.%n", totalFoodPercent);
        System.out.printf("%.2f%% eaten from the dog.%n", dogFoodPercent);
        System.out.printf("%.2f%% eaten from the cat.", catFoodPercent);

    }
}
