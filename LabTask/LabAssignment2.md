# Lab Task 2 (23-53347-3)
## Question :
**Developing a basic Java program with Inheritance.**
**Food <-- Drinks,Burger ,Pizza**

### class Food :
**Attribute :**
* **String name**
* **String ingredients []**
* **double price**
* **float calories**

**Methods :**
* **Food()**
* **Food (String name, String[] ingredients, double price, float calories)**
* **void setName(String name)**
* **void setIngredients (String[] ingredients)**
* **void setPrice(double price)**
* **void setCalories (float calories)**
* **String getName ( )**
* **String[] getIngredients ( )**
* **double getPrice ( )**
* **float getCalories ( )**
* **void removeIngredient(String ingredient)**
* **void addingredient(String ingredient)**
* **void showDetails( )**

### class Drinks :
**Attribute :**
* **String Type**
* **int sizeInLitter**


**Methods :**
* **Drinks()**
* **Drinks (String name, String[] ingredients, double price, float calories, String type, int sizeInLitter)**
* **void setType (String type)**
* **void setSize(int sizeInLitter)**
* **String getType ()**
* **int getSize ()**

### class Burger :
**Attribute :**
* **int numberOfPatty**


**Methods :**
* **Burger()**
* **Burger( String name, String[] ingredients, double price, float calories, int numberOfPatty)**
* **void setNumberOfPatty (int numberOfPatty)**
* **int getNumberOfPatty ()**
* **void showDetails ()**


### class Pizza :
**Attribute :**
* **int sizeInInches**

**Methods :**
* **Pizza()**
* **Pizza( String name, String[] ingredients, double price, float calories, int sizeInInches)**
* **void setSize (int sizeInInches)**
* **int getSize ()**
* **void showDetails ()**

### class Start
**The start class contains the main method. Inside the main method, create two objects of Drinks, Burger and Pizza. Demonstrate all the methods and constructors**

## Answer :
### File 1 : Food.java
```java
import java.util.Arrays;

public class Food {
    private String name;
    private String[] ingredients;
    private double price;
    private float calories;

    public Food() {}

    public Food(String name, String[] ingredients, double price, float calories) {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
        this.calories = calories;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCalories(float calories) {
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public double getPrice() {
        return price;
    }

    public float getCalories() {
        return calories;
    }

    public void removeIngredient(String ingredient) {
        for (int i = 0; i < ingredients.length; i++) {
            if (ingredients[i].equals(ingredient)) {
                ingredients[i] = null;
                break;
            }
        }
    }

    public void addIngredient(String ingredient) {
        ingredients = Arrays.copyOf(ingredients, ingredients.length + 1);
        ingredients[ingredients.length - 1] = ingredient;
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Ingredients: " + Arrays.toString(ingredients));
        System.out.println("Price: " + price);
        System.out.println("Calories: " + calories);
    }
}
```
### File 2 : Drinks.java
```java
public class Drinks extends Food {
    private String type;
    private int sizeInLitter;

    public Drinks() {}

    public Drinks(String name, String[] ingredients, double price, float calories, String type, int sizeInLitter) {
        super(name, ingredients, price, calories);
        this.type = type;
        this.sizeInLitter = sizeInLitter;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(int sizeInLitter) {
        this.sizeInLitter = sizeInLitter;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return sizeInLitter;
    }
}
```

### File 3 : Burger.java
```java
public class Burger extends Food {
    private int numberOfPatty;

    public Burger() {}

    public Burger(String name, String[] ingredients, double price, float calories, int numberOfPatty) {
        super(name, ingredients, price, calories);
        this.numberOfPatty = numberOfPatty;
    }

    public void setNumberOfPatty(int numberOfPatty) {
        this.numberOfPatty = numberOfPatty;
    }

    public int getNumberOfPatty() {
        return numberOfPatty;
    }
}
```

### File 4 : Pizza.java
```java
public class Pizza extends Food {
    private int sizeInInches;

    public Pizza() {}

    public Pizza(String name, String[] ingredients, double price, float calories, int sizeInInches) {
        super(name, ingredients, price, calories);
        this.sizeInInches = sizeInInches;
    }

    public void setSize(int sizeInInches) {
        this.sizeInInches = sizeInInches;
    }

    public int getSize() {
        return sizeInInches;
    }
}
```

### File 5 : Start.java

```java
public class Start {
    public static void main(String[] args) {
        // Creating two objects of Drinks
        Drinks drinks1 = new Drinks("Coca Cola", new String[]{"Water", "Sugar"}, 120, 150, "Drinks", 500);
        Drinks drinks2 = new Drinks("Orange Juice", new String[]{"Orange", "Water", "Sugar"}, 100, 120, "Juice", 500);

        // Creating two objects of Burger
        Burger burger1 = new Burger("Bar B Q", new String[]{"Bun", "Chicken", "Cheese"}, 200, 1000, 2);
        Burger burger2 = new Burger("Chicken Burger", new String[]{"Bun", "Chicken", "Sos"}, 300, 1000, 1);

        // Creating two objects of Pizza
        Pizza pizza1 = new Pizza("Bar B Q Pizza", new String[]{"Chesss", "Tomato Sos", "Chicken"}, 700, 2000, 12);
        Pizza pizza2 = new Pizza("Chicken Pizza", new String[]{"Chicken", "Tomato Sos", "Cheese"}, 1000, 3000, 14);

        drinks1.showDetails();
        System.out.println();

        drinks2.showDetails();
        System.out.println();

        burger1.showDetails();
        System.out.println();

        burger2.showDetails();
        System.out.println();

        pizza1.showDetails();
        System.out.println();

        pizza2.showDetails();
        System.out.println();
    }
}
```

## Output :
    Name: Coca Cola
    Ingredients: [Water, Sugar]
    Price: 120.0
    Calories: 150.0

    Name: Orange Juice
    Ingredients: [Orange, Water, Sugar]
    Price: 100.0
    Calories: 120.0

    Name: Bar B Q
    Ingredients: [Bun, Chicken, Cheese]
    Price: 200.0
    Calories: 1000.0

    Name: Chicken Burger
    Ingredients: [Bun, Chicken, Sos]
    Price: 300.0
    Calories: 1000.0

    Name: Bar B Q Pizza
    Ingredients: [Chesss, Tomato Sos, Chicken]
    Price: 700.0
    Calories: 2000.0

    Name: Chicken Pizza
    Ingredients: [Chicken, Tomato Sos, Cheese]
    Price: 1000.0
    Calories: 3000.0