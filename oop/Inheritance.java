package oop;
// This is to review the concept of Inheritance.

class Animal {
    public void eat () {
        System.out.println("This Animal eats food.");
    }

    public void sleep() {
        System.out.println("This Animal Sleeps");
    }
}
class Dog extends Animal {
    public void bark () {
        System.out.println("Dog Barking");
    }
}


public class Inheritance {
//Check

    public static void main(String[] args) {
        Dog maltese = new Dog();
        maltese.eat();
        maltese.sleep();
        maltese.bark();
    }


}
