package by.vorokhobko;

import java.util.Scanner;

/**
 * FibonacciNumbers.
 *
 * Class FibonacciNumbers defines Fibonacci numbers.
 * @author Evgeny Vorokhobko (vorokhobko2011@yandex.ru).
 * @since 03.02.2019.
 * @version 1.
 */
public class FibonacciNumbers {
    /**
     * The main method.
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Please, enter number: ");
        Scanner scanner = new Scanner(System.in);
        long numberInput = scanner.nextInt();
        if (numberInput > 0 && numberInput <= 91) {
            for (long i = 0; i <= numberInput; i++) {
                if (fibonacci(i) != 0) {
                    System.out.println(fibonacci(i));
                }
            }
        } else {
            throw new Exception("The maximum number of input - 91.");
        }
    }

    private static int fibonacci(long numberInput) {
        if (numberInput == 0) {
            return 0;
        } else if (numberInput == 1) {
            return 1;
        } else {
            return fibonacci(numberInput - 1) + fibonacci(numberInput - 2);
        }
    }
}