package lec4.assignments;

import java.util.ArrayList;

public class Library {
    // Add the missing implementation to this class
    String addr;
    ArrayList<Book> books = new ArrayList<Book>();
    static String openingHours = "9:30~21:00";

    Library(String address) {
        addr = address;
    }

    static void printOpeningHours() {
        System.out.println(openingHours);
    }

    void printAddress() {
        System.out.println(addr);
    }

    void addBook(Book book) {
        books.add(book);
    }

    void borrowBook(String bookName) {
        Boolean bookExist = false;

        for (Book book : books) {
            if (book.title == bookName) {
                bookExist = true;

                if (book.borrowed) {
                    System.out.println("\"" + bookName + "\" has been borrowed by someone else.");
                } else {
                    book.borrowed = true;
                    System.out.println("\"" + bookName + "\" borrowed successfully.");
                }

                break;
            }
        }

        if (!bookExist) {
            System.out.println("\"" + bookName + "\" does not exist in " + addr + " yet.");
        }
    }

    void printAvailableBooks() {
        if (books.size() == 0) {
            System.out.println("--");
            return;
        }

        for (Book book : books) {
            if (!book.borrowed) {
                System.out.println(book.title);
            }
        }
    }

    void returnBook(String bookTitle) {
        Boolean bookExisted = false;

        for (Book book : books) {
            if (book.title == bookTitle) {
                bookExisted = true;

                if (book.borrowed) {
                    book.borrowed = false;
                    System.out.println("\"" + bookTitle + "\" returned successfully.");
                } else {
                    System.out.println("\"" + bookTitle + "\" is not borrowed.");
                }

                break;
            }
        }

        if (!bookExisted) {
            System.out.println("\"" + bookTitle + "\" does not exist in " + addr + " yet.");
        }
    }

    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}