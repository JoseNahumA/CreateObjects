import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaExpressionExercise {

        public static void main(String[] args) {
            /**
             * Exercise 1:
             *
             * Write a lambda expression that takes two integers and returns their sum.
             * Use the lambda to sum 10 and 20.
             *
             */

                BiFunction<Integer,Integer,Integer> sum = (a,b) -> a + b;
                double result = sum.apply(25,12);
                System.out.println("The result is " + result);

            /**
             * Exercise 2:
             *
             * Create a lambda expression that takes a string and prints its length.
             * Test the lambda with the string "Lambda Expressions".
             *
             */

                Consumer<String> lengthString = s -> System.out.println("Length of string " + s.length());
                lengthString.accept("Lambda expressions");
            /**
             * Exercise 3:
             *
             * Write a lambda expression that takes an integer and returns its square.
             * Test it with different integer values.
             *
             */

                Function<Integer,Integer> square = i -> i * i;
                System.out.println(square.apply(7));

            /**
             * Exercise 4:
             *
             * Create a lambda expression that checks if a string is empty.
             * Test it with both an empty and a non-empty string.
             *
             */

            Predicate<String> isEmpty = String::isEmpty;
                System.out.println("Is empty ? " +  isEmpty.test(""));
                System.out.println("Is 'hello world' empty ?" + isEmpty.test("hello world"));

            /**
             * Exercise 5:
             *
             * Write a lambda expression that takes two String arguments and concatenates them.
             * Use the lambda to concatenate "Hello" and "World".
             *
             */

            BiFunction<String,String,String> concatenation = (str1 , str2) -> str1 + " " + str2;
            String concatenationResult = concatenation.apply("Hello","Nahum");
                System.out.println("Concatenated Strings: " + concatenationResult);
        }
}
