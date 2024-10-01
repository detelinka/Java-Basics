package _6_NestedLoops.LAB;

import java.util.Scanner;

public class _6_Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());

        // намаляващ for loop по броя на етажите
        for (int i = floors; i >= 1; i--) {
            for (int r = 0; r < rooms; r++) {
                if (i == floors) {
                    System.out.printf("L%d%d ", i, r); // големи апартаменти
                } else if (i % 2 == 0) {
                    System.out.printf("O%d%d ", i, r); // офиси на четни етажи
                } else {
                    System.out.printf("A%d%d ", i, r); // нормални апартаменти
                }
            }
            // смъкваме курсора на нов ред след всеки етаж
            System.out.println("");
        }
    }
}
