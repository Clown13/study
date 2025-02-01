package StreamsQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


/***
 *Find the second largest Number in a List.
 * Given a list of integers, write a Java Streams API solution to find the second largest number
 */
public class practiceQuestionTwo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,5,10,6,2,4);
        Optional<Integer> secondNumber = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println(secondNumber.orElse(-1));

    }
}

//Most Stream operations follow a fixed sequence:
//        1.	Convert to Stream → .stream()
//	2.	Transform or filter → .map(), .filter(), .distinct()
//	3.	Sort if needed → .sorted(Comparator.xyz())
//        4.	Pick elements → .limit(), .skip(), .findFirst(), .findAny()
//	5.	Aggregate or collect → .reduce(), .collect(Collectors.toList())