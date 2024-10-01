package _1_FirstStepsInCoding.Exersises;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lenght = Integer.parseInt(scanner.nextLine());
        int widht = Integer.parseInt(scanner.nextLine());
        int hight =Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double obem = lenght * widht * hight;
        double obemVLitri = obem * 0.001;
        double zaetoProstranstvo = percent /100;
        double nujniLitri = obemVLitri * (1-zaetoProstranstvo);

        System.out.print(nujniLitri);

    }
}