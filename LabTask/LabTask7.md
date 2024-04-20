# Lab Task 7
## Question :
**Developing a basic Java program with Inheritance, Association and Polymorphism.**
**BookShop -- Book <-- StoryBook,TextBook**

### class B0ok
**Attributes :**
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


### class StoryBook
**Attribute :**
* **String category**

**Methods :**
* **StoryBook( )**
* **StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, String category)**
* **void setCategory(String category)**
* **String getCategory( )**

### class TextBook
**Attribute :**
* **int standard**

**Methods :**
* **TextBook( )**
* **TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int standard)**
* **void setStandard(int standard)**
* **int getStandard( )**

### class BookShop :
**Attributes :**
* **String name**
* **Book books[ ] //size of array should be 100.**

**Methods :**
* **BookShop( )**
* **BookShop(String name)**
* **void setName(String name)**
* **String getName( )**
* **boolean insertBook(Book b)**
* **boolean removeBook(Book b)**
* **void showAllBooks( )**
* **Book searchBook(String isbn)**


### class Start :
**The Start class contains the main method. Inside the main method, create Five objects of StoryBook, Five objects of TextBook and One object of BookShop. Demonstrate all the methods and constructors.**


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



### File 4 : BookShop.java
```java
public class BookShop {
    private String name;
    private Book[] books = new Book[100];
    private int bookCount = 0;

    public BookShop() {
    }

    public BookShop(String name) {
        this.name = name;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    // Getters
    public String getName() {
        return name;
    }

    public boolean insertBook(Book b) {
        if (bookCount < 100) {
            books[bookCount++] = b;
            return true;
        } else {
            System.out.println("Book inventory is full.");
            return false;
        }
    }

    public boolean removeBook(Book b) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(b.getIsbn())) {
                books[i] = books[bookCount - 1];
                books[bookCount - 1] = null;
                bookCount--;
                return true;
            }
        }
        System.out.println("Book not found in inventory.");
        return false;
    }

    public Book searchBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                return books[i];
            }
        }
        return null;
    }

    public void showAllBooks() {
        System.out.println("Books in inventory:");
        for (int i = 0; i < bookCount; i++) {
            books[i].showDetails();
            System.out.println();
        }
    }
}
```



### File 5 : Start.java
```java
public class Start {
    public static void main(String[] args) {
        // Creating five objects of StoryBook
        StoryBook storyBook1 = new StoryBook("1234567890", "AIUB", "Rijoan", 200, 100, "Story");
        StoryBook storyBook2 = new StoryBook("2345678901", "NSU", "Maruf", 250, 150, "Story");
        StoryBook storyBook3 = new StoryBook("3456789012", "DIU", "Anik", 150, 90, "Story");
        StoryBook storyBook4 = new StoryBook("4567890123", "AUST", "Shawon", 180, 110, "Story");
        StoryBook storyBook5 = new StoryBook("5678901234", "BRAC", "Reyad", 120, 80, "Story");

        // Creating five objects of TextBook
        TextBook textBook1 = new TextBook("1234567890", "Introduction to Programming", "Arif", 300, 80, 10);
        TextBook textBook2 = new TextBook("2345678901", "Data Structures and Algorithms", "Hasan", 350, 100, 12);
        TextBook textBook3 = new TextBook("3456789012", "Java Programming", "Sajib", 250, 90, 11);
        TextBook textBook4 = new TextBook("4567890123", "Database Management Systems", "Rashed", 400, 120, 12);
        TextBook textBook5 = new TextBook("5678901234", "Computer Networks", "Sakib", 380, 110, 13);

        // Creating an object of BookShop
        BookShop bookShop = new BookShop("MyBookShop");

        // Inserting books into BookShop
        bookShop.insertBook(storyBook1);
        bookShop.insertBook(storyBook2);
        bookShop.insertBook(storyBook3);
        bookShop.insertBook(storyBook4);
        bookShop.insertBook(storyBook5);
        bookShop.insertBook(textBook1);
        bookShop.insertBook(textBook2);
        bookShop.insertBook(textBook3);
        bookShop.insertBook(textBook4);
        bookShop.insertBook(textBook5);

        // Showing all books in inventory
        bookShop.showAllBooks();
    }
}
```



## Output :

    Books in inventory:
    ISBN: 1234567890
    Title: AIUB
    Author: Rijoan
    Price: 200.0
    Available Quantity: 100
    Category: Story

    ISBN: 2345678901
    Title: NSU
    Author: Maruf
    Price: 250.0
    Available Quantity: 150
    Category: Story

    ISBN: 3456789012
    Title: DIU
    Author: Anik
    Price: 150.0
    Available Quantity: 90
    Category: Story

    ISBN: 4567890123
    Title: AUST
    Author: Shawon
    Price: 180.0
    Available Quantity: 110
    Category: Story

    ISBN: 5678901234
    Title: BRAC
    Author: Reyad
    Price: 120.0
    Available Quantity: 80
    Category: Story

    ISBN: 1234567890
    Title: Introduction to Programming
    Author: Arif
    Price: 300.0
    Available Quantity: 80
    Standard: 10

    ISBN: 2345678901
    Title: Data Structures and Algorithms
    Author: Hasan
    Price: 350.0
    Available Quantity: 100
    Standard: 12

    ISBN: 3456789012
    Title: Java Programming
    Author: Sajib
    Price: 250.0
    Available Quantity: 90
    Standard: 11

    ISBN: 4567890123
    Title: Database Management Systems
    Author: Rashed
    Price: 400.0
    Available Quantity: 120
    Standard: 12

    ISBN: 5678901234
    Title: Computer Networks
    Author: Sakib
    Price: 380.0
    Available Quantity: 110
    Standard: 13



