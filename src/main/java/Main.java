/**
 * Main class for ADS Assignment Starter
 * 
 * This is a basic Java starter project that can be used as a foundation
 * for Algorithms and Data Structures assignments.
 * 
 * @author Student Name
 * @version 1.0
 */
public class Main {
    
    /**
     * Main method - entry point of the program
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to ADS Assignment Starter!");
        System.out.println("This is a basic Java project template.");
        System.out.println("You can modify this file to implement your assignment requirements.");
        
        // Example: Basic algorithm demonstration
        demonstrateBasicAlgorithm();
    }
    
    /**
     * Example method to demonstrate basic algorithmic thinking
     * This can be replaced or modified based on assignment requirements
     */
    private static void demonstrateBasicAlgorithm() {
        System.out.println("\n--- Basic Algorithm Example ---");
        
        // Simple array processing example
        int[] numbers = {5, 2, 8, 1, 9, 3};
        System.out.print("Original array: ");
        printArray(numbers);
        
        // Find maximum value
        int max = findMaximum(numbers);
        System.out.println("Maximum value: " + max);
        
        // Calculate sum
        int sum = calculateSum(numbers);
        System.out.println("Sum of all elements: " + sum);
    }
    
    /**
     * Utility method to find the maximum value in an array
     * 
     * @param array the input array
     * @return the maximum value
     */
    private static int findMaximum(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    
    /**
     * Utility method to calculate the sum of all elements in an array
     * 
     * @param array the input array
     * @return the sum of all elements
     */
    private static int calculateSum(int[] array) {
        if (array == null) {
            return 0;
        }
        
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
    
    /**
     * Utility method to print an array
     * 
     * @param array the array to print
     */
    private static void printArray(int[] array) {
        if (array == null) {
            System.out.println("null");
            return;
        }
        
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}