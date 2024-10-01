package _8_ExamPreparation;

import java.util.Scanner;

public class _5_EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eggs1 = Integer.parseInt(scanner.nextLine());
        int eggs2 = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        boolean winner = false;

        while (!command.equals("End")){

            if (command.equals("one")){
                eggs2--;
                if (eggs2 <= 0){
                    System.out.printf("Player two is out of eggs. Player one has %d eggs left.", eggs1);
                    winner = true;
                    break;
                }
            } else {
                eggs1--;
                if (eggs1 <= 0){
                    System.out.printf("Player one is out of eggs. Player two has %d eggs left.", eggs2);
                   winner = true;
                    break;
                }
            }
            command = scanner.nextLine();
        }
        if (!winner) {
            System.out.printf("Player one has %d eggs left.%n", eggs1);
            System.out.printf("Player two has %d eggs left.", eggs2);
        }
    }
}
