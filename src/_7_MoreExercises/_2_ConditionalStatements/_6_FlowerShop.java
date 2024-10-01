package _7_MoreExercises._2_ConditionalStatements;

import java.util.Scanner;

public class _6_FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnolias = Integer.parseInt(scanner.nextLine());
        int hyacinth = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cactus = Integer.parseInt(scanner.nextLine());
        double present = Double.parseDouble(scanner.nextLine());

        //Магнолии – 3.25 лева
        //Зюмбюли – 4 лева
        //Рози – 3.50 лева
        //Кактуси – 8 лева
        // 5% данъци от общата цена

        double totalPrice = (magnolias * 3.25) + (hyacinth * 4.0) + (roses * 3.5) + (cactus * 8.0);
        double tax = totalPrice * 0.05;
        double total = totalPrice - tax;

        if (present > total){
            double left = Math.ceil(present - total);
            System.out.printf("She will have to borrow %.0f leva.", left);
        }else {
            double needed = Math.floor(total - present);
            System.out.printf("She is left with %.0f leva.", needed);
        }
    }
}
