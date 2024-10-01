package _8_ExamPreparation;

import java.util.Scanner;

public class _6_BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String start = scanner.nextLine();
        String end = scanner.nextLine();

        int start1 = Integer.parseInt(String.valueOf(start.charAt(0)));
        int start2 = Integer.parseInt(String.valueOf(start.charAt(1)));
        int start3 = Integer.parseInt(String.valueOf(start.charAt(2)));
        int start4 = Integer.parseInt(String.valueOf(start.charAt(3)));

        int end1 = Integer.parseInt(String.valueOf(end.charAt(0)));
        int end2 = Integer.parseInt(String.valueOf(end.charAt(1)));
        int end3 = Integer.parseInt(String.valueOf(end.charAt(2)));
        int end4 = Integer.parseInt(String.valueOf(end.charAt(3)));

        for (int i = start1; i <= end1 ; i++) {
            for (int j = start2; j <= end2 ; j++) {
                for (int k = start3; k <= end3; k++) {
                    for (int l = start4; l <= end4; l++) {

                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0){
                            System.out.printf("%d%d%d%d ",i ,j, k, l);
                        }
                    }
                }
            }
        }
    }
}
