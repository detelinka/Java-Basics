package _7_MoreExercises._2_ConditionalStatements;

import java.util.Scanner;

public class _5_Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine()); //брой дни
        int kgFood = Integer.parseInt(scanner.nextLine()); //оставена храна в килограми
        double kgDog = Double.parseDouble(scanner.nextLine()); //храна на ден за кучето в килограми
        double kgCat = Double.parseDouble(scanner.nextLine()); // храна на ден за котката в килограми
        double gTurtle = Double.parseDouble(scanner.nextLine()); //храна на ден за костенурката в грамове

        double dog = kgDog * days;
        double cat = kgCat * days;
        double turtle = (gTurtle / 1000) * days;
        double food = dog + cat + turtle; // нужна храна в килограми

        if (food < kgFood){
            double foodLeft = Math.floor(kgFood - food);
            System.out.printf("%.0f kilos of food left.", foodLeft);
        }else {
            double foodNeeded = Math.ceil(food - kgFood);
            System.out.printf("%.0f more kilos of food are needed.", foodNeeded);
        }
    }
}