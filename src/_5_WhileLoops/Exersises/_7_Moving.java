package _5_WhileLoops.Exersises;

import java.util.Scanner;

public class _7_Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int spaceLeft = width * length * height;
        String command = scanner.nextLine();

        while(!command.equals("Done")){
            int boxes = Integer.parseInt(command);
            spaceLeft -= boxes;
            if (spaceLeft < 0){
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(spaceLeft));
                break;
            }
            command = scanner.nextLine();
        }
        if (command.equals("Done")){
            System.out.printf("%d Cubic meters left.", spaceLeft);
        }
    }
}
