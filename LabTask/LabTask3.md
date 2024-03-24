# Lab Task 3
## Question :
**Developing basic Java classes with attributes, constructors, methods, static variables and static methods**
### class StoryBook :
**Attribute :**
* **String isbn**
* **String bookTitle**
* **String authorName**
* **double price**
* **int availableQuantity**
* **String category**
* **static double discountRate**

**Methods :**
* **StoryBook( )**
* **StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, String category)**
* **static void setDiscountRate(double rate)**
* **static double getDiscountRate( )**
* **void setIsbn(String isbn)**
* **void setBookTitle(String bookTitle)**
* **void setAuthorName(String authorName)**
* **void setPrice(double price)**
* **void setAvaiableQuantity(int availableQuantity)**
* **void setCategory(String category)**
* **String getIsbn( )**
* **String getBookTitle( )**
* **String getAuthorName( )**
* **double getPrice( )**
* **int getAvailableQuantity( )**
* **String getCategory( )**
* **void addQuantity(int amount)**
* **void sellQuantity(int amount)**
* **void showDetails( )**

### class TextBook :
**Attribute :**
* **String isbn**
* **String bookTitle**
* **String authorName**
* **double price**
* **int availableQuantity**
* **int standard**
* **static double discountRate**

**Methods :**
* **TextBook( )**
* **TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int standard)**
* **static void setDiscountRate(double rate)**
* **static double getDiscountRate( )**
* **void setIsbn(String isbn)**
* **void setBookTitle(String bookTitle)**
* **void setAuthorName(String authorName)**
* **void setPrice(double price)**
* **void setAvaiableQuantity(int availableQuantity)**
* **void setStandard(int standard)**
* **String getIsbn( )**
* **String getBookTitle( )**
* **String getAuthorName( )**
* **double getPrice( )**
* **int getAvailableQuantity( )**
* **int getStandard( )**
* **void addQuantity(int amount)**
* **void sellQuantity(int amount)**
* **void showDetails( )**

### class Start :
**The Start class contains the main method. Inside the main method, create two objects of 
StoryBook and two objects of TextBook. Demonstrate all the methods and constructors.**

## Answer :
### File 1 : StoryBook.java
```java
public class StoryBook {
    private String isbn;
    private String bookTitle;
    private String authorName;
    private double price;
    private int availableQuantity;
    private String category;
    static double discountRate;

    public StoryBook() {
    }

    public StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, String category) {
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.price = price;
        this.availableQuantity = availableQuantity;
        this.category = category;
    }

    public static void setDiscountRate(double rate) {
        discountRate = rate;
    }

    public static double getDiscountRate() {
        return discountRate;
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

    public void setCategory(String category) {
        this.category = category;
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

    public String getCategory() {
        return category;
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
        System.out.println("Category: " + category);
    }
}
```

### File 2 : TextBook.java
```java
public class TextBook {
    private String isbn;
    private String bookTitle;
    private String authorName;
    private double price;
    private int availableQuantity;
    private int standard;
    static double discountRate;

    public TextBook() {
    }

    public TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int standard) {
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.price = price;
        this.availableQuantity = availableQuantity;
        this.standard = standard;
    }

    public static void setDiscountRate(double rate) {
        discountRate = rate;
    }

    public static double getDiscountRate() {
        return discountRate;
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

    public void setStandard(int standard) {
        this.standard = standard;
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

    public int getStandard() {
        return standard;
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
        System.out.println("Standard: " + standard);
    }
}
```

### File 3 : Start.java
```java
public class Start {
    public static void main(String[] args) {
        // Creating objects of StoryBook class
        StoryBook.setDiscountRate(0.1); // Setting discount rate for StoryBook
        StoryBook storyBook1 = new StoryBook("1234567890", "AIUB Book 1", "Md Rijoan Maruf", 2000, 100, "Learning");
        StoryBook storyBook2 = new StoryBook("94385843r54", "AIUB Book 2", "Raisul Islam Anik", 2500, 150, "Learning");

        // Creating objects of TextBook class
        TextBook.setDiscountRate(0.15); // Setting discount rate for TextBook
        TextBook textBook1 = new TextBook("5678901234", "Introduction to Programming", "Rashedul Islam Shawon", 3000, 80, 10);
        TextBook textBook2 = new TextBook("4321098765", "Advanced Mathematics", "Israul Islam", 3599, 120, 12);

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
    ISBN: 1234567890
    Title: AIUB Book 1
    Author: Md Rijoan Maruf
    Price: 2000.0
    Available Quantity: 100
    Category: Learning

    Details of StoryBook 2:
    ISBN: 94385843r54
    Title: AIUB Book 2
    Author: Raisul Islam Anik
    Price: 2500.0
    Available Quantity: 150
    Category: Learning

    Details of TextBook 1:
    ISBN: 5678901234
    Title: Introduction to Programming
    Author: Rashedul Islam Shawon
    Price: 3000.0
    Available Quantity: 80
    Standard: 10

    Details of TextBook 2:
    ISBN: 4321098765
    Title: Advanced Mathematics
    Author: Israul Islam
    Price: 3599.0
    Available Quantity: 120
    Standard: 12
