package lesson_10.task_1;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            String number = WorkingWithEnteredString.readDocumentNumber(sc);

            WorkingWithEnteredString.assertValidFormat(number);
            System.out.println("task1");
            System.out.println(WorkingWithEnteredString.findFirstDigitBlocks(number));
            System.out.println("task2");
            System.out.println(WorkingWithEnteredString.maskedOnlyLetterBlocks(number));
            System.out.println("task3");
            System.out.println(WorkingWithEnteredString.outputLettersLower(number));
            System.out.println("task4");
            System.out.println(WorkingWithEnteredString.outputLettersUpperWithBuilder(number));
            System.out.println("task5");
            System.out.println(WorkingWithEnteredString.checkContainsAbc(number));
            System.out.println("task6");
            System.out.println(WorkingWithEnteredString.checkStartsWith555(number));
            System.out.println("task7");
            System.out.println(WorkingWithEnteredString.printEndsWith1a2b(number));
        }
        catch (NoSuchElementException e) {
            System.out.println("No input provided");
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

