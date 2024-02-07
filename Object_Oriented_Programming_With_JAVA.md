# OOP With JAVA
## Basic Structure 
```java
package com.company; // Groups classes
public class Main{	// Entrypoint into the application
	public static void main(String[] args){
		System.out.println(“Hello World”);
	}
}
```


## Chapter 1 - Variable and Datatype
### Variable :
A variable is a container that stores a value. This value can be changed during execution of the program.
#### Example :
```java
int number = 0;
// int --> Data type
// number --> Variable name
// 0 --> Value it stores!
```
### Rules for declaring a variable name :
We can choose a name while declearing a java variable if the following rulls are followed :
    1. Must not begin with a digit . Ex: 1rijoan  , 2maruf
    2. Name is case sensitive.
    3. Should not be a keyword.
    4. Can contain alphabats , $ , _ , digits (not in first charecter).

### Data Type :
1. Primitive Data Types 
2. Non-Primitive Data Types (Derived)

### Primitive Data Types :
Java i statically typed language. Variables must be decelared before use. There are 8 primitive data types supported by java.
#### byte 
    * Value range from [-2^7 to (2^7 -1)]
    * Takes 1 byte
    * Default value is zero

#### short
    * Value range from [-2^15 to (2^15 -1)]
    * Takes 2 bytes
    * Default value is 0

#### int
    * Value range from [-2^31 to (2^31 -1)]
    * Takes 2 bytes
    * Default value is 0

#### float
    * Value range will vary
    * Takes 4 bytes
    * Default value is 0.0f

#### long
    * Value range from [-2^63 to (2^63 -1)]
    * Takes 8 bytes
    * Default value is 0

#### double
    * Value range will vary
    * Takes 8 bytes
    * Default value is 0.0d

#### char
    * Value range from [0 to (2^16 -1)]
    * Takes 2 bytes (Because it supports unicode)
    * Default value is '\u000'

#### boolean
    * Value can be true or false
    * Size depends on JVM
    * Default value is flase

### How to choose data types for out variable :
    * Integer (int)
        * byte , short , int , long(L)
    * Float (Decimal)
        * flaot(f or F) , double(d or D)
    * Char(' ')
    * Boolean(true/false)

In order to choose data type we first need to find the type of data we want to store. After that we need to analyze the Min & Max value we might use.

### Literals :
    A constant value which can be assgned to the variable is called as a literal.
    **Example :**
    * 101 --> Integer Literal
    * 11.11f --> Float Literal
    * 10.11  --> Double Literal (Default type for decimals)
    * 'A' --> Charecter Literal
    * true --> Boolean Literal
    * "RijoaN" --> String Literal
lenght
### Reading data form the keyboard :
```java
import java.util.Scanner;
public class userinput {
    public static void main(String[] args){
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("a + b = " + sum);
        
    }
}
```

## Chapter 2 - Operators and Expressions :
### Types of Operators :
    1. Arithmetic Operator --> + , - , * , / , % , ++ , --
    2. Assignment Operator --> = , += , -= , *= , /=
    3. Comparison Opetator --> == , >= , <=
    4. Logical Operator    --> && , || , !
    5. Bitwse Opetator     --> & , | 

Arithmetic operators canno work with booleans and % operator can work on floats & deubles.

### Operator Precedence and Associvativity :
    * , / --> Left to Right
    + , - --> Right to Left
    ++ , = --> Right to Left

### Resulting data type offer arithmetic operator :
    Result = byte  + short  --> int
    Result = short + int    --> int
    Result = long  + float  --> float
    Result = int   + float  --> float
    Result = char  + int    --> int
    Result = char  + short  --> int
    Result = long  + double --> double
    Result = float + double --> double

### Increment & Decrement Operator :
    a++ --> First use the value then increment.
    ++a --> First increment the value than use it.

## Chapter 3 - String 
```java
String name;
name = new String("Rijoan Maruf");
String name2;
name2 = "Saif";
```

String is a class but can be used like a datatype.

### Different ways to print in java :
```java
System.out.print("Md Rijoan Maruf");    // No new line at the end.
System.out.println("Md Rijoan Maruf");  // Prints a new line at the end.
System.out.printf("Md Rijoan Maruf\n"); // As like c programming printf.
System.out.format("Md Rijoan Maruf\n"); // As like printf
```
    %d  -->   for int
    %f  -->   for float
    %c  -->   for char
    %s  -->   for String

