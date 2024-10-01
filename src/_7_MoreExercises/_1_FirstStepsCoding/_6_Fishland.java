package _7_MoreExercises._1_FirstStepsCoding;

import java.util.Scanner;

public class _6_Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceMackerel = Double.parseDouble(scanner.nextLine()); // цена на скумрия на кг
        double priceSprinkle = Double.parseDouble(scanner.nextLine()); // цена на цаца на кг
        double kgBonito = Double.parseDouble(scanner.nextLine()); // кг паламуд
        double kgSafrid = Double.parseDouble(scanner.nextLine()); // кг сафрид
        double kgMussels = Double.parseDouble(scanner.nextLine()); // кг миди

        //паламуд: 60% по скъп от скумрията
        //сафрид: 80% по скъп от цацата
        //миди: 7.50лв на кг

        double bonito = kgBonito * (priceMackerel + priceMackerel * 0.60); //сума на паламуда
        double safrid = kgSafrid * (priceSprinkle + priceSprinkle * 0.80); //сума на сафрида
        double mussels = kgMussels * 7.50; // сума на миди

        double total = bonito + safrid + mussels;

        System.out.printf("%.2f", total);
    }
}