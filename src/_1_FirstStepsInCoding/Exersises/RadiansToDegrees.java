package _1_FirstStepsInCoding.Exersises;

import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radians = Double.parseDouble(scanner.next());
        double degrees = radians * 180 /Math.PI;
         System.out.print(degrees);
    }
}
