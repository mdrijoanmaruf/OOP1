# Lab Task 4
## Question :
**Creating an array of a non-primitive data type and accessing it.**
### class Book :
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

### class Start : 
**The Start class contains the main method. Inside the main method create five objects of the Book class. Create an array of the Book class. Assign objects of the Book class in the array and print the values of the objects from the array.**

## Answer :
### File 1 : Book.java
```java
public class Book {
    private String isbn;
    private String bookTitle;
    private String authorName;
    private double price;
    private int availableQuantity;

    public Book() {
    }

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
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + bookTitle);
        System.out.println("Author: " + authorName);
        System.out.println("Price: " + price);
        System.out.println("Available Quantity: " + availableQuantity);
    }
}
```

### File 2 : Start.java
```java
public class Start {
    public static void main(String[] args) {
        // Create five objects of the Book class
        Book[] books = new Book[5];
        books[0] = new Book("1", "Book1", "Md Rijoan Maruf", 2000, 100);
        books[1] = new Book("2", "Book2", "Raisul Islam Anik", 3000, 150);
        books[2] = new Book("3", "Book3", "Rashedul Islam Shawon", 2500, 80);
        books[3] = new Book("4", "Book4", "Israul Islam", 1500, 200);
        books[4] = new Book("5", "Book5", "Md Tahsauf Islam", 4000, 120);

        // Print the values of the objects from the array
        for (Book book : books) {
            book.showDetails();
            System.out.println();
        }
    }
}
```

## Output :

    ISBN: 1
    Title: Book1
    Author: Md Rijoan Maruf
    Price: 2000.0
    Available Quantity: 100

    ISBN: 2
    Title: Book2
    Author: Raisul Islam Anik
    Price: 3000.0
    Available Quantity: 150

    ISBN: 3
    Title: Book3
    Author: Rashedul Islam Shawon
    Price: 2500.0
    Available Quantity: 80

    ISBN: 4
    Title: Book4
    Author: Israul Islam
    Price: 1500.0
    Available Quantity: 200

    ISBN: 5
    Title: Book5
    Author: Md Tahsauf Islam
    Price: 4000.0
    Available Quantity: 120


