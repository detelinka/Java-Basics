package Exam;

import java.util.Scanner;

public class _4_CatFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCats = Integer.parseInt(scanner.nextLine());

        int smallCats = 0;
        int bigCats = 0;
        int giganticCats = 0;
        double foodAll = 0;

        for (int i = 0; i < countCats; i++) {
            double food = Double.parseDouble(scanner.nextLine());
            if (food >= 100 && food < 200){
                smallCats++;
            }else if (food >= 200 && food < 300){
                bigCats++;
            } else if (food >= 300 && food < 400) {
                giganticCats++;
            }
            foodAll += food;
        }
        double priceG = foodAll / 1000 * 12.45;
        System.out.printf("Group 1: %d cats.%n", smallCats);
        System.out.printf("Group 2: %d cats.%n", bigCats);
        System.out.printf("Group 3: %d cats.%n", giganticCats);
        System.out.printf("Price for food per day: %.2f lv.", priceG);
    }
}
