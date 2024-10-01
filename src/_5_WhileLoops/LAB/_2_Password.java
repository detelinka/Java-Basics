package _5_WhileLoops.LAB;

import java.util.Scanner;

public class _2_Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine(); // username
        String pass = scanner.nextLine(); // password

        String input = scanner.nextLine(); // опит за парола

        while (!input.equals(pass)){
            input = scanner.nextLine();
            // цикъла върви докато не се изпише парола същата като правилната
        }
        System.out.printf("Welcome %s!", user);
    }
}
