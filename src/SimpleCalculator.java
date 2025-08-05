import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        int i = 200;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        double result;
        switch (op) {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/': result = b != 0 ? a / b : 0; break;
            default: System.out.println("Invalid operator!"); return;
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}
