package _7_MoreExercises._2_ConditionalStatements;

import java.util.Scanner;

public class _8_FuelTank2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuel = scanner.nextLine(); //вид гориво
        double litres = Double.parseDouble(scanner.nextLine()); //количество гориво
        String card = scanner.nextLine(); //притежание на клубна карта
        double price = 0.0;

        switch (fuel){
            case "Gas":
                price = 0.93 * litres;
                if (card.equals("Yes")) {
                    price = (0.93 - 0.08) * litres;
                }
                if (litres >= 20 && litres <= 25){
                    price = price - (price * 0.08);
                } else if (litres > 25) {
                    price = price - (price * 0.10);
                }
                break;
            case "Gasoline":
                price = 2.22 * litres;
                if (card.equals("Yes")) {
                    price = (2.22 - 0.18) * litres;
                }
                if (litres >= 20 && litres <= 25){
                    price = price - (price * 0.08);
                } else if (litres > 25) {
                    price = price - (price * 0.10);
                }
                break;
            case "Diesel":
                price = 2.33 * litres;
                if (card.equals("Yes")) {
                    price = (2.33 - 0.12) * litres;
                }
                if (litres >= 20 && litres <= 25){
                    price = price - (price * 0.08);
                } else if (litres > 25) {
                    price = price - (price * 0.10);
                }
                break;
        }  System.out.printf("%.2f lv.", price);
    }
}