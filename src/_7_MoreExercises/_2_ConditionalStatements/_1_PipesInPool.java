package _7_MoreExercises._2_ConditionalStatements;

import java.util.Scanner;

public class _1_PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double v = Double.parseDouble(scanner.nextLine()); //обем на басейна в литри
        double p1 = Double.parseDouble(scanner.nextLine()); //дебит на първата тръба за час
        double p2 = Double.parseDouble(scanner.nextLine()); //дебит на втората тръба за час
        double h = Double.parseDouble(scanner.nextLine()); //часовете които работникът отсъства

        double pipe1 = p1 * h;
        double pipe2 = p2 * h;
        double litre = pipe2 + pipe1;
        double percentFull = (litre / v) * 100;
        double percentPipe1 = (pipe1 / litre) * 100;
        double percentPipe2 = (pipe2 / litre) * 100;
        double litreOver = litre - v;

        String op = "%";

        if (v >= litre){
            System.out.printf("The pool is %.2f%s full. Pipe 1: %.2f%s. Pipe 2: %.2f%s.",
                                percentFull, op, percentPipe1, op, percentPipe2, op);
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", h, litreOver);
        }

    }
}
