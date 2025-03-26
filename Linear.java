import java.util.Scanner;

class Linear {
    public static void main(String args[]) {
        int a, i, e;
        boolean found = false;  // Use a boolean variable for clarity
        Scanner sc = new Scanner(System.in);

        // Input number of elements
        System.out.println("Enter the number of elements in array:");
        a = sc.nextInt();
       
        int[] ar = new int[a];  // Declare and initialize the array

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (i = 0; i < a; i++) {
            ar[i] = sc.nextInt();
        }

        // Input element to be searched
        System.out.println("Enter the element to be searched:");
        e = sc.nextInt();

        // Perform linear search
        for (i = 0; i < a; i++) {
            if (ar[i] == e) {
                found = true;  // Set found to true if element is found
                break;  // Break the loop if element is found
            }
        }

        // Output result
        if (found) {
            System.out.println("Element is found");
        } else {
            System.out.println("Element is not found");
        }

        sc.close();  // Close the scanner to avoid resource leakage
    }
}
