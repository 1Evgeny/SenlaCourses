package by.vorokhobko;

import java.util.Scanner;

/**
 * Palindrome.
 *
 * Class Palindrome tests a word for "palindrome".
 * @author Evgeny Vorokhobko (vorokhobko2011@yandex.ru).
 * @version 1.
 * @since 03.02.2019.
 */
public class Palindrome {
    /**
     * The main method.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter word: ");
        String text = scanner.nextLine();
        boolean isNeedSave = text.equalsIgnoreCase(new StringBuilder(text).reverse().toString());
        if (isNeedSave) {
            System.out.println("This is palindrome.");
        } else {
            System.out.println("This is not palindrome.");
        }
    }
}