# Lab Task 2
## Question :
**Developing a basic Java class with attributes, constructors and methods with main method in a separated class**
**Attribute :**
* **String isbn**
* **String bookTitle**
* **String authorName**
* **double price**
* **int availableQuantity**

**Methods :**
* **Book( )**
* **Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity)**
* **void setIsbn(String isbn)**
* **void setBookTitle(String bookTitle)**
* **void setAuthorName(String authorName)**
* **void setPrice(double price)**
* **void setAvaiableQuantity(int availableQuantity)**
* **String getIsbn( )**
* **String getBookTitle( )**
* **String getAuthorName( )**
* **double getPrice( )**
* **int getAvailableQuantity( )**
* **void addQuantity(int amount)**
* **void sellQuantity(int amount)**
* **void showDetails( )**

**Note :** The Start class contains the main method. Inside the main method create two objects of the 
Book class and demonstrate all the constructors and methods.

## Answer :
### File 1 : Book.java
```java
public class Book {
    private String isbn;
    private String bookTitle;
    private String authorName;
    private double price;
    private int availableQuantity;

    // Default constructor
    public Book() {
    }

    // Parameterized constructor
    public Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity) {
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }

    // Setters
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    // Getters
    public String getIsbn() {
        return isbn;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public double getPrice() {
        return price;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    // Additional methods
    public void addQuantity(int amount) {
        availableQuantity += amount;
    }

    public void sellQuantity(int amount) {
        if (availableQuantity >= amount) {
            availableQuantity -= amount;
        } else {
            System.out.println("Insufficient quantity available.");
        }
    }

    public void showDetails() {
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Title: " + getBookTitle());
        System.out.println("Author: " + getAuthorName());
        System.out.println("Price: " + getPrice());
        System.out.println("Available Quantity: " + getAvailableQuantity());
    }
}
```

### File 2 : Start.java
```java
public class Start {
    public static void main(String[] args) {
        // Creating objects of Book class and demonstrating constructors and methods
        Book book1 = new Book(); // Default constructor
        Book book2 = new Book("1234567890", "Java Programming", "Md Rijoan Maruf", 1000, 100); // Parameterized constructor

        // Setting attributes using setters
        book1.setIsbn("0987654321");
        book1.setBookTitle("Introduction to Java");
        book1.setAuthorName("Raisul Islam Anik");
        book1.setPrice(800);
        book1.setAvailableQuantity(50);

        // Getting attributes using getters
        System.out.println("ISBN of book1: " + book1.getIsbn());
        System.out.println("Title of book1: " + book1.getBookTitle());
        System.out.println("Author of book1: " + book1.getAuthorName());
        System.out.println("Price of book1: " + book1.getPrice());
        System.out.println("Available Quantity of book1: " + book1.getAvailableQuantity());

        // Adding and selling quantities
        book1.addQuantity(20);
        book1.sellQuantity(15);
        book1.sellQuantity(60); // Trying to sell more than available quantity

        // Showing details of both books
        System.out.println("\nDetails of book1:");
        book1.showDetails();
        System.out.println("\nDetails of book2:");
        book2.showDetails();
    }
}
```
## Output :

    ISBN of book1: 0987654321
    Title of book1: Introduction to Java
    Author of book1: Raisul Islam Anik
    Price of book1: 800.0
    Available Quantity of book1: 50
    Insufficient quantity available.

    Details of book1:
    ISBN: 0987654321
    Title: Introduction to Java
    Author: Raisul Islam Anik
    Price: 800.0
    Available Quantity: 55

    Details of book2:
    ISBN: 1234567890
    Title: Java Programming
    Author: Md Rijoan Maruf
    Price: 1000.0
    Available Quantity: 100
