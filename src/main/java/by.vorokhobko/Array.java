package by.vorokhobko;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Array.
 *
 * Class Array sorts the array in descending order.
 * @author Evgeny Vorokhobko (vorokhobko2011@yandex.ru).
 * @version 1.
 * @since 03.02.2019.
 */
public class Array {
    /**
     * The main method.
     */
    public static void main(String[] args) {
        System.out.println("Please, enter the length of the array: ");
        Scanner scanner = new Scanner(System.in);
        int numberInput = scanner.nextInt();
        int[] array = new int[numberInput];
        System.out.println("Please, complete the array: ");
        int size = 0;
        while (size < array.length) {
            array[size] = scanner.nextInt();
            size++;
        }
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j + 1] > array[j]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}