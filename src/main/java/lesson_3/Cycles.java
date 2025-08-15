package lesson_3;

import java.util.Scanner;

public class Cycles {
    public static void main(String[] args) {
        System.out.println("Task1:");
        outputOddNumbers();//task1
        System.out.println();
        System.out.println("Task2:");
        outputDesc();//task2
        System.out.println();
        System.out.println("Task3: Enter the number ");
        sumOfNumbers();//task3
        System.out.println("Task4:");
        printTheSequence7();//task4
        System.out.println();
        System.out.println("Task5:");
        printTheSequence10();//task5
        System.out.println();
        System.out.println("Task6:");
        squaresOfNumbers();//task6
        System.out.println();
    }

    //task1
    public static void outputOddNumbers() {
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    //task2
    public static void outputDesc() {
        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }

    //task3
    public static void sumOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int sum = 0;
        if (input <= 0) {
            System.out.println("The number must be positive!");
        } else {
            for (int i = 1; i <= input; i++) {
                sum = sum + i;
            }
            System.out.println("Sum of number " + sum);
        }
        scanner.close();
    }

    //task4
    public static void printTheSequence7() {
        int number = 7;
        while (number <= 98) {
            System.out.print(number + " ");
            number += 7;
        }
    }

    //task5
    public static void printTheSequence10() {
        int count = 0;
        int number = 0;
        while (count < 10) {
            System.out.print(number + " ");
            number -= 5;
            count++;
        }
    }

    //task6
    public static void squaresOfNumbers() {
        for (int i = 10; i <= 20; i++) {
            System.out.print((i * i) + " ");
        }
    }
}
