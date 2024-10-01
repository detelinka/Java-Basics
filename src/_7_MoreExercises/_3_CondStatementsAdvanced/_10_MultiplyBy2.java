package _7_MoreExercises._3_CondStatementsAdvanced;

import java.util.Scanner;

public class _10_MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            float number = scanner.nextFloat();

            if (number < 0){
                System.out.println("Negative number!");
                break;
            }

            float total = number * 2;
            System.out.printf("Result: %.2f%n", total);
        }
    }
}