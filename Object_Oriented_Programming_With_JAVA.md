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

    