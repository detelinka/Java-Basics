package _7_MoreExercises._2_ConditionalStatements;

import java.util.Scanner;

public class _4_TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine()); //брой километри
        String time = scanner.nextLine(); //ден или нощ
        double price = 0.0;

        if (n <= 99 && n >= 20){ //автобус
            price = 0.09 * n;

        }else if (n >= 100){ //влак
            price = 0.06 * n;

        }else { // такси
            switch (time){
                case "day":
                    price = 0.70 + 0.79 * n; // дневна тарифа
                    break;
                case "night":
                    price = 0.70 + 0.90 * n; // нощна тарифа
                    break;
            }
        }
        System.out.printf("%.2f", price);
    }
}
