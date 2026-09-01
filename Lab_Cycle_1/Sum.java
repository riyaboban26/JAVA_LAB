import java.util.Scanner;

// Simple class definition
class DigitSumCalculator {
    
    // Method to calculate the sum of digits using a loop
    public int calculateSum(int number) {
        int sum = 0;
        
        while (number > 0) {
            int lastDigit = number % 10; // Extract the last digit
            sum += lastDigit;            // Add it to the running sum
            number = number / 10;        // Remove the last digit
        }
        
        return sum;
    }
}

public class Sum {
    public static void main(String[] args) {
        // Instantiate the simple class
        DigitSumCalculator calculator = new DigitSumCalculator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int inputNumber = scanner.nextInt();
        int result = calculator.calculateSum(inputNumber);

        scanner.close();
        
        // Output result
        System.out.println("Sum of digits = " + result);
    }
}
