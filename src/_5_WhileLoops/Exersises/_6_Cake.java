package _5_WhileLoops.Exersises;

import java.util.Scanner;

public class _6_Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int width = Integer.parseInt(scanner.nextLine());

        int length = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int totalSlices = length * width;


        while (!command.equals("STOP")){
            int slices = Integer.parseInt(command);
            totalSlices -= slices;

            if (totalSlices <= 0){
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(totalSlices));
                break;
            }
            command = scanner.nextLine();
        }
        if (command.equals("STOP")){
            System.out.printf("%d pieces are left.", totalSlices);
        }
    }
}
