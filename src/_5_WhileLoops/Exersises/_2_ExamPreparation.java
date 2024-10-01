package _5_WhileLoops.Exersises;

import java.util.Scanner;

public class _2_ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int allowedMistakes = Integer.parseInt(scanner.nextLine());
        String task = scanner.nextLine();
        int grade = Integer.parseInt(scanner.nextLine());

        int countMistakes = 0;
        int countGrades = 0;
        double average = 0.0;
        int sum = 0;
        String last = "";

        while (!task.equals("Enough")){
            last = task;
            if (grade <= 4){
                countMistakes++;
            }
            if (countMistakes == allowedMistakes){
                System.out.printf("You need a break, %d poor grades.", allowedMistakes);
                break;
            }
            countGrades++;
            sum += grade;
            average = sum * 1.0 / countGrades;
            task = scanner.nextLine();
            if (task.equals("Enough")){
                break;
            }
            grade = Integer.parseInt(scanner.nextLine());

        }
        if (task.equals("Enough")) {
            System.out.printf("Average score: %.2f%n", average);
            System.out.printf("Number of problems: %d%n", countGrades);
            System.out.printf("Last problem: %s", last);

        }
    }
}
