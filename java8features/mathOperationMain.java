package java8features;

//	•	Functional Interfaces are used with Lambdas, not implements.

//✔ Functional Interface only holds the contract (1 abstract method).
//        ✔ You need to create instances (objects) using lambda expressions in the main() method.
//✔ These instances act as separate operations (addition, subtraction, etc.).
//        ✔ You call the operations using operate(a, b) and assign the result to variables.

public class mathOperationMain {
    public static void main(String[] args) {
        // Creating operations here. That I can use for my lambda expression calculations.
        mathOperation addition = (a, b) -> a + b;
        mathOperation subtraction = (a, b) -> a - b;
        mathOperation multiplication = (a, b) -> a * b;
        mathOperation division = (a, b) -> (b!= 0)? a / b: 0;

        addition.printMessage();
        int addedValue = addition.operate(1, 2);
        System.out.println(addedValue);
        int subtractionValue = subtraction.operate(5, 1);
        System.out.println(subtractionValue);
        int multiplicationValue = multiplication.operate(3, 5);
        System.out.println(multiplicationValue);
        int divisionValue = division.operate(7, 2);
        System.out.println(divisionValue);

        System.out.println(mathOperation.getConstant());

    }
}
