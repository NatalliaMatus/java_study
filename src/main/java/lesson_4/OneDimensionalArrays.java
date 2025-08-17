package lesson_4;

import java.util.Arrays;
import java.util.Scanner;

public class OneDimensionalArrays {
    public static void main(String[] args) {
        System.out.println("Task1:");
        guessNumber();//task1
        System.out.println("Task2:");
        removeUnnecessaryElements();//task2
        System.out.println("Task3:");
        fillRandomValues();//task3
        System.out.println("Task4:");
        compareArrays();//task4
    }

    //task1
    public static void guessNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int input = scanner.nextInt();
        int[] array = {10, 1, 8, 3, 5, 12};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == input) {
                System.out.println("Your number " + array[i]);
                return;
            }
        }
        System.out.println("Your number not found");
    }

    //task2
    public static void removeUnnecessaryElements() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int input = scanner.nextInt();
        int[] array = {10, 1, 8, 3, 5, 12, 1};

        int count = 0;
        for (int candidateForRemoval : array) {//попробовала поиграться с короткой формой
            if (candidateForRemoval == input)
                count++;
        }

        if (count == 0) {
            System.out.println("Numbers not found");
        } else {
            int[] resultArray = new int[array.length - count];
            int index = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] != input) {
                    resultArray[index++] = array[i];
                }
            }
            System.out.println("New array: " + Arrays.toString(resultArray));
        }
    }

    //task3
    public static void fillRandomValues() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int input = scanner.nextInt();
        int[] array = new int[input];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        int max = 0;
        int min = array[0];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        double avg = (double) sum / input;
        System.out.println("Array value: " + Arrays.toString(array));
        System.out.println("Min value: " + min);
        System.out.println("Max value: " + max);
        System.out.println("average value: " + avg);
    }

    //prepate for task4
    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int n : array) {
            sum += n;
        }
        return (double) sum / array.length;
    }

    //task4
    public static void compareArrays() {
        int[] array1 = {10, 1, 8, 3, 5};
        int[] array2 = {11, 15, 3, 1, 9};

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        double average1 = calculateAverage(array1);
        double average2 = calculateAverage(array2);

        if (average1 > average2) {
            System.out.println("The average value is greater in array 1");
        } else if (average2 > average1) {
            System.out.println("The average value is greater in array 2");
        } else {
            System.out.println("The average values are equal");
        }
    }
}
