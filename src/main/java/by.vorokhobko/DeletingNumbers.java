package by.vorokhobko;

import java.util.Scanner;

/**
 * DeletingNumbers.
 *
 * Class DeletingNumbers removes numbers from the text.
 * @author Evgeny Vorokhobko (vorokhobko2011@yandex.ru).
 * @version 1.
 * @since 03.02.2019.
 */
public class DeletingNumbers {
    /**
     * The main method.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter word: ");
        String text = scanner.nextLine();
        String result = text.replaceAll("\\d", "");
        System.out.println(result);
    }
}