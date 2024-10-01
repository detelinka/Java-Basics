package _1_FirstStepsInCoding.LAB;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int DogFood = Integer.parseInt(scanner.nextLine());
        int CatFood = Integer.parseInt(scanner.nextLine());

        double dogprice = DogFood * 2.50;
        double catprice = CatFood * 4;
        double allsum = catprice + dogprice;

        System.out.print(allsum + " lv.");

    }
}
