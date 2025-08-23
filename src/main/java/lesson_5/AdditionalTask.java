package lesson_5;

import java.util.Arrays;
import java.util.Random;

public class AdditionalTask {
    public static void main(String[] args) {
        System.out.println("Task2:");
        sumOfValues2DArray(create2DArray());
        System.out.println("Task3:");
        outputDiagonals2DArray(create2DArray());
        System.out.println("Task4:");
        outputSorted2LinesDArray(create2DArray());
    }

    public static int[][] create2DArray() {
        System.out.println("Start array:");
        int[][] array = new int[3][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = getRandom().nextInt(10);
            }
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        return array;
    }

    //task2
    public static void sumOfValues2DArray(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("Sum of array elements: " + sum);
    }

    //task2
    public static Random getRandom() {
        return new Random();
    }

    //task3
    public static void outputDiagonals2DArray(int[][] array) {
        System.out.println("The first diagonal:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][i] + " ");
        }

        System.out.println("\nThe second diagonal:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][array.length - 1 - i] + " ");
        }
        System.out.println();
    }

    //task4
    public static void outputSorted2LinesDArray(int[][] array) {
        System.out.println("Result array:");
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