### String Methods :
#### name.lenght();
Returns lenght of String name.
```java
String name = "Md Rijoan Maruf";
// Output : 15
```

#### name.toLowerCase();
Returns a new String which has all the lowercase characters form the stirng name.
```java
String name = "Md Rijoan Maruf";
// Output : md rijoan maruf
```

#### name.toUpperCase();
Returns a new String which has all the uppercase charecters form the stirng name.
```java
String name = "Md Rijoan Maruf";
// Output : MD RIJOAN MARUF
```

#### name.trim();
Returns a new String and remove all white spaces form the orignal String.
```java
String name = "Md Rijoan Maruf";
// Output : MdRijoanMaruf
```

#### name.substring();
```java
String name = "Md Rijoan Maruf";

// Get a substring from index 3 to 8
String substring = name.substring(3);
// Return all substring form index 3 to index end.
System.out.println("Substring from index 3 to end: " + substring);
// Output: Substring from index 3 to 8: Rijoan Maruf
```

#### name.substring();
```java
String name = "Md Rijoan Maruf";

// Get a substring from index 3 to 8
String substring = name.substring(3, 8);
// Return all substring form index 3 to index 8
System.out.println("Substring from index 3 to 8: " + substring);
// Output: Substring from index 3 to 8: Rijoa
```

#### name.replace();
```java
String name = "Md Rijoan Maruf";
System.out.println(name.replace('R' , 'r'));
// Return a new String after replacing 'R' to 'r'.
// Output : Md rijoan Maruf
```

#### name.lenght();
```java
String name = "Md Rijoan Maruf";
System.out.println(name.startsWith("Md"));
// Returns ture if name starts with "Md" if not it will return false.
// Output : true
```


#### name.endsWith();
```java
String name = "Md Rijoan Maruf";
System.out.println(name.endsWith("Md"));
// Returns true if name ends with "Md" if nto it will return false.
// Output : false

```

#### name.charAt();
```java
String name = "Md Rijoan Maruf";
System.out.println(name.charAt(1));
// Returns a charecter at the 1 index.
// Output : d
```

#### name.indexOf();
Returns a index of the given stirng.
```java
String name = "Md Rijoan Maruf";
// Find the index of 'R'
int indexR = name.indexOf('R');
System.out.println("Index of 'R': " + indexR);
// Output: Index of 'R': 3
```

#### name.indexof();
Return the index number of the given String.
```java
String text = "Md Rijoan Maruf";
// Find the index of 'n' starting from index 3
int indexN = text.indexOf('n', 3);
System.out.println("Index of 'n' starting from index 3: " + indexN);
// Output: Index of 'n' starting from index 3: 5
```

#### name.equals();
```java
String name = "Md Rijoan Maruf";
System.out.println(name.equals("Saif"));
// Returns true if the given String is equal to "Md Rijoan Maruf" otherwise it will return false.
// Output : false
```

#### name.equalsIgnoreCase();
```java
String name = "Md Rijoan Maruf";
System.out.println(name.equalsIgnoreCase("md rijoan maruf"));
// Return true if if the given string are equal "Md Rijan Maruf" . It will ignore case.
// Output : true
```


### Escape Sequence Characters :
Sequence of charecters afeter '\' = Escape secuence charecture.
Example :

    \n  -->  New line
    \t  -->  New tab
    \'  -->  '
    \"  -->  "


## Chapter 4 - Conditionals in Java
### if - else , else if :
```java
public class ElseIfExample {
    public static void main(String[] args) {
        int number = 0;

        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
    }
}
```
### switch case :
```java
public class SwitchCaseExample {
    public static void main(String[] args) {
        int dayOfWeek = 3;

        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
```
```java
public class ShortSwitchCaseExample {
    public static void main(String[] args) {
        int dayOfWeek = 3;

        switch (dayOfWeek) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day");
        }
    }
}
```

## Chapter 5 - Loop 
### While loop :
```java
public class WhileLoopExample {
    public static void main(String[] args) {
        int count = 0;

        while (count < 5) {
            System.out.println("Count: " + count);
            count++;
        }

        System.out.println("Loop complete!");
    }
}
```

### Do-While loop :
```java
public class DoWhileLoopExample {
    public static void main(String[] args) {
        int count = 0;

        do {
            System.out.println("Count: " + count);
            count++;
        } while (count < 5);

        System.out.println("Loop complete!");
    }
}
```

### For loop :
```java
public class ForLoopExample {
    public static void main(String[] args) {
        for (int count = 0; count < 5; count++) {
            System.out.println("Count: " + count);
        }

        System.out.println("Loop complete!");
    }
}
```

