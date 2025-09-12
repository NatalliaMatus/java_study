package lesson_11.regular_expressions;

import java.util.Scanner;
import java.util.regex.Pattern;

public class IpValidator {

    private static final Pattern IPV4_PATTERN = Pattern.compile(
            "^((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}" +
                    "(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$"
    );

    public static boolean assertValidIPv4(String ip) {
        return IPV4_PATTERN.matcher(ip).matches();
    }

    public static String inputIp(Scanner scanner) {
        System.out.print("Enter IPv4 address: ");
        return scanner.nextLine();
    }
}
