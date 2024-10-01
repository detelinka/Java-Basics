package _7_MoreExercises._1_FirstStepsCoding;

import java.util.Scanner;

public class _7_HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine()); //височината на къщата
        double y = Double.parseDouble(scanner.nextLine()); //дължината на страничната стена
        double h = Double.parseDouble(scanner.nextLine()); //височината на триъгълната стена на покрива

        double door = 1.20 * 2.00;
        double windows = 2 * (1.5 * 1.5);

        // стени
        double walls1 = 2 * (x * y) - windows;
        double walls2 = 2 * (x * x) - door;
        double wallsArea = walls2 + walls1;
        double green =wallsArea / 3.4;

        // покрив
        double roof1 = 2 * (x * y);
        double roof2 = 2 * (x * h /2);
        double roofArea = roof1 + roof2;
        double red = roofArea / 4.3;

        System.out.printf("%.2f %n%.2f", green, red);
        }
    }