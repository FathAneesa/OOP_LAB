import java.util.Arrays;
import java.util.Scanner;

public class recbinary {
    
    // Recursive binary search method
    public static int binarySearch(int[] arr, int left, int right, int key) {
        // Base case: If the array is empty
        if (left > right) {
            return -1;  // Element is not present
        }
        
        // Find the middle element
        int mid = left + (right - left) / 2;
        
        // Check if the element is at the middle
        if (arr[mid] == key) {
            return mid;  // Element found
        }
        
        // If the element is smaller than mid, it must be in the left subarray
        if (arr[mid] > key) {
            return binarySearch(arr, left, mid - 1, key);  // Search in the left half
        }
        
        // Otherwise, the element must be in the right subarray
        return binarySearch(arr, mid + 1, right, key);  // Search in the right half
    }

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Create an array of the given size
        int[] numbers = new int[size];

        // Ask the user to input the elements of the array
        System.out.println("Enter the elements of the array (in sorted order):");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Ask the user for the element to search for
        System.out.print("Enter the number to search for: ");
        int key = scanner.nextInt();

        // Perform recursive binary search
        int index = binarySearch(numbers, 0, numbers.length - 1, key);

        // Check if the number was found
        if (index >= 0) {
            System.out.println("Element " + key + " found at index: " + index);
        } else {
            System.out.println("Element " + key + " not found");
        }

        // Close the scanner
        scanner.close();
    }
}

