package _7_MoreExercises._1_FirstStepsCoding;

import java.util.Scanner;

public class _9_WeatherForecast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        if (a.equals("sunny")) {
            System.out.println("It's warm outside!");
        } else {
            System.out.println("It's cold outside!");
        }
    }
}
