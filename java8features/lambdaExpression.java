package java8features;

import java.util.Arrays;
import java.util.List;

/***
 * Lambda Expression Syntax:
 * (parameters) -> {methodBody} or
 * parameters -> expression
 */

//Not much to practice here for the lambda, just note that lambda expression is shortcut for writing anonymous methods, and it infers to the type from the collection.
public class lambdaExpression {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream().forEach(n -> System.out.println(n));


    }
}
