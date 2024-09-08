import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("Welcome to the Nahum Calculator");

            System.out.println("Enter the first number: ");
            double firstNumber = scanner.nextDouble();

            System.out.println("Enter the second number: ");
            double secondNumber = scanner.nextDouble();

            System.out.println("Enter the operator (+, -, /, *)");
            char operator = scanner.next().charAt(0);

            Operator operation = Operator.fromSymbol(operator);
            if(operation == null){
                System.out.println("Invalid operator");
                continue;
            }

          double result = 0;

            switch (operation){
                case Operator.ADD:
                    result = calculator.sum(firstNumber , secondNumber) ;
                    break;
                case Operator.SUBTRACT:
                    result = calculator.subtract(firstNumber , secondNumber);
                    break;
                case Operator.DIVIDE:
                    String divideValue = calculator.divide(firstNumber , secondNumber);
                    if( divideValue.contains("Error!")){
                        System.out.println(divideValue);
                        continue;
                    }
                    result = Double.parseDouble(divideValue);
                    break;
                case Operator.MULTIPLY:
                    result = calculator.multiply(firstNumber , secondNumber);
                    break;
                default:
                    System.out.println("Invalid operator");
                    break;
            }
            System.out.printf("The result of %.2f %c %.2f = %.2f%n", firstNumber, operator, secondNumber, result);

            System.out.println("Do you want to perform another calculation? (y/n)");
            char choice = scanner.next().charAt(0);

            if(choice == 'n' || choice == 'N'){
                keepRunning = false;
            }
        }
        System.out.println("Good bye buddy!");
        scanner.close();
    }
}