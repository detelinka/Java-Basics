package _2_ConditionalStatements.LAB;

import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pass = scanner.nextLine();
        if (pass.equals("s3cr3t!P@ssw0rd")) {
            System.out.print("Welcome");

        }else {
            System.out.print("Wrong password!");
        }

    }
}
