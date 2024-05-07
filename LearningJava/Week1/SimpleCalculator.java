import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first operand: ");  //Entering the first number
        double operand1 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");   //Choosing the operation
        char operator = scanner.next().charAt(0);

        System.out.print("Enter the second operand: ");   //Entering the secind number
        double operand2 = scanner.nextDouble();

        double result;

        switch (operator) {     //Choosing which operation to perform
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}
