package lesson_3;

import java.util.Scanner;

public class AdditionalTask {
    public static void main(String[] args) {
        System.out.println("Task1:");
        getFibonacciNumbers();//task1
        System.out.println();
        System.out.println("Task2: " + withdrawDepositAmount());//task2
    }

    //task1
    public static void getFibonacciNumbers(){
        int first = 0;
        int second = 1;
        int count = 0;

        while (count < 11) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
            count++;
        }
    }

    //task2
    public static float withdrawDepositAmount(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of months ");
        int mounth = scanner.nextInt();
        System.out.println("Enter the deposit ");
        float deposit = scanner.nextInt();

        for (int i=1; i<=mounth; i++){
            deposit+=(deposit*(float)(0.07));
        }
        return deposit;
    }
}
