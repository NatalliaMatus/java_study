//package lesson_10.task_1;
//
//import java.util.Scanner;
//import java.util.regex.Pattern;
//
//public class ObsoleteWorkingWithEnteredString {
//
//    private static final Pattern NUBMER_DOC_REGEX = Pattern.compile(
//            "^\\d{4}-[A-Za-z]{3}-\\d{4}-[A-Za-z]{3}-\\d[A-Za-z]\\d[A-Za-z]$");
//
//    public static void assertValidFormat(String doc) {
//        if (doc == null || !NUBMER_DOC_REGEX.matcher(doc).matches()) {
//            throw new IllegalArgumentException("Invalid document number format: should be xxxx-yyy-xxxx-yyy-xyxy," +
//                    " where x - number, y - letter");
//        }
//    }
//
//    public static String readDocumentNumber(Scanner sc) {
//        System.out.print("Input number of document: ");
//        return sc.nextLine().trim();
//    }
//
//    public static String[] dividedInto5Blocks(String numberOfDocument) {
//        int[] hyphenIndexes = new int[4];
//        int pos = -1;
//        for (int k = 0; k < 4; k++) {
//            pos = numberOfDocument.indexOf('-', pos + 1);
//            hyphenIndexes[k] = pos;
//        }
//
//        String[] parts = new String[5];
//        parts[0] = numberOfDocument.substring(0, hyphenIndexes[0]);
//        parts[1] = numberOfDocument.substring(hyphenIndexes[0] + 1, hyphenIndexes[1]);
//        parts[2] = numberOfDocument.substring(hyphenIndexes[1] + 1, hyphenIndexes[2]);
//        parts[3] = numberOfDocument.substring(hyphenIndexes[2] + 1, hyphenIndexes[3]);
//        parts[4] = numberOfDocument.substring(hyphenIndexes[3] + 1);
//        return parts;
//    }
//
//    public static String findFirstDigitBlocks(String listOfBlocks) {
//        String[] parts = dividedInto5Blocks(listOfBlocks);
//        String result = "";
//        for (String part : parts) {
//            if (checkOnExactlyFourDigits(part)) {
//                result += ";" + part;
//            }
//        }
//        return result.replaceFirst(";", "");
//    }
//
//    public static boolean checkOnExactlyFourDigits(String listOfBlocks) {
//        for (int i = 0; i < 4; i++) {
//            if (!Character.isDigit(listOfBlocks.charAt(i))) return false;
//        }
//        return true;
//    }
//
//    public static String maskedOnlyLetterBlocks(String listOfBlocks) {
//        String[] parts = dividedInto5Blocks(listOfBlocks);
//        String[] masked = new String[parts.length];
//
//        for (int i = 0; i < parts.length; i++) {
//            masked[i] = checkOnExactlyThreeLetters(parts[i]) ? "***" : parts[i];
//        }
//        return String.join("-", masked);
//    }
//
//    private static boolean checkOnExactlyThreeLetters(String listOfBlocks) {
//        for (int i = 0; i < 3; i++) {
//            if (!Character.isLetter(listOfBlocks.charAt(i))) return false;
//        }
//        return true;
//    }
//
//    public static String outputLettersLower(String listOfBlocks) {
//        String[] parts = dividedInto5Blocks(listOfBlocks);
//        String b2 = parts[1].toLowerCase();
//        String b4 = parts[3].toLowerCase();
//        char y1 = Character.toLowerCase(parts[4].charAt(1));
//        char y2 = Character.toLowerCase(parts[4].charAt(3));
//        return b2 + "/" + b4 + "/" + y1 + "/" + y2;
//    }
//
//    public static String outputLettersUpperWithBuilder(String numberOfDocument) {
//        StringBuilder sb = new StringBuilder("Letters:");
//        boolean inLetters = false;
//        boolean needSlash = false;
//
//        for (int i = 0; i < numberOfDocument.length(); i++) {
//            char ch = numberOfDocument.charAt(i);
//
//            if (Character.isLetter(ch)) {
//                if (!inLetters) {
//                    if (needSlash) {
//                        sb.append('/');
//                    }
//                    inLetters = true;
//                    needSlash = true;
//                }
//                sb.append(Character.toUpperCase(ch));
//            } else {
//                inLetters = false;
//            }
//        }
//        return sb.toString();
//    }
//
//    public static boolean checkContainsAbc(String numberOfDocument) {
//        return numberOfDocument.toLowerCase().contains("abc");
//    }
//
//    public static boolean checkStartsWith555(String numberOfDocument) {
//        return numberOfDocument.startsWith("555");
//    }
//
//    public static boolean printEndsWith1a2b(String numberOfDocument) {
//        return numberOfDocument.endsWith("1a2b");
//    }
//}
