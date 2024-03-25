# Lab Task 6
## Question :
**Developing a basic Java program with Association.**
**Book <-- StoryBook,TextBook <-- BookShop**

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

### class BookShop :
**Attribute :**
* **String name**
* **TextBook textBooks[ ]   //size of array should be 100.**
* **StoryBook storyBooks[ ] //size of array should be 100.**

**Metods :**
* **BookShop( )**
* **BookShop(String name)**
* **void setName(String name)**
* **String getName( )**
* **boolean insertTextBook(TextBook tb)**
* **boolean removeTextBook(TextBook tb)**
* **TextBook searchTextBook(String isbn)**
* **void showAllTextBooks( )**
* **boolean insertStoryBook(StoryBook sb)**
* **boolean removeStoryBook(StoryBook sb)**
* **StoryBook searchStoryBook(String isbn)**
* **void showAllStoryBooks( )**

### class Start :
**The start class contains the main method. Inside the main method, create five objects of TextBook, five objects of StoryBook and one object of BookShop. Demonstrate all the methods and constructors.**

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
class BookShop {
    private String name;
    private TextBook[] textBooks = new TextBook[100];
    private StoryBook[] storyBooks = new StoryBook[100];
    private int textBookCount = 0;
    private int storyBookCount = 0;

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

    public boolean insertTextBook(TextBook tb) {
        if (textBookCount < 100) {
            textBooks[textBookCount++] = tb;
            return true;
        } else {
            System.out.println("TextBook inventory is full.");
            return false;
        }
    }

    public boolean removeTextBook(TextBook tb) {
        for (int i = 0; i < textBookCount; i++) {
            if (textBooks[i].getIsbn().equals(tb.getIsbn())) {
                textBooks[i] = textBooks[textBookCount - 1];
                textBooks[textBookCount - 1] = null;
                textBookCount--;
                return true;
            }
        }
        System.out.println("TextBook not found in inventory.");
        return false;
    }

    public TextBook searchTextBook(String isbn) {
        for (int i = 0; i < textBookCount; i++) {
            if (textBooks[i].getIsbn().equals(isbn)) {
                return textBooks[i];
            }
        }
        return null;
    }

    public void showAllTextBooks() {
        System.out.println("TextBooks in inventory:");
        for (int i = 0; i < textBookCount; i++) {
            textBooks[i].showDetails();
            System.out.println();
        }
    }

    public boolean insertStoryBook(StoryBook sb) {
        if (storyBookCount < 100) {
            storyBooks[storyBookCount++] = sb;
            return true;
        } else {
            System.out.println("StoryBook inventory is full.");
            return false;
        }
    }

    public boolean removeStoryBook(StoryBook sb) {
        for (int i = 0; i < storyBookCount; i++) {
            if (storyBooks[i].getIsbn().equals(sb.getIsbn())) {
                storyBooks[i] = storyBooks[storyBookCount - 1];
                storyBooks[storyBookCount - 1] = null;
                storyBookCount--;
                return true;
            }
        }
        System.out.println("StoryBook not found in inventory.");
        return false;
    }

    public StoryBook searchStoryBook(String isbn) {
        for (int i = 0; i < storyBookCount; i++) {
            if (storyBooks[i].getIsbn().equals(isbn)) {
                return storyBooks[i];
            }
        }
        return null;
    }

