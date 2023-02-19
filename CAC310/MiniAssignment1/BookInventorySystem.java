//  Dhruv Patel
//  2/13/2023
//  Create a book inventory system.
//      Need a Book class with the following attributes: isbn, name, author, price, quantity
//      Need an Author class with the following attributes: name, email
//      The main should have an arraylist where you will store a minimum of 3 books and two authors.
//      Display the book inventory system in a readable way.

package MiniAssignment1;
import java.util.ArrayList;
import java.util.Comparator;

// Author Class to create an Author object with the following parameters: name, email
class Author {

    // Create private variables: name and email 
    private String name;
    private String email;

    // Constructor to create an Author object setting the name and email variables to the parameters
    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Get function for name variable
    public String getName() {
        return name;
    }

    // Get function for email variable
    public String getEmail() {
        return email;
    }

    // Set function for email variable
    public void setEmail(String email) {
        this.email = email;
    }

    // toString function to print the Author object
    public String toString() {
        return "\n     Author : [name = " + name + ", email = " + email + "]";
    }
}

// Book Class to create a Book object with the following parameters: isbn, name, author, price, quantity
class Book implements Comparator<Book>{

    // Create private variables: isbn, name, author, price, and quantity set to 0
    private String isbn;
    private String name;
    private Author author;
    private double price;
    private int quantity = 0;

    // Constructor to create a Book object setting the isbn, name, author, price, and quantity variables to the parameters
    public Book(String isbn, String name, Author author, double price, int quantity) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    // Get function for isbn variable
    public String getIsbn() {
        return isbn;
    }

    // Get function for name variable
    public String getName() {
        return name;
    }

    // Get function for author variable from Author class
    public Author getAuthor() {
        return author;
    }

    // Get function for price variable
    public double getPrice() {
        return price;
    }

    // Get function for quantity variable
    public int getQuantity() {
        return quantity;
    }

    // Set function for price variable
    public void setPrice(double price) {
        this.price = price;
    }

    // Set function for quantity variable
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    // toString function to print the Book object in a organized manner
    public String toString() {
        return "Book   : [isbn = " + isbn + ", name = " + name + "]" + author + ", price = " + price + ", quantity = "
                + quantity + "]";
    }

    // Compare function to compare the isbn of two books
    @Override
    public int compare(Book book1, Book book2) {
        book1.getIsbn().compareTo(book2.getIsbn());

        if (book1.getIsbn().compareTo(book2.getIsbn()) > 0) {
            return 1;
        } else if (book1.getIsbn().compareTo(book2.getIsbn()) < 0) {
            return -1;
        } else {
            return 0;
        }          
    }
}
    

public class BookInventorySystem {
    
    // Main Function to display the Book Inventory System
    public static void main (String [] args) {

        // Create an ArrayList of Books
        ArrayList<Book> Books = new ArrayList<>();
        
        // Create 3 Authors with the following parameters: name, email
        Author author1 = new Author("Dhruv Patel", "ddpatel@bsc.edu");
        Author author2 = new Author("Dr. Amber Wagner", "anwagner@bsc.edu");
        Author author3 = new Author("John Doe", "jdoe@bsc.edu");

        // Add Books to the ArrayList with the following parameters: isbn, name, author, price, quantity
        Books.add (new Book("187638542", "Java Programming", author1, 126.87, 12));
        Books.add (new Book("987654321", "C++ Programming", author2, 284.54, 26));
        Books.add (new Book("597683218", "Python Programming", author3, 378.25, 31));
        
        // Sort the ArrayList of Books by name
        Comparator<Book> CompareBooks = Comparator.comparing(Book::getIsbn);
        Books.sort(CompareBooks);

        // Print the Book Inventory System
        System.out.println("Book Inventory System:");

        // Starting at 0, increment by 1 until the size of the array is reached
        for (int i = 0; i < Books.size(); i++) {

            // Print the index of the array ( i + 1) in a list format, and the value of the arraylist Books at index i
            System.out.println("  " + (i + 1) + ". " + Books.get(i));
        }
    }
}

