package _1_FirstStepsInCoding.LAB;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());

        int time = projects * 3;

        System.out.print("The architect " + name + " will need " + time + " hours to complete " + projects+ " project/s.");

    }
}
