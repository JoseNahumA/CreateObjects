import java.util.List;
import java.util.Arrays;
import java.util.function.Consumer;


public class MethodReferenceExercise {
    public static void main(String[] args) {

        /**
         * Exercise 1:
         * Create a method in a class that takes a string and prints it in lowercase.
         * Use a method reference to pass this method to a Consumer<String>.
         */

        Consumer<String> printLowerCase1 = MethodReferenceExercise::printLowerCase;
        printLowerCase1.accept("HELLO WORlD");

        /**
         * Exercise 2:
         * Write a static method that prints the square of an integer.
         * Use a method reference to pass this static method to a Consumer<Integer>.
         *
         */

        Consumer<Integer> printSquare = MethodReferenceExercise::printSquare;
        printSquare.accept(4);

        /**
         * Exercise 3:
         *
         * Create a method that prints the length of a string.
         * Use a method reference to pass this method to a Consumer<String>.
         *
         */
        Consumer<String> printLength = MethodReferenceExercise::printLength;
        printLength.accept("Hello World");


        /**
         *  Exercise 4:
         *
         * Create a class with a non-static method that prints the first character of a string.
         * Use a method reference to pass this non-static method to a Consumer<String>.
         *
         */
        MyClass myClassInstance = new MyClass();
        Consumer<String> printFirstChar = myClassInstance::printFirstCharacter;
        printFirstChar.accept("Hello World");

        /**
         * Exercise 5:
         *
         * Create a method in a class that takes a list of strings and prints each string in uppercase.
         * Use method reference to pass this method to a Consumer<List<String>>.
         */

        Consumer<List<String>> printUpperCase = MethodReferenceExercise::printUpperCase;
        printUpperCase.accept(Arrays.asList("hello", "world", "java"));




}

    // Exercise 1: Method to print in lowercase
        public static void printLowerCase(String message) {
            System.out.println(message.toLowerCase());
        }
    // Exercise 2: Static method to print the square of an integer
        public static void printSquare(Integer num) {
        System.out.println(num * num);
        }
    // Exercise 3: Method to print the length of a string

    public static void printLength(String str) {
        System.out.println(str.length());
        }
    // Exercise 4: Class with a non-static method

    static  class MyClass {
        public void printFirstCharacter(String str) {
            if (str != null && !str.isEmpty()) {
                System.out.println(str.charAt(0));
            }
        }


    }
    // Exercise 5: Method to print each string in uppercase
    public static void printUpperCase(List<String> strings) {
        strings.forEach(s -> System.out.println(s.toUpperCase()));
    }
}
