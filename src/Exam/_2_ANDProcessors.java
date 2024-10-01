package Exam;

import java.util.Scanner;

public class _2_ANDProcessors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countProcessors = Integer.parseInt(scanner.nextLine());
        int countWorkers = Integer.parseInt(scanner.nextLine());
        int countDays = Integer.parseInt(scanner.nextLine());

        double hours = (countWorkers * countDays * 8);
        double processors = Math.floor(hours / 3);

        if (processors < countProcessors){
            double loss = (countProcessors - processors) * 110.10;
            System.out.printf("Losses: -> %.2f BGN", loss);
        }else {
            double profit = (processors - countProcessors) * 110.10;
            System.out.printf("Profit: -> %.2f BGN", profit);
        }
    }
}