    public void showAllStoryBooks() {
        System.out.println("StoryBooks in inventory:");
        for (int i = 0; i < storyBookCount; i++) {
            storyBooks[i].showDetails();
            System.out.println();
        }
    }
}
```



### File 5 : Start.java
```java
public class Start {
    public static void main(String[] args) {
        // Creating five objects of TextBook
        TextBook textBook1 = new TextBook("1234567890", "C++", "MD Rijoan Maruf", 300, 80, 10);
        TextBook textBook2 = new TextBook("2345678901", "DSA", "Raisul Islam Anik", 350, 100, 12);
        TextBook textBook3 = new TextBook("3456789012", "Java", "Rashedul Islam Shawon", 250, 90, 11);
        TextBook textBook4 = new TextBook("4567890123", "Database", "Maruf", 400, 120, 12);
        TextBook textBook5 = new TextBook("5678901234", "Computer Networks", "Reyad", 380, 110, 13);

        // Creating five objects of StoryBook
        StoryBook storyBook1 = new StoryBook("1234567890", "AIUB", "Rijoan", 200, 100, "UV");
        StoryBook storyBook2 = new StoryBook("2345678901", "NSU", "Maruf", 250, 150, "UV");
        StoryBook storyBook3 = new StoryBook("3456789012", "IUB", "Anik", 150, 90, "UV");
        StoryBook storyBook4 = new StoryBook("4567890123", "BRAC", "Shawon", 180, 110, "UV");
        StoryBook storyBook5 = new StoryBook("5678901234", "AUST", "Raisul", 120, 80, "UV");

        // Creating an object of BookShop
        BookShop bookShop = new BookShop("MyBookShop");

        // Inserting TextBooks into BookShop
        bookShop.insertTextBook(textBook1);
        bookShop.insertTextBook(textBook2);
        bookShop.insertTextBook(textBook3);
        bookShop.insertTextBook(textBook4);
        bookShop.insertTextBook(textBook5);

        // Inserting StoryBooks into BookShop
        bookShop.insertStoryBook(storyBook1);
        bookShop.insertStoryBook(storyBook2);
        bookShop.insertStoryBook(storyBook3);
        bookShop.insertStoryBook(storyBook4);
        bookShop.insertStoryBook(storyBook5);

        // Searching for a TextBook
        System.out.println("Searching for a TextBook:");
        TextBook foundTextBook = bookShop.searchTextBook("3456789012");
        if (foundTextBook != null) {
            foundTextBook.showDetails();
        } else {
            System.out.println("TextBook not found.");
        }

        // Searching for a StoryBook
        System.out.println("\nSearching for a StoryBook:");
        StoryBook foundStoryBook = bookShop.searchStoryBook("2345678901");
        if (foundStoryBook != null) {
            foundStoryBook.showDetails();
        } else {
            System.out.println("StoryBook not found.");
        }

        // Showing all TextBooks in inventory
        System.out.println("\nAll TextBooks in inventory:");
        bookShop.showAllTextBooks();

        // Showing all StoryBooks in inventory
        System.out.println("\nAll StoryBooks in inventory:");
        bookShop.showAllStoryBooks();
    }
}
```

## Output :

    Searching for a TextBook:
    ISBN: 3456789012
    Title: Java
    Author: Rashedul Islam Shawon
    Price: 250.0
    Available Quantity: 90
    Standard: 11

    Searching for a StoryBook:
    ISBN: 2345678901
    Title: NSU
    Author: Maruf
    Price: 250.0
    Available Quantity: 150
    Category: UV

    All TextBooks in inventory:
    TextBooks in inventory:
    ISBN: 1234567890
    Title: C++
    Author: MD Rijoan Maruf
    Price: 300.0
    Available Quantity: 80
    Standard: 10

    ISBN: 2345678901
    Title: DSA
    Author: Raisul Islam Anik
    Price: 350.0
    Available Quantity: 100
    Standard: 12

    ISBN: 3456789012
    Title: Java
    Author: Rashedul Islam Shawon
    Price: 250.0
    Available Quantity: 90
    Standard: 11

    ISBN: 4567890123
    Title: Database
    Author: Maruf
    Price: 400.0
    Available Quantity: 120
    Standard: 12

    ISBN: 5678901234
    Title: Computer Networks
    Author: Reyad
    Price: 380.0
    Available Quantity: 110
    Standard: 13


    All StoryBooks in inventory:
    StoryBooks in inventory:
    ISBN: 1234567890
    Title: AIUB
    Author: Rijoan
    Price: 200.0
    Available Quantity: 100
    Category: UV

    ISBN: 2345678901
    Title: NSU
    Author: Maruf
    Price: 250.0
    Available Quantity: 150
    Category: UV

    ISBN: 3456789012
    Title: IUB
    Author: Anik
    Price: 150.0
    Available Quantity: 90
    Category: UV

    ISBN: 4567890123
    Title: BRAC
    Author: Shawon
    Price: 180.0
    Available Quantity: 110
    Category: UV

    ISBN: 5678901234
    Title: AUST
    Author: Raisul
    Price: 120.0
    Available Quantity: 80
    Category: UV





