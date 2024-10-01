package _7_MoreExercises._1_FirstStepsCoding;

import java.util.Scanner;

public class _10_WeatherForecast2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double degrees = Double.parseDouble(scanner.nextLine());
        
        if (degrees <= 11.9){
            System.out.println("Cold");
        } else if (degrees <= 14.9){
            System.out.println("Cool");
        } else if (degrees <= 20.00) {
            System.out.println("Mild");
        } else if (degrees <= 25.9) {
            System.out.println("Warm");
        } else if (degrees <= 35.00) {
            System.out.println("Hot");
        }else {
            System.out.println("unknown");
        }
    }
}
