import java.util.Scanner;

public class DigitCounter {

    public static int digitCounter(int number){
        return String.valueOf(number).length();
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer. ");
        int number = scanner.nextInt();

        if (number < 0){
            System.out.println("The number must be positive.");
        } else {
            int quantityDigits = DigitCounter.digitCounter(number);
            System.out.println("The number " + number + " has " + quantityDigits + " digits.");
        }
        scanner.close();
    }
}
