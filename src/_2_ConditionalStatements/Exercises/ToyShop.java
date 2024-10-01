package _2_ConditionalStatements.Exercises;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceExcursion = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double puzzlePrice = puzzles * 2.60;
        double dollsPrice = dolls * 3;
        double bearsPrice = bears * 4.10;
        double minionsPrice = minions * 8.20;
        double trucksPrice = trucks * 2;

        double sumPrice = puzzlePrice + dollsPrice + bearsPrice + minionsPrice + trucksPrice;
        int countToys = puzzles + dolls + bears + minions + trucks;

        if (countToys >= 50){
        sumPrice = sumPrice - (sumPrice * 0.25);
        }

        double rentShop = sumPrice * 0.10;
        double TotalMoneyMade = sumPrice - rentShop;


        if (TotalMoneyMade >= priceExcursion){
            double MoneyLeft = TotalMoneyMade - priceExcursion;
            System.out.printf("Yes! %.2f lv left.", MoneyLeft);
        }else {
            double MoneyNeeded = priceExcursion - TotalMoneyMade;
            System.out.printf("Not enough money! %.2f lv needed.", MoneyNeeded);
        }


        //вход цена на екскурзията - double
        //вход брой пъзели - int
        //вход брой кукли - int
        //вход брой мечета - int
        //вход брой миньони - int
        //вход брой камиончета - int

        //изход

    }
}