package StreamsQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/***
 * Question to practice Functional Programming using Streams
 */
public class practiceQuestionOne {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,10,15,25,30,35,41,123);
        numbers.stream().filter(number -> String.valueOf(number).startsWith("1")).collect(Collectors.toList());
        System.out.println(numbers.stream().filter(number -> String.valueOf(number).startsWith("1")).collect(Collectors.toList()));

        //Stream allow functional-style operations on collections (Process data without loops)
        //Filter let us remove unwanted data based on condtion.
        //Using String.valueOf(num) converts integer to String.
        //.startsWith("1") hels us match numbers that start with "1"
    }
}
