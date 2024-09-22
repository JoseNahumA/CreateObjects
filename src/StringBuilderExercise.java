public class StringBuilderExercise {
    public static void main(String[] args) {
    /**
     * Exercise 1:
     *
     * Create a StringBuilder object.
     * Append the following strings in this order: "Java", " ", "is", " ", "fun".
     * Convert the StringBuilder to a string and print it.
     */

    StringBuilder exc1 = new StringBuilder(40);
    exc1.toString();
    exc1.append("Java\n");
    exc1.append("is\n");
    exc1.append("fun");
        System.out.println(exc1);

    /**
     * Exercise 2:
     *
     * Create a StringBuilder with the initial string "I love coding in Java".
     * Use StringBuilder methods to replace "Java" with "Python".
     * Print the updated string.
     *
     */

    StringBuilder exc2 = new StringBuilder("I love coding in java");
    exc2.replace(17,21,"python");
        System.out.println(exc2);
    /**
     * Exercise 3:
     *
     * Create a StringBuilder object with the string "Java Programming".
     * Use StringBuilder methods to reverse the string and print the result.
     *
     */

    StringBuilder exc3 = new StringBuilder("Java programing");
    exc3.reverse();
        System.out.println(exc3);

    /**
     * Exercise 4:
     *
     * Create a StringBuilder object with a string "I am learning".
     * Insert the word "currently" between "am" and "learning".
     * Print the modified string.
     *
     */

    StringBuilder exc4 = new StringBuilder("I am  learning");
    exc4.insert(5,"currently");
        System.out.println(exc4);
    /**
     * Exercise 5:
     *
     * Create a StringBuilder with the string "Welcome to the world of Java".
     * Remove the word "Java" and replace it with "Programming".
     * Print the final result.
     */

    StringBuilder exc5 = new StringBuilder("Welcome to the world of Java");
        System.out.println(exc5.length());
    exc5.delete(24,28);
        System.out.println(exc5);
        exc5.insert(24,"Programming");
        System.out.println(exc5);
    }
}
