package _1_FirstStepsInCoding.Exersises;

import java.util.Scanner;

public class VacationBookList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int daysNeeded = Integer.parseInt(scanner.nextLine());

        int timeForBook = pages / pagesPerHour;
        int hoursPerDay = timeForBook / daysNeeded;

        System.out.print(hoursPerDay);
    }
}
