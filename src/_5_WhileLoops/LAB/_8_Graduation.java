package _5_WhileLoops.LAB;

import java.util.Scanner;

public class _8_Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int counterYears = 1;
        double sumGrade = 0.0;
        int counterExcluded = 0;

        while (counterYears <= 12) {
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade < 4.0) {
                counterExcluded++;
            } else {
                counterYears++;
            }
            if (counterExcluded > 1){
                break;
            }

            sumGrade += grade;
        }

        if (counterExcluded > 1) {
            System.out.printf("%s has been excluded at %d grade", name, counterYears);
        } else {
            double average = sumGrade / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, average);
        }
    }
}
