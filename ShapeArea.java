import java.util.Scanner;

class ShapeArea {

    // Method to calculate the area of a circle
    public double area(double radius) {
        return Math.PI * radius * radius; // Area of a circle: π * r^2
    }

    // Method to calculate the area of a rectangle
    public double area(double length, double width) {
        return length * width; // Area of a rectangle: length * width
    }

    // Method to calculate the area of a square
    public double area(int side) {
        return side * side; // Area of a square: side^2
    }

    // Method to calculate the area of a triangle
    public double area(float base, float height) {
        return 0.5 * base * height; // Area of a triangle: 1/2 * base * height
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        ShapeArea shape = new ShapeArea();

        // Loop to keep asking the user to calculate areas of different shapes
        while (true) {
            // Ask the user to select a shape
            System.out.println("\nSelect the shape to calculate area:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Triangle");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            // Calculate and display the area based on the choice
            if (choice == 1) {
                // Get the radius from the user for the circle
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                double circleArea = shape.area(radius);
                System.out.println("Area of Circle: " + circleArea);
            } else if (choice == 2) {
                // Get the length and width from the user for the rectangle
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                double rectangleArea = shape.area(length, width);
                System.out.println("Area of Rectangle: " + rectangleArea);
            } else if (choice == 3) {
                // Get the side from the user for the square
                System.out.print("Enter the side length of the square: ");
                int side = scanner.nextInt();
                double squareArea = shape.area(side);
                System.out.println("Area of Square: " + squareArea);
            } else if (choice == 4) {
                // Get the base and height from the user for the triangle
                System.out.print("Enter the base of the triangle: ");
                float base = scanner.nextFloat();
                System.out.print("Enter the height of the triangle: ");
                float height = scanner.nextFloat();
                double triangleArea = shape.area(base, height);
                System.out.println("Area of Triangle: " + triangleArea);
            } else if (choice == 5) {

                break; // Exit the loop and terminate the program
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }

        // Close the scanner object to avoid resource leak
        scanner.close();
    }
}

