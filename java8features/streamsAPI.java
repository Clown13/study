package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//Streams API - A Stream in java is used to process collections of data in functional style. It allows operations like filtering, mapping, and reducing without modifying original collection
//This will focus on Intermediate Operations such as map(), filter, sorted, and distinct. Terminal Operation only collect is used.
/***
 * Basic Operations in Streams:
 * Creation: Stream.of(), Arrays.stream(), collection.stream()
 * Intermediate Operations: map(), filter(), sorted(), distinct()
 * Terminal Operation: collect(), forEach(), count(), reduce()
 */
public class streamsAPI {

    public static List<Integer> getSquareNumbers(List <Integer> numbers) {
        List<Integer> squaredNumber =  numbers.stream().map(x -> x*x).collect(Collectors.toList());
        return squaredNumber;
    }
    public static List<Integer> getEvenNumbers(List <Integer> numbers) {
        List <Integer> evenNumber = numbers.stream().filter(x -> x%2  == 0).collect(Collectors.toList());
        return evenNumber;
    }

    public static List<Integer> getSortedNumbers(List<Integer> numbers) {
        List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
        return sortedNumbers;
    }

    public static List<Integer> getDistinctNumbers(List<Integer> numbers) {
        List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());
        return distinctNumbers;

    }


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> result = getSquareNumbers(numbers);
        System.out.println("Squared Numbers" + result);
        List <Integer> eveNumber =  getEvenNumbers(numbers);
        System.out.println("Even Numbers" + eveNumber);

        List<Integer> unsortedNumber = Arrays.asList(5,2,12,55,23,12);
        List<Integer> sortedNumbers = getSortedNumbers(unsortedNumber);
        System.out.println("Sorted Numbers" + sortedNumbers);

        List<Integer> numberSetTwo = Arrays.asList(2,2,5,5,4,12,13,15,15);
        List<Integer> distinctNumber = getDistinctNumbers(numberSetTwo);
        System.out.println("Distinct Numbers" + distinctNumber);
        System.out.println("-------------------collect completed ---------------------");

        //This session to practice terminal operation forEach
        List<Integer> numberSetThree = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        numberSetThree.stream().forEach(x -> System.out.println(x));
//Why ever use this?
        long countFunction = numberSetThree.stream().count();
        System.out.println("This is count: "+ countFunction);
// reduce() is used for aggregation  purposes.

        int sumOfNumbers = numberSetThree.stream().reduce(0, (a,b)-> a+b);
        System.out.println("Sum of numbers: " + sumOfNumbers);

        int findMax = numberSetThree.stream().reduce(0, (a,b) -> a>b?a:b);
        System.out.println("Find max: " + findMax);

        Optional<Integer> findMin = numberSetThree.stream().reduce((a, b) -> a<b?a:b);
        System.out.println("Find min: " + findMin.get());


    }

    //Terminal Operations
    // collect(Collectors.toList()) - Converts a stream into a List. Remember stream is to process collection =,
    //forEach() - Executes an action for each element(like printing).
    //count() - Counts elements in a stream.
    //reduce() - Performs aggregation (like sum, multiplication , min, max).
    //Must-Know: Streams, Lambdas, Method References, and Optional.



}
