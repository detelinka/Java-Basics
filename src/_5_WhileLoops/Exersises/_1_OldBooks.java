package _5_WhileLoops.Exersises;

import java.util.Scanner;

public class _1_OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String theBook = scanner.nextLine();
        String currentBook = scanner.nextLine();
        int count = 0;

        while (!currentBook.equals(theBook)){
             if (currentBook.equals("No More Books")) {
                System.out.printf("The book you search is not here!%nYou checked %d books.",count);
                break;
            }
             currentBook = scanner.nextLine();
             count++;
        }
        if (currentBook.equals(theBook)){
            System.out.printf("You checked %d books and found it.", count);
        }

    }
}
