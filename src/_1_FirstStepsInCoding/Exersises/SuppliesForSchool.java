package _1_FirstStepsInCoding.Exersises;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int cleaner = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double pricePens = pens * 5.80;
        double priceMarkers = markers * 7.20;
        double priceCleaner = cleaner * 1.20;
        double priceAll = priceCleaner + priceMarkers + pricePens;

        System.out.print(priceAll - (priceAll*(discount/100)));


    }
}
