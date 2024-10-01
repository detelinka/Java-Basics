package _4_ForLoops.LAB;

import java.util.Scanner;

public class _5_CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String t = scanner.nextLine();

        for (int i = 0; i < t.length(); i++){ // ще върти докато не свърщи текста
            char letter = t.charAt(i);
            System.out.println(letter);
        }
    }
}