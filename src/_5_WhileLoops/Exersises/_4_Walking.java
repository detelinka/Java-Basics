package _5_WhileLoops.Exersises;

import java.util.Scanner;

public class _4_Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

         int steps = 0;

         while (!command.equals("Going home")) {
             int steps1 = Integer.parseInt(command);
             steps += steps1;

             if (steps >= 10000) {
                 break;
             }
             command = scanner.nextLine();

         }
             if (command.equals("Going home")){
                 int stepsHome = Integer.parseInt(scanner.nextLine());
                 steps += stepsHome;
             }

             if (steps >= 10000) {
                 System.out.printf("Goal reached! Good job!%n%d steps over the goal!", steps - 10000);
             } else {
                 System.out.printf("%d more steps to reach goal.", 10000 - steps);
             }
    }
}
