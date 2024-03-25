# Lab Task 8
## Question :
**Developing a basic Java program with Inheritance, Association, Polymorphism, Abstraction and Interface.**
**BookShop (Extends BookShopOperations) -- Book(Extends BookOpetations) <-- StoryBook, TextBook**

### class Book :
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
* **abstract void showDetails( )**

### class StoryBook :
**Attributes :**
* **String category**

**Methods :**
* **StoryBook( )**
* **StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity,String category)**
* **void setCategory(String category)**
* **String getCategory( )**


### class TextBook :
**Attributes :**
* **int standard**

**Methods :**
* **TextBook( )**
* **TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int standard)**
* **void setStandard(int standard)**
* **int getStandard( )**

### class BookShop :
**Attributes :**
* **String name**
* **Book listOfBooks[ ] //size of array should be 100.**

**Methods :**
* **BookShop( )**
* **BookShop(String name)**
* **void setName(String name)**
* **String getName( )**

### BookOperations :
* **void addQuantity(int amount)**
* **void sellQuantity(int amount)**

### BookShopOpetarions :
* **boolean insertBook(Book b)**
* **boolean removeBook(Book b)**
* **void showAllBooks( )**
* **Book searchBook(String isbn)**

### class Start :
**The Start class contains the main method. Inside the main method, create File Object of StoryBook, FIve Object of TextBook and One object of BookShop. Demonastrate all the mehtods and constructors.**


## Answer :
### File 1 : Book.java

```java
// Interface for Book Operations
interface BookOperations {
    void addQuantity(int amount);
    void sellQuantity(int amount);
}

// Interface for BookShop Operations
interface BookShopOperations {
    boolean insertBook(Book b);
    boolean removeBook(Book b);
    void showAllBooks();
    Book searchBook(String isbn);
}

// Abstract class for Book
public abstract class Book {
    private String isbn;
    private String bookTitle;
    private String authorName;
    private double price;
    private int availableQuantity;

    public Book() {}

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

    // Abstract method
    public abstract void showDetails();
}
```

### File 2 : StoryBook.java 
```java
public class StoryBook extends Book {
    private String category;

    public StoryBook() {}

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
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Title: " + getBookTitle());
        System.out.println("Author: " + getAuthorName());
        System.out.println("Price: " + getPrice());
        System.out.println("Available Quantity: " + getAvailableQuantity());
        System.out.println("Category: " + category);
    }
}
```

### File 3 : TextBook.java

```java
public class TextBook extends Book {
    private int standard;

    public TextBook() {}

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
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Title: " + getBookTitle());
        System.out.println("Author: " + getAuthorName());
        System.out.println("Price: " + getPrice());
        System.out.println("Available Quantity: " + getAvailableQuantity());
        System.out.println("Standard: " + standard);
    }
}
```

### File 4 : BookShop.java

```java
public class BookShop implements BookShopOperations {
    private String name;
    private Book[] listOfBooks = new Book[100];
    private int bookCount = 0;

    public BookShop() {}

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

    @Override
    public boolean insertBook(Book b) {
        if (bookCount < 100) {
            listOfBooks[bookCount++] = b;
            return true;
        }
        return false;
    }

    @Override
    public boolean removeBook(Book b) {
        for (int i = 0; i < bookCount; i++) {
            if (listOfBooks[i].getIsbn().equals(b.getIsbn())) {
                listOfBooks[i] = listOfBooks[bookCount - 1];
                listOfBooks[bookCount - 1] = null;
                bookCount--;
                return true;
            }
        }
        return false;
    }

    @Override
    public void showAllBooks() {
        System.out.println("Bookshop Name: " + name);
        System.out.println("List of Books:");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("Book " + (i + 1) + ":");
            listOfBooks[i].showDetails();
            System.out.println();
        }
    }

    @Override
    public Book searchBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (listOfBooks[i].getIsbn().equals(isbn)) {
                return listOfBooks[i];
            }
        }
        return null;
    }
}
```

### File 5 : Start.java

```java
public class Start {
    public static void main(String[] args) {
        // Creating five objects of StoryBook
        StoryBook storyBook1 = new StoryBook("1234567890", "AIUB", "Rijoan", 200, 100, "Story");
        StoryBook storyBook2 = new StoryBook("2345678901", "BRAC", "Maruf", 250, 150, "Story");
        StoryBook storyBook3 = new StoryBook("3456789012", "DIU", "Anik", 150, 90, "Story");
        StoryBook storyBook4 = new StoryBook("4567890123", "AUST", "Shawon", 180, 110, "Story");
        StoryBook storyBook5 = new StoryBook("5678901234", "NSU", "Reyad", 120, 80, "Story");

        // Creating five objects of TextBook
        TextBook textBook1 = new TextBook("1234567890", "Introduction to Programming", "Arif", 300, 80, 10);
        TextBook textBook2 = new TextBook("2345678901", "Data Structures and Algorithms", "Hasan", 350, 100, 12);
        TextBook textBook3 = new TextBook("3456789012", "Java Programming", "Sajib", 25.99, 90,0);
        TextBook textBook4 = new TextBook("4567890123", "Database Management Systems", "Rashed", 400, 120, 12);
        TextBook textBook5 = new TextBook("5678901234", "Computer Networks", "Sakib", 38.99, 110,0);

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

    Bookshop Name: MyBookShop
    List of Books:
    Book 1:
    ISBN: 1234567890
    Title: AIUB
    Author: Rijoan
    Price: 200.0
    Available Quantity: 100
    Category: Story

    Book 2:
    ISBN: 2345678901
    Title: BRAC
    Author: Maruf
    Price: 250.0
    Available Quantity: 150
    Category: Story

    Book 3:
    ISBN: 3456789012
    Title: DIU
    Author: Anik
    Price: 150.0
    Available Quantity: 90
    Category: Story

    Book 4:
    ISBN: 4567890123
    Title: AUST
    Author: Shawon
    Price: 180.0
    Available Quantity: 110
    Category: Story

    Book 5:
    ISBN: 5678901234
    Title: NSU
    Author: Reyad
    Price: 120.0
    Available Quantity: 80
    Category: Story

    Book 6:
    ISBN: 1234567890
    Title: Introduction to Programming
    Author: Arif
    Price: 300.0
    Available Quantity: 80
    Standard: 10

    Book 7:
    ISBN: 2345678901
    Title: Data Structures and Algorithms
    Author: Hasan
    Price: 350.0
    Available Quantity: 100
    Standard: 12

    Book 8:
    ISBN: 3456789012
    Title: Java Programming
    Author: Sajib
    Price: 25.99
    Available Quantity: 90
    Standard: 0

    Book 9:
    ISBN: 4567890123
    Title: Database Management Systems
    Author: Rashed
    Price: 400.0
    Available Quantity: 120
    Standard: 12

    Book 10:
    ISBN: 5678901234
    Title: Computer Networks
    Author: Sakib
    Price: 38.99
    Available Quantity: 110
    Standard: 0