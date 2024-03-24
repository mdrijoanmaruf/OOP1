# Lab Task 1
## Question Part-A:
**Write a class Student that has the following attributes:**
* **int id**
* **String name**
* **double cgpa**

**There is a set method and a get method for each of the attributes. There is also a main method in this class. Inside the main method create one object of the Student class and demonstrate all the methods**

## Part-A Answer :
```java
package Task1;
import java.lang.String;
public class Student {
    private int id;
    private String name;
    private double cgpa;

    // Setter Methods
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCgpa(double cgpa){
        this.cgpa = cgpa;
    }

    // Getter Methdos
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getCgpa() {
        return cgpa;
    }

    // Show Details Mehtod
    public void showDitels(){
        System.out.println("Name : " + getName());
        System.out.println("ID : " + getId());
        System.out.println("CGPA : " + getCgpa());
    }

    // Main Method
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Md Rijoan Maruf");
        student1.setId(12345);
        student1.setCgpa(3.75);

        student1.showDitels();
    }
}
```
### Output :

    Name : Md Rijoan Maruf
    ID : 12345
    CGPA : 3.75

## Question Part-B
**Develop a java Account class with these attribute and methods :**
**Attribute :**
* **int accoutNumber**
* **String accoutnHolderName**
* **double balance**

**Methods :**
* **void setAccountNumber(int an)**
* **void setAccountHolderName(String ahn)**
* **void setBalance(double b)**
* **int getAccountNumber( )**
* **String getAccountHolderName( )**
* **double getBalance( )**
* **void showDetails( )**

## Answer :
**File : Account.java**
```java
package Task1;

public class Account {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    // Setter methods
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getter method
    public int getAccountNUmber() {
        return accountNumber;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public double getBalance() {
        return balance;
    }

    // Show Details method
    public void showDetails(){
        System.out.println("Account Number : " + getAccountNUmber());
        System.out.println("Account Holder Name : " + getAccountHolderName());
        System.out.println("Balance : " + getBalance());
    }
}
```
**File : Main.java**
```java
package Task1;

public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account();
        myAccount.setAccountNumber(123232);
        myAccount.setAccountHolderName("Md Rijoan Maruf");
        myAccount.setBalance(999999);

        myAccount.showDetails();
    }
}
```
### Output :

    Account Number : 123232
    Account Holder Name : Md Rijoan Maruf
    Balance : 999999.0
