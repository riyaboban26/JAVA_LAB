import java.util.Scanner;

public class ArrayMaxFinder {
    
    // Method to find the largest element
    public int findMaximum(int[] numbers) {
        int max = numbers[0];
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayMaxFinder finder = new ArrayMaxFinder();

        // Read size of the array
        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        // Read array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Find and print result
        int largest = finder.findMaximum(array);
        System.out.println("Largest element = " + largest);

        scanner.close();
    }
}
