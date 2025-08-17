package lesson_4;

import java.util.Arrays;
import java.util.Scanner;

public class AdditionalTask {
    public static void main(String[] args) {
        System.out.println("Task1:");
        creatingArrayWithEvenValues();//task1
        System.out.println("Task2:");
        replaceOddArrayIndex();//task2
        System.out.println("Task3:");
        sortString();//task3
    }

    //task1
    public static void creatingArrayWithEvenValues() {
        Scanner scanner = new Scanner(System.in);
        int input;

        while (true) {
            System.out.print("Enter the array size (from 6 to 10): ");
            input = scanner.nextInt();
            if (input > 5 && input <= 10) {
                break;
            } else {
                System.out.println("The number must be greater than 5 and not greater than 10. Repeat again.");
            }
        }

        int[] array1 = new int[input];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 10);
        }
        System.out.println("The 1 array: " + Arrays.toString(array1));

        int count = 0;
        for (int num : array1) {
            if (num % 2 == 0)
                count++;
        }

        if (count == 0) {
            System.out.println("There are no even numbers");
        } else {
            int[] array2 = new int[count];
            for (int i = 0, y = 0; i < array1.length; i++) {
                if (array1[i] % 2 == 0) {
                    array2[y] = array1[i];
                    y++;
                }
            }
            System.out.println("The 2 array of even elements: " + Arrays.toString(array2));
        }
    }

    //task2
    public static void replaceOddArrayIndex() {
        int[] array1 = new int[10];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 10);
        }
        System.out.println("Virgin array: " + Arrays.toString(array1));

        for (int i = 1; i < array1.length; i += 2) {
            array1[i] = 0;
        }
        System.out.println("After replace: " + Arrays.toString(array1));
    }

    //task3
    public static void sortString() {
        String[] array = {"Nata", "Anna", "Mari", "Irina", "Alina"};
        Arrays.sort(array);
        System.out.println("Sorted list: " + Arrays.toString(array));
    }
}