package _4_ForLoops.Exersises;

import java.util.Scanner;

public class _6_Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actor = scanner.nextLine();
        double pointsAcademy = Double.parseDouble(scanner.nextLine());
        int countEvaluative = Integer.parseInt(scanner.nextLine());

        double sumPoints = pointsAcademy;
        for (int count = 1; count <= countEvaluative; count++) {
            String name = scanner.nextLine();
            double points = Double.parseDouble(scanner.nextLine());

             double examinerP = (name.length() * points) / 2;
            sumPoints += examinerP;

            if (sumPoints >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, Math.abs(sumPoints));
                break;
            }
        }

        if (sumPoints <1250.5){
            double neededP = 1250.5 - sumPoints;
            System.out.printf("Sorry, %s you need %.1f more!", actor, Math.abs(neededP));
        }
    }
}
