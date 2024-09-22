import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExercise {
    public static void main(String[] args) {
        /**
         * Exercise 1:
         *
         * Create a Consumer<String> that takes a string and prints it in uppercase.
         * Use the accept() method to test it with the string "hello".
         *
         */

        Consumer<String> toUpperCase = s -> System.out.println(s.toUpperCase());
        toUpperCase.accept("hello");

        /**
         * Exercise 2:
         *
         * Write a Consumer<Integer> that squares the given integer and prints the result.
         * Test it with a value of your choice.
         *
         */

        Consumer<Integer> square = i -> System.out.println(i * i);
        square.accept(6);

        /**
         * Exercise 3:
         *
         * Create a list of integers and a Consumer<List<Integer>> that prints each integer in the list.
         * Use forEach() to apply the consumer to the list.
         *
         */

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);

        Consumer<List<Integer>> printList = list -> list.forEach(System.out::println);
        printList.accept(integerList);

        /**
         * Exercise 4:
         *
         * Write a Consumer<StringBuilder> that appends " World!" to the given StringBuilder.
         * Test it with "Hello" as the initial value.
         *
         */

        Consumer<StringBuilder> appendWorld = sb -> sb.append(" World!");
        StringBuilder sb = new StringBuilder("Hello");
        appendWorld.accept(sb);
        System.out.println(sb.toString());

        /**
         * Exercise 5:
         *
         * Create a Consumer<Integer> that prints whether the given integer is odd or even.
         * Test it with different integers.
         */

        Consumer<Integer> oddOrEven = num -> {
            if (num % 2 == 0) {
                System.out.println(num + " is even.");
            } else {
                System.out.println(num + " is odd.");
            }
        };
        oddOrEven.accept(10);
        oddOrEven.accept(11);
    }

    }
