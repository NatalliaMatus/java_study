package lesson_11.regular_expressions;

import java.util.Scanner;

import static lesson_11.regular_expressions.IpValidator.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is the IP address correct? " + assertValidIPv4(inputIp(scanner)));
    }
}
