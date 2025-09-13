package lesson_11.stream_api;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiOperation {
    public static final List<Integer> numbers = createList();

    public static List<Integer> createList() {
        Random random = new Random();
        return Stream.generate(() -> random.nextInt(20))
                .limit(10)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static List<Integer> deleteDuplicates() {
        return numbers.stream()
                .distinct()
                .toList();
    }

    public static List<Integer> outputEvenElements() {
        return numbers.stream()
                .filter(x -> x % 2 == 0)
                .filter(x -> x >= 7 && x <= 17)
                .toList();
    }

    public static List<Integer> multiplicationBy2() {
        return numbers.stream()
                .map(x -> x * 2)
                .toList();
    }

    public static List<Integer> sortFirst4Elements() {
        return numbers.stream()
                .sorted()
                .limit(4)
                .toList();
    }

    public static long countTheNumberOfElements() {
        return numbers.stream().count();
    }

    public static Double avg() {
        return numbers.stream()
                .mapToInt(value -> value)
                .average()
                .orElse(Double.MIN_VALUE);
    }

    public static List<Integer> pipelineResult() {
        return numbers.stream()
                .distinct()
                .filter(x -> x % 2 == 0 && x >= 7 && x <= 17)
                .map(x -> x * 2)
                .sorted()
                .limit(4)
                .collect(Collectors.toList());
    }
}
