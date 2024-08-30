import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double number;

        System.out.println("Enter integers to add. Enter 0 to finish");

        while (true){
            System.out.println("Enter a number");
            number = scanner.nextDouble();

            if (number == 0){
                break; }

            sum += number;
        }

        System.out.println("The total sum of the numbers entered is: " + sum);

        scanner.close();
    }
}
