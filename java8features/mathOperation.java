package java8features;
//functional interface has one abstract method, one default method, and many static methods.

/***
 * Requirement: 🔹 Create an interface called MathOperation that has:
 * ✔ One abstract method: operate(int a, int b) → returns int.
 * ✔ A default method that prints a message.
 * ✔ A static method that returns a constant value.
 */

@FunctionalInterface
interface mathOperation {
    //Previous to Java 8 , all methods in interface are by default abstract, so no need to specify.
    int operate(int a, int b);
//        •	Non-abstract methods must be marked default or static.

    default void printMessage() {
        System.out.println("Operation performed successfully");
    }
    static String getConstant(){
        return "Constant Value";

    }


}

//Final Answer (Flash Notes)
//
//✔ Functional Interface = 1 Abstract Method + Optional default / static Methods
//✔ default methods allow common behavior that classes can override
//✔ static methods belong to the interface itself, not objects
