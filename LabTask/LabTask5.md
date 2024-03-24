# Lab Task 5
## Question :
**Developing a basic Java program with Inheritance.**
**Book <-- Story Book, TextBook**
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

### class StoryBook :
**Attribute :**
* **String category**

**Methods :**
* **StoryBook( )**
* **StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, String category)**
* **void setCategory(String category)**
* **String getCategory( )**

### class TextBook :
**Attribute :**
* **int standard**

**Methods :**
* **TextBook( )**
* **TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int standard)**
* **void setStandard(int standard)**
* **int getStandard( )**

### class Start :
**The start class contains the main method. Inside the main method, create two objects of StoryBook and two objects of TextBook. Demonstrate all the methods and constructors.**

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

### File 2 : StoryBook.java
```java
public class StoryBook extends Book {
    private String category;

    public StoryBook() {
        super();
    }

    public StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, String category) {
        super(isbn, bookTitle, authorName, price, availableQuantity);
        this.category = category;
    }

    // Setter
    public void setCategory(String category) {
        this.category = category;
    }

    // Getter
    public String getCategory() {
        return category;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Category: " + category);
    }
}
```

### File 3 : TextBook.java
```java
public class TextBook extends Book {
    private int standard;

    public TextBook() {
        super();
    }

    public TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int standard) {
        super(isbn, bookTitle, authorName, price, availableQuantity);
        this.standard = standard;
    }

    // Setter
    public void setStandard(int standard) {
        this.standard = standard;
    }

    // Getter
    public int getStandard() {
        return standard;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Standard: " + standard);
    }
}
```

### File 4 : Start.java
```java
public class Start {
    public static void main(String[] args) {
        // Creating objects of StoryBook class
        StoryBook storyBook1 = new StoryBook("12345", "D Building", "Md Rijoan Maruf", 2000, 100, "Aweosome");
        StoryBook storyBook2 = new StoryBook("67890", "Anex 1", "Raisul Islam Anik", 2500, 150,"Great");

        // Creating objects of TextBook class
        TextBook textBook1 = new TextBook("34567", "Introduction to Programming", "Rashedul Islam Shawon", 3000, 80, 10);
        TextBook textBook2 = new TextBook("67890", "OOP2", "MD Tashauf Islam", 2000, 120, 12);

        // Demonstrating methods and constructors
        System.out.println("Details of StoryBook 1:");
        storyBook1.showDetails();

        System.out.println("\nDetails of StoryBook 2:");
        storyBook2.showDetails();

        System.out.println("\nDetails of TextBook 1:");
        textBook1.showDetails();

        System.out.println("\nDetails of TextBook 2:");
        textBook2.showDetails();
    }
}
```

## Output :
    Details of StoryBook 1:
    ISBN: 12345
    Title: D Building
    Author: Md Rijoan Maruf
    Price: 2000.0
    Available Quantity: 100
    Category: Aweosome

    Details of StoryBook 2:
    ISBN: 67890
    Title: Anex 1
    Author: Raisul Islam Anik
    Price: 2500.0
    Available Quantity: 150
    Category: Great

    Details of TextBook 1:
    ISBN: 34567
    Title: Introduction to Programming
    Author: Rashedul Islam Shawon
    Price: 3000.0
    Available Quantity: 80
    Standard: 10

    Details of TextBook 2:
    ISBN: 67890
    Title: OOP2
    Author: MD Tashauf Islam
    Price: 2000.0
    Available Quantity: 120
    Standard: 12