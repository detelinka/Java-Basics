package _2_ConditionalStatements.Exercises;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordSeconds = Double.parseDouble(scanner.nextLine());
        double Meters = Double.parseDouble(scanner.nextLine());
        double secondsPerMeter = Double.parseDouble(scanner.nextLine());

        double timeNormal = Meters * secondsPerMeter;
        double SlowDown = Math.floor(Meters / 15) * 12.5;
        double ivanTime = timeNormal + SlowDown;

        if (recordSeconds <= ivanTime){
            double SecondsSlower = ivanTime - recordSeconds;
            System.out.printf("No, he failed! He was %.2f seconds slower.", SecondsSlower);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", ivanTime);
        }


    }
}
