package _4_ForLoops.Exersises;

import java.util.Scanner;

public class _8_TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournaments = Integer.parseInt(scanner.nextLine());
        double startPoints = Double.parseDouble(scanner.nextLine());
        double countW = 0;
        double sumPoints = startPoints;

        for (int i = 1; i <= tournaments ; i++) {
            String place = scanner.nextLine();

            switch (place){
                case "W": sumPoints += 2000; countW++; break;
                case "F": sumPoints += 1200; break;
                case "SF": sumPoints += 720; break;
            }

        }
        double average = Math.floor((sumPoints - startPoints)/ tournaments);
        double percentW = countW / tournaments * 100;
        System.out.printf("Final points: %.0f%nAverage points: %.0f%n%.2f%%", sumPoints, average, percentW);
    }
}
