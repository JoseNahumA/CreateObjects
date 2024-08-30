public class Calculator {
    public double sum(double num1 , double num2){ return  num1 + num2; }
    public double subtract(double num1 , double num2){ return num1 - num2; }
    public double multiply(double num1 , double num2){ return num1 * num2; }
    public String divide(double num1 , double num2){
        if(num2 == 0) {
            return "Error! Division by zero! ";
        } else {
            double result = num1 / num2;
            return Double.toString(result) ;
        }
    }
}