### Break Statement :
```java
public class BreakStatementExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteration: " + i);

            if (i == 5) {
                System.out.println("Breaking out of the loop at iteration 5.");
                break;
            }
        }

        System.out.println("Loop complete!");
    }
}
```
#### Output :
    Iteration: 0
    Iteration: 1
    Iteration: 2
    Iteration: 3
    Iteration: 4
    Iteration: 5
    Breaking out of the loop at iteration 5.
    Loop complete!

### Continue Statement :
```java
public class ContinueStatementExample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                System.out.println("Skipping iteration 2 using continue.");
                continue;
            }

            System.out.println("Iteration: " + i);
        }

        System.out.println("Loop complete!");
    }
}
```

#### Output :
    Iteration: 0
    Iteration: 1
    Skipping iteration 2 using continue.
    Iteration: 3
    Iteration: 4
    Loop complete!

## Chapter 6 - Arrays
Array is a collection of similar types of data.
```java
int[] marks = new int[s];
```  

### Accessing Array Element :
Array element can be accessed as followes :

```java
marks[0] = 100;
marks[1] = 77;
```

```java
int[] marks;        // Declareation
marks = new int[5]; // Memory Allocation
``` 

```java
int[] marks = new int[5];
// Declaration + Memory Allocation
```


```java
int[] marks = {100 , 96, 80 , 71};
// Declareation + Memory Allocation + Initilize
```
Array index start with 0 and goes till (n-1). Where n is the size of the array.

### Array Lenght :
```java
int l = marks.lenght;
```


### Loop in Array :
```java
for(int i = 0; i < marks.lenght; i++){
    System.out.println(marks[i]);
}
```


### For-each loop in java :
```java
for(int element : marks){
    System.out.println(element);    // will access all elelment in element variable
}
```


### Multidimensional 2D Arrays :
```java
int[][] flats = new int[2][3];
// 2 rows and 3 columns
```


### Access Multidimensional Arrays :
```java
flats[0][0] = 10;
flats[0][1] = 30;
flats[1][1] = 40;
```

## Chapter 7 - Methods in Java
```java
dataType name(){
    // Method body
}
```

### Method example :
Following method returns Sum of two numbers
```java
int mysum(int a, int b){
    int c = a + b;
    return c;
}
```
### Void return type :
When we dont want our mehtod to return anything, we use void as return type.

### Static Keyword :
Static keyword is used to associate a method of a given class with the class rather than the object. Static method in a class is shared by all objects.

**Note :** In case of Arrays, The reference is passed. Some is the case for Object passing to methods.

### Method Overloading :
Two or more method can have same name but diffrent parameters. Such methods are called Overloaded methods.

```java
static void sum(int a , int b){
    return a + b;
}
```
```java
static void sum(int a , int b , int c){
    return a + b + c;
}
```
**Note :** Method overlooding cannot be perfomed by changing the return type of methods.

### Variable Arguments (Varargs) :
A function with vararg can be created in java using following systex:

```java
static int num(int ...arr){
    // Aailable as int [] arr;
    int result = 0;
    for(int a: arr){
        result += a;
    }
    return result;
}

// Method calling :
sum(4,5);       // 9
sum(4,5,1);     // 10
sum(4,5,6,5);   // 20
sum();          // 0
```

### Recursion :
A function/Method in java can call itself. Such calling of function by itself is called member
#### Example : Factorial of a number :
```java
public class FactorialExample {

    // Recursive method to calculate factorial
    static int factorial(int n) {
        // Base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        } else {
            // Recursive case: n! = n * (n-1)!
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        // Example: Calculate factorial of 5
        int number = 5;
        int result = factorial(number);

        System.out.println("Factorial of " + number + " is: " + result);
    }
}
```


## Chapter 8 - Introduction to OOPs
Object Oriented Programming tries to map code instructions with real world makeing the code short and easier to understand.
### What is Object Oriented Programming :
Solving a problem by creating object is one of the most popular approaches in Programming. This is called Object Oriented Programming.

### What is DRY?
DRY stand for - Do not Repeat Yourself

### Class :
A class is a blueprint for creating objects.

### Object :
An Object is an intantintion of a class. when a class is defined, a template(infu) is defined. Memory is allocated only after object instantiation.

### How to model a problem in OOPs :
**We identify the following :**

    Noun     --> Class      --> Employee
    Ajective --> Attribute  --> Name , Age , Salary etc.
    Verb     --> Methods    --> getSalary() , increment() etc.

