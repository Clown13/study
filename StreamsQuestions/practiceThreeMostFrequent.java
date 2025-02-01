package StreamsQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
//Streams can mimic HashMap using Collectors.groupingBy().
//Normally, .groupingBy() needs a function that tells it what should be the key in the map.
//Function.identity() is just a shortcut for saying “Use the element itself” instead of writing (n -> n).

public class practiceThreeMostFrequent {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,2,3,5,4,5,1,15);
        numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max((entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue())) // Lambda for max()
                .map(entry -> entry.getKey()) // Lambda for map()
                .ifPresent(value -> System.out.println(value)); // Lambda for ifPresent()
    }
}
