package lesson_10.task_5;

import java.util.Scanner;

public class StringDoubler {

    public static String readLine() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input text: ");
        return scanner.hasNextLine() ? scanner.nextLine() : "";
    }

    public static String doubleLetters(String input) {
        if (input == null) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            sb.append(c).append(c);
        }
        return sb.toString();
    }
}