### OOPs Terminology :
#### 1. Abstraction :
Hiding internal details [show only essential infu!]

    Example : Phone
    use this phone without bothering about how it was made.

#### 2. Encapsulation :
The aact of putting various components together (in a capsule).

    Example :
    Laptop is a single entity with wifi + speaker + storage etc in a single box!
In java , encapsulation simply means that the sensitive data can be hidden from the users.

#### 3. Inheritance :
The act of deriving new things from existing things.

    Example :
    Rickshaw    ==>     E-Rickshaw
    Phone       ==>     Smart Phone

#### 4. Polymorphism :
One entity many forms

    Example :
    Smartphone have many entity like : Phone , Calculator , Music Player , Camara etc.


```java
public class Person {   // Person is the name of our class

    // Fields or attributes
    String name;    // Attribute name
    int age;        // Attribute age
```

Array in real world object = Properties + Behaier
Object in OOPs             = Attribute  + Methods

### A class with Methods :
We can add methods to our class Employee as follows :
```java
public class Employee {

    // Fields or attributes
    private String name;
    private double salary;

    // Method to get the salary of the employee
    public double getSalary() {
        return salary;
    }

    // Method to get details of the employee
    public String getDetails() {
        return "Name: " + name + "\nSalary: $" + salary;
    }
}

```

## Chapter 9 - Access Modifires & Constructors :
### Access Modifire :
Specify where a proprety/method is accessible . 
There are four types of access modifiers in java :
* Private
* Defalut
* Protected
* Public

### Getters and Setters :
    Gretter --> Returns the value 
    Setter  --> Sets/Updates the value

#### Example :

```java
public class Person {
    // Private fields
    private String name;
    private int age;

    // Getter method for 'name'
    public String getName() {
        return name;
    }

    // Setter method for 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for 'age'
    public int getAge() {
        return age;
    }

    // Setter method for 'age'
    public void setAge(int age) {
        // You can add validation logic here if needed
        this.age = age;
    }

    // Other methods, constructors, etc., can be added as needed
}
```


### Constructors in java :
A member function used to initialize an object while creating it. It have no return type and the constructor function name must have the class name.
```java
public class Person {
    // Private fields
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) { // This is perameterize constructor
        // Set initial values during object creation
        this.name = name;
        this.age = age;
    }

    // Getter method for 'name'
    public String getName() {
        return name;
    }

    // Setter method for 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for 'age'
    public int getAge() {
        return age;
    }

    // Setter method for 'age'
    public void setAge(int age) {
        // You can add validation logic here if needed
        this.age = age;
    }

    // Other methods can be added as needed
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of the Person class using the constructor
        Person person1 = new Person("Reyad", 30);

        // Display information using getter methods
        System.out.println("Person 1 - Name: " + person1.getName() + ", Age: " + person1.getAge());

        // Create another instance of the Person class using the constructor
        Person person2 = new Person("Rijoan", 22);

        // Display information using getter methods
        System.out.println("Person 2 - Name: " + person2.getName() + ", Age: " + person2.getAge());
    }
}
```
#### Output :
    Person 1 - Name: Reyad, Age: 30
    Person 2 - Name: Rijoan, Age: 22



### Constructor Overloading :
As like method overloading.
```java
public class Person {
    // Private fields
    private String name;
    private int age;

    // Default constructor with no parameters
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Constructor with only name parameter
    public Person(String name) {
        this.name = name;
        this.age = 0; // Default age
    }

    // Constructor with both name and age parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods and other methods can be added as needed
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances using different constructors
        Person person1 = new Person();
        Person person2 = new Person("Reyad");
        Person person3 = new Person("Rijoan", 25);

        // Display information using getter methods
        System.out.println("Person 1 - Name: " + person1.getName() + ", Age: " + person1.getAge());
        System.out.println("Person 2 - Name: " + person2.getName() + ", Age: " + person2.getAge());
        System.out.println("Person 3 - Name: " + person3.getName() + ", Age: " + person3.getAge());
    }
}
```
#### Output :
    Person 1 - Name: Unknown, Age: 0
    Person 2 - Name: Reyad, Age: 0
    Person 3 - Name: Rijoan, Age: 25


## Chapter 1 - Inheritance
Inheritance is used to borrow prperties & methods from an existing class.

    Phone --> Smartphone 
    Super Class --> SubClass

### Declaring Inheritance in Java :

```java

```


