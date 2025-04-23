import java.util.Scanner;

// Base class
class Publisher {
    String publisherName;

    Publisher(String publisherName) {
        this.publisherName = publisherName;
    }
}

// Book class inherits Publisher
class Book extends Publisher {
    String title;

    Book(String publisherName, String title) {
        super(publisherName);
        this.title = title;
    }
}

// Literature class inherits Book
class Literature extends Book {
    Literature(String publisherName, String title) {
        super(publisherName, title);
    }

    void display() {
        System.out.println("Category: Literature");
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisherName);
        System.out.println("---------------------------");
    }
}

// Fiction class inherits Book
class Fiction extends Book {
    Fiction(String publisherName, String title) {
        super(publisherName, title);
    }

    void display() {
        System.out.println("Category: Fiction");
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisherName);
        System.out.println("---------------------------");
    }
}

// Main class
public class Publisherr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");

            System.out.print("Enter title: ");
            String title = sc.nextLine();

            System.out.print("Enter publisher: ");
            String publisher = sc.nextLine();

            System.out.print("Enter category (Literature/Fiction): ");
            String category = sc.nextLine();

            if (category.equalsIgnoreCase("Literature")) {
                books[i] = new Literature(publisher, title);
            } else if (category.equalsIgnoreCase("Fiction")) {
                books[i] = new Fiction(publisher, title);
            } else {
                System.out.println("Invalid category. Skipping entry.");
                i--; // retry current index
            }
        }

        // Display books by category
        System.out.println("\n--- Book Details ---");
        for (Book b : books) {
            if (b instanceof Literature) {
                ((Literature) b).display();
            } else if (b instanceof Fiction) {
                ((Fiction) b).display();
            }
        }

        sc.close();
    }
}

