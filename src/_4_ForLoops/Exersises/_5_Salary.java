package _4_ForLoops.Exersises;

import java.util.Scanner;

public class _5_Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());

        for (int i = 1; i <= count ; i++) {
            String tabs = scanner.nextLine();

            switch (tabs){
                case "Facebook": salary -= 150; break;
                case "Instagram": salary -= 100; break;
                case "Reddit": salary -= 50; break;
            }
        }

        if (salary <= 0){
            System.out.println("You have lost your salary.");
        } else {
            System.out.printf("%.0f", salary);
        }
    }
}
