package _1_FirstStepsInCoding.Exersises;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tax = Integer.parseInt(scanner.nextLine());

        double shoes = tax - (tax * 0.40);
        double clothes = shoes - (shoes * 0.20);
        double ball = clothes /4;
        double accessories = ball / 5;

        double ALL = tax + shoes + clothes + ball + accessories;

        System.out.print(ALL);
    }
}