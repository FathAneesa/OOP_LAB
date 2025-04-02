import java.util.Arrays;
import java.util.Scanner;

public class arraybinary {
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

        // Perform binary search
        int index = Arrays.binarySearch(numbers, key);

        // Check if the number was found
        if (index >= 0) {
            System.out.println("Element " + key + " found at index: " + index);
        } else {
            System.out.println("Element " + key + " not found");
        }

        }
}

