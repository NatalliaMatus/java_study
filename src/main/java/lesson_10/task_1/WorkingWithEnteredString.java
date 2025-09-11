package lesson_10.task_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorkingWithEnteredString {

    private static final Pattern NUBMER_DOC_REGEX = Pattern.compile(
            "^\\d{4}-[A-Za-z]{3}-\\d{4}-[A-Za-z]{3}-\\d[A-Za-z]\\d[A-Za-z]$");

    public static void assertValidFormat(String numberOfDocument) {
        Matcher matcher = NUBMER_DOC_REGEX.matcher(numberOfDocument);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("Invalid document number format: should be xxxx-yyy-xxxx-yyy-xyxy," +
                    " where x - number, y - letter");
        }
    }

    public static String readDocumentNumber(Scanner scanner) {
        System.out.print("Input number of document: ");
        return scanner.nextLine();
    }

    public static String findFirstDigitBlocks(String numberOfDocument) {
        String[] parts = numberOfDocument.split("-");
        return parts[0] + ", " + parts[2];
    }

    public static String maskedOnlyLetterBlocks(String numberOfDocument) {
        return numberOfDocument.replaceAll("[A-Za-z]{3}", "***");
    }


    public static String outputLettersLower(String numberOfDocument) {
        String[] parts = numberOfDocument.split("-");
        String b2 = parts[1].toLowerCase();
        String b4 = parts[3].toLowerCase();
        char y1 = Character.toLowerCase(parts[4].charAt(1));
        char y2 = Character.toLowerCase(parts[4].charAt(3));
        return b2 + "/" + b4 + "/" + y1 + "/" + y2;
    }

    public static StringBuilder outputLettersUpperWithBuilder(String numberOfDocument) {
        String lettersOnly = numberOfDocument.replaceAll("[^A-Za-z]", "").toUpperCase();
        StringBuilder builder = new StringBuilder("Letters:");
        builder.append(lettersOnly, 0, 3).append("/")
                .append(lettersOnly, 3, 6).append("/")
                .append(lettersOnly.charAt(6)).append("/")
                .append(lettersOnly.charAt(7));
        return builder;
    }

    public static boolean checkContainsAbc(String numberOfDocument) {
        return numberOfDocument.toLowerCase().contains("abc");
    }

    public static boolean checkStartsWith555(String numberOfDocument) {
        return numberOfDocument.startsWith("555");
    }

    public static boolean printEndsWith1a2b(String numberOfDocument) {
        return numberOfDocument.endsWith("1a2b");
    }
}
