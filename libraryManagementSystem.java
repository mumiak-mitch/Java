import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private int id;

    public Book(String title, String author, int id) {
        this.title = title;
        this.author = author;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println("ID: " + book.getId());
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println();
        }
    }

    public void searchBook(String title) {
        boolean found = false;

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found:");
                System.out.println("ID: " + book.getId());
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }
}

public class libraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        // Add some sample books
        library.addBook(new Book("Book 1", "Author 1", 1));
        library.addBook(new Book("Book 2", "Author 2", 2));
        library.addBook(new Book("Book 3", "Author 3", 3));

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Library Management System");
            System.out.println("1. Display Books");
            System.out.println("2. Search Book");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    library.displayBooks();
                    break;
                case 2:
                    System.out.print("Enter the title of the book: ");
                    scanner.nextLine(); // Clear the buffer
                    String title = scanner.nextLine();
                    library.searchBook(title);
                    break;
                case 3:
                    isRunning = false;
                    System.out.println("Exiting Library Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println();
        }

        scanner.close();
    }
}
