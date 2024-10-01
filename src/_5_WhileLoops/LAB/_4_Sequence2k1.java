package _5_WhileLoops.LAB;

import java.util.Scanner;

public class _4_Sequence2k1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int number = 1; // започва от 1
        while (number <= n){
            System.out.println(number);
            number = number * 2 +1;
            // принтира числото умножено по 2 + 1 докато не стигне n
        }
    }
}
