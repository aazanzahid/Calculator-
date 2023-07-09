import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operand1, operand2;

        System.out.print("Enter the first operand: ");
        operand1 = scanner.nextInt();

        System.out.print("Enter the second operand: ");
        operand2 = scanner.nextInt();

        System.out.println("Select an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Modulo (%)");
        System.out.println("6. Exponentiation (^)");

        int operation = scanner.nextInt();
        int result;

        switch (operation) {
            case 1:
                result = operand1 + operand2;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = operand1 - operand2;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = operand1 * operand2;
                System.out.println("Result: " + result);
                break;
            case 4:
                if (operand2 == 0) {
                    System.out.println("Cannot divide by zero!");
                } else {
                    result = operand1 / operand2;
                    System.out.println("Result: " + result);
                }
                break;
            case 5:
                if (operand2 == 0) {
                    System.out.println("Cannot divide by zero!");
                } else {
                    result = operand1 % operand2;
                    System.out.println("Result: " + result);
                }
                break;
            case 6:
                result = (int) Math.pow(operand1, operand2);
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Invalid operation!");
                break;
        }
    }
}
