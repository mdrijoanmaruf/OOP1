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
    * Value range from -128 to 127
    * Takes 1 byte
    * Default value is zero

#### short
    * Value range from -2<sup>16</sup>/2 to 2<sup>16</sup>/2
    * Takes 2 bytes
    * Default value is 0

#### int
    * Value range from -2<sup>32</sup>/2 to 2<sup>32</sup>/2
    * Takes 2 bytes
    * Default value is 0

#### float
    * Value range will vary
    * Takes 4 bytes
    * Default value is 0.0f

#### long
    * Value range from -2<sup>64</sup>/2 to 2<sup>64</sup>/2
    * Takes 8 bytes
    * Default value is 0

#### double
    * Value range will vary
    * Takes 8 bytes
    * Default value is 0.0d

#### char
    * Value range from 0 to 65535(2<sup>16</sup>-1)
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