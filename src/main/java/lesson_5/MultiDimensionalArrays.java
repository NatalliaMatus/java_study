package lesson_5;

import java.util.Scanner;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        //task1
        System.out.println("Task1:");
        print3DArray(resultIncreaseValue3DArray(create3DArray()));
        //task2
        System.out.println("Task2:");
        outputChessBoard();
    }

    //task1
    public static int[][][] create3DArray() {
        int[][][] arr = new int[3][3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k] = i + j + k;
                }
            }
        }
        return arr;
    }

    //task1
    private static void print3DArray(int[][][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    //task1
    public static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number by which to increase each element: ");
        return sc.nextInt();
    }

    //task1
    private static int[][][] resultIncreaseValue3DArray(int[][][] arr) {
        System.out.println("Start array:");
        print3DArray(create3DArray());
        System.out.println("-".repeat(50));
        int num = getInput();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k] += num;
                }
            }
        }
        System.out.println("Result array:");
        return arr;
    }

    //task2
    public static void outputChessBoard() {
        String[][] board = new String[8][8];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if ((i + j) % 2 == 0) {
                    board[i][j] = "W";
                } else {
                    board[i][j] = "B";
                }
            }
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }


}
