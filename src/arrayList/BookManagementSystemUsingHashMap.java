package arrayList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Book {

    int bookId;
    String title;
    String author;
    double price;

    void display() {

        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("----------------------");
    }
}

public class BookManagementSystemUsingHashMap {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Book> books = new HashMap<>();

        int choice;

        do {

            System.out.println("\n===== BOOK MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Search Book by ID");
            System.out.println("4. Update Book");
            System.out.println("5. Delete Book");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

            case 1:

                Book b = new Book();

                System.out.print("Enter Book ID: ");
                b.bookId = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter Title: ");
                b.title = sc.nextLine();

                System.out.print("Enter Author: ");
                b.author = sc.nextLine();

                System.out.print("Enter Price: ");
                b.price = sc.nextDouble();

                if (books.containsKey(b.bookId)) {

                    System.out.println("Book ID already exists.");

                } else {

                    books.putIfAbsent(b.bookId, b);

                    System.out.println("Book added successfully.");
                }

                break;

            case 2:

                if (books.isEmpty()) {

                    System.out.println("No books available.");

                } else {

                    System.out.println("\n===== ALL BOOKS =====");

                    for (Map.Entry<Integer, Book> entry : books.entrySet()) {

                        Book book = entry.getValue();

                        book.display();
                    }
                }

                break;

            case 3:

                System.out.print("Enter Book ID to search: ");
                int searchId = sc.nextInt();

                if (books.containsKey(searchId)) {

                    Book book = books.get(searchId);

                    System.out.println("\nBook Found:");

                    book.display();

                } else {

                    System.out.println("Book not found.");
                }

                break;

            case 4:

                System.out.print("Enter Book ID to update: ");
                int updateId = sc.nextInt();

                if (books.containsKey(updateId)) {

                    Book book = books.get(updateId);

                    sc.nextLine();

                    System.out.print("Enter new Title: ");
                    book.title = sc.nextLine();

                    System.out.print("Enter new Author: ");
                    book.author = sc.nextLine();

                    System.out.print("Enter new Price: ");
                    book.price = sc.nextDouble();

                    books.put(updateId, book);

                    System.out.println("Book updated successfully.");

                } else {

                    System.out.println("Book not found.");
                }

                break;

            case 5:

                System.out.print("Enter Book ID to delete: ");
                int deleteId = sc.nextInt();

                if (books.containsKey(deleteId)) {

                    books.remove(deleteId);

                    System.out.println("Book deleted successfully.");

                } else {

                    System.out.println("Book not found.");
                }

                break;

            case 6:

                System.out.println("Thank you!");

                break;

            default:

                System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}