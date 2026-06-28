public class Count {
    public static void main(String[] args) {
        // Input array containing positive, negative, and zero values
        int[] numbers = {5, -3, 0, 8, -1, 4};
        
        // Initialize counters
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        
        // Iterate through the array
        for (int num : numbers) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        
        // Print the results
        System.out.println("Positive numbers = " + positiveCount);
        System.out.println("Negative numbers = " + negativeCount);
        System.out.println("Zeros = " + zeroCount);
    }

}
