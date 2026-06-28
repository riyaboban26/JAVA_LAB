import java.util.Scanner;

// Class to handle all mathematical calculations
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public int modulus(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Modulus by zero is not allowed.");
        }
        return a % b;
    }
}

// Class to handle data display
class Display {
    public void printResults(int add, int sub, int mul, int div, int mod) {
        System.out.println("Addition = " + add);
        System.out.println("Subtraction = " + sub);
        System.out.println("Multiplication = " + mul);
        System.out.println("Division = " + div);
        System.out.println("Modulus = " + mod);
    }
}

// Main class execution
public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading inputs
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Object creation
        Calculator calc = new Calculator();
        Display display = new Display();

        // Performing operations
        int addition = calc.add(a, b);
        int subtraction = calc.subtract(a, b);
        int multiplication = calc.multiply(a, b);
        int division = calc.divide(a, b);
        int modulus = calc.modulus(a, b);

        // Displaying outputs
        display.printResults(addition, subtraction, multiplication, division, modulus);

        scanner.close();
    }
}
