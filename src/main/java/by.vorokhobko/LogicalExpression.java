package by.vorokhobko;

import java.util.Scanner;

/**
 * LogicalExpression.
 *
 * Class LogicalExpression fill the array of values boolean.
 * @author Evgeny Vorokhobko (vorokhobko2011@yandex.ru).
 * @version 1.
 * @since 03.02.2019.
 */
public class LogicalExpression {
    /**
     * The main method.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[4];
        System.out.println("Please, complete the boolean array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.next();
        }
        int elementFalse = 0, elementTrue = 0;
        String falseElement = "false";
        String trueElement = "true";
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(falseElement)) {
                elementFalse++;
            } else if (array[i].equals(trueElement)) {
                elementTrue++;
            }
        }
        if (elementFalse == elementTrue) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}