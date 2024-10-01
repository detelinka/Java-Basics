package _3_ConditionalStatementsAdvanced.Exersises;

import java.util.Scanner;

public class _8_OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hourExam = Integer.parseInt(scanner.nextLine());
        int minExam = Integer.parseInt(scanner.nextLine());
        int hourStudent = Integer.parseInt(scanner.nextLine());
        int minStudent = Integer.parseInt(scanner.nextLine());

        int examStartMin = (hourExam * 60) + minExam;
        int studentTime = (hourStudent * 60) +minStudent;

        int difference = Math.abs(examStartMin - studentTime);

        if (examStartMin < studentTime){
            System.out.println("Late");
            if (difference < 60){
                System.out.printf("%d minutes after the start", difference);
            }else {
                int hoursLate = difference / 60;
                int minLate = difference % 60;
                System.out.printf("%d:%02d hours after the start",hoursLate, minLate);
            }

        //ако минутите на ученика са по-малко или равни на 30 от началото на изпита - on time
        }else if (difference <= 30){
            System.out.println("On time");
            if (minExam != minStudent){
                System.out.printf("%d minutes before the start", difference);
            }

        //ако минутите на ученика са с повече от 30 по-малко от началото на изпита - early
        } else {
            System.out.println("Early");
            if (difference < 60){
                System.out.printf("%d minutes before the start", difference);
            }else {
                int hoursEarly = difference / 60;
                int minEarly = difference % 60;
                System.out.printf("%d:%02d hours before the start",hoursEarly, minEarly);
            }
        }
    }
}
