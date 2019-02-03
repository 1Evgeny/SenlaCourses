package by.vorokhobko;

import java.util.Scanner;

/**
 * PrimeNumber.
 *
 * Class PrimeNumber defines prime numbers.
 * @author Evgeny Vorokhobko (vorokhobko2011@yandex.ru).
 * @since 03.02.2019.
 * @version 1.
 */
public class PrimeNumber {
    /**
     * The main method.
     */
    public static void main(String[] args) {
        System.out.println("Please, enter number: ");
        Scanner scanner = new Scanner(System.in);
        int numberInput = scanner.nextInt();
        int element, currentNumber;
        for (element = 2; element <= numberInput; element++) {
            for (currentNumber = 2; element % currentNumber > 0; currentNumber++) {
            }
            if (element == currentNumber) {
                System.out.println(element);
            }
        }
    }
}