package _2_ConditionalStatements.Exercises;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //time for lunch = 1/8 of the time for break
        //time for chill = 1/4 of the time for break

        String film = scanner.nextLine();
        int episode = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());

        double timeForLunch = breakTime * 0.125;
        double timeForChill = breakTime * 0.25;
        double timeLeft = breakTime - timeForChill - timeForLunch;

        if (timeLeft >= episode){
            double time = Math.ceil(timeLeft - episode);
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", film, time);
        }else {
            double time = Math.ceil(episode - timeLeft);
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", film, time);
        }

    }
}
