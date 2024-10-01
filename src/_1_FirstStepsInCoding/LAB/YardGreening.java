package _1_FirstStepsInCoding.LAB;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double meters = Double.parseDouble(scanner.nextLine());
        double price = meters * 7.61;
        double discount = price * 0.18;
        double priceWithDiscount = price - discount;

        System.out.println("The final price is: " + priceWithDiscount + " lv.");
        System.out.println("The discount is: " + discount + " lv.");

    }
}
