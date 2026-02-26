# Java Notes

[Checkout my Profile](https://github.com/bhanubhashkar)
> Java is a popular, object-oriented programming language and computing platform known for its "Write Once, Run Anywhere" (WORA) capability, allowing code to run on any device with a Java Virtual Machine (JVM).

> Created by Sun Microsystems in 1995, it's used for building web, mobile (Android), enterprise applications, big data systems, and games, leveraging powerful libraries and a robust ecosystem for reliability and portability across billions of devices.


## Setup
> Download JDK from [Oracle](https://www.oracle.com/in/java/technologies/downloads/).

> Download IntelliJ from [JetBrains](https://www.jetbrains.com/idea/download/).


## JDK JVM JRE
JDK (Java Development Kit)
> The Toolbox: It is the full software kit used to develop Java applications, basically to compile the java program.

> What's inside: It contains the JRE (so you can run your code) plus development tools like the compiler (javac), a debugger (jdb), and documentation generators.

> Who it's for: Developers who are writing and building Java software

JRE (Java Runtime Environment)
> The Environment: It is the package you need if you only want to run Java applications, contains java library.

> What's inside: It contains the JVM plus the standard libraries (like math or networking tools) and other files required to execute a program.

> Who it's for: Typically for end-users who just want to use a Java-based app or game.

JVM (Java Virtual Machine)
> The Engine: It is the core component that actually runs the Java code.

> How it works: It takes the platform-independent "bytecode" (created when you compile your code) and translates it into machine code that your specific computer's hardware understands.

> Key Fact: This is why Java is "Write Once, Run Anywhere"—the bytecode is always the same, but each operating system has its own JVM to translate it.

To run a java program, a .java file is required, which the Javac complier (part of JDK) will compile and create a .class file using "javac filename.java" command.
In terminal, we can run that java code using "java fileName.class" command which will call the JRE and JVM wil execute the code.


## Java Skeleton
import java.lang.*;                             --  Import all classes from java.lang package which contains essential classes that form the foundation of Java programming. 
public class First {                            --  Defines a top-level, publicly accessible class, should be same as file name.
    public static void main(String[] args) {    --  This method is the mandatory entry point for any Java application, acting as the starting point for the JVM.
        System.out.println("Hello World .!");   --  It will output the Hello World .! text to the console, followed by a new line.
    }                                           --  Closing og main method.
}                                               --  Closing of top-level class.


## Run Java Code
Step 1 - Compile    :   Use "javac fileName.java" command to compile the java code, It will create byte code file on successful compilation with ".class" extension.
Step 2 - Execution  :   Use "java fileName" command to run compiled "fileName.class" file.


## Java Code Working
> Java Code (.java) -> Javac (Java Compiler) -> Byte Code (.class) -> JRE : Java Runtime Env -> JVM : Java Virtual Machine -> Operating System -> Hardware

> JVM will execute the one main file consisting main() method [public static void main(String[] args)].


## Hello World
```java
// Your Java code goes here
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```


## Comment
```java
// Single line comment

/*
Multi line comment
*/
```


## Variables Java
> Variables are containers for storing data values.

> In Java, there are different types of variables, for example:
* String - stores text, such as "Hello". String values are surrounded by double quotes
* int - stores integers (whole numbers), without decimals, such as 123 or -123
* float - stores floating point numbers, with decimals, such as 19.99 or -19.99
* char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
* boolean - stores values with two states: true or false

> The var keyword lets the compiler automatically detect the type of a variable based on the value we assign to it.

> A variable declared with final becomes a constant, which means unchangeable and read-only.


## Data Types in Java
Data types are divided into two groups:

1. Primitive data types : includes byte, short, int, long, float, double, boolean and char
2. Non-primitive (Reference) data types : such as String, Arrays and Classes
* The var keyword lets the compiler automatically detect the type of a variable based on the value you assign to it.

> Primitive data types store simple values directly in memory. Java provides eight primitive data types, each with a fixed size and range. A primitive data type specifies the type of a variable and the kind of values it can hold.

There are eight primitive data types in Java:
| * Data Type |	Description |
|---|---|
| 1. byte       | Stores whole numbers from -128 to 127 |
| 2. short      | Stores whole numbers from -32,768 to 32,767 |
| 3. int	    | Stores whole numbers from -2,147,483,648 to 2,147,483,647 |
| 4. long	    | Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
| 5. float	    | Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits |
| 6. double	    | Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits |
| 7. boolean	| Stores true or false values |
| 8. char	    | Stores a single character/letter or ASCII values |

> A non-primitive data type Store memory references to objects. These types are created by the programmer (except for String) and store references (memory addresses) to objects on the heap memory, rather than the values themselves. They can also access methods and default to null if uninitialized.
* Data Type	Description
1. String   Represents a sequence of characters enclosed in double quotes. String cannot be modified after creation
2. Array    Stores multiple elements of the same type in a single structure. Array are objects, dynamically allocated, and indexed from 0.
3. Class    User-defined blueprint that defines variables and methods. Represents a type of object and forms the foundation of Object-Oriented Programming.
4. Object   An instance of a class representing real-world entities. It has state (data), behavior (methods), and identity (unique reference).

### Example Code
```java
import java.lang.*;

public class DataType{
    public static void main (String[] args) {
        System.out.println("Hello, From Java!");

        byte myByte = 120;
        System.out.println("The value of Byte variable is : " + myByte );
        System.out.println("The limit of Byte variable is from -128 t0 127." );

        short myShort = 5000;
        System.out.println("The value of short variable is : " + myShort );
        System.out.println("The limit of short variable is from -32,768 to 32,767." );

        int myInt = 65000;
        System.out.println("The value of int variable is : " + myInt );
        System.out.println("The limit of int variable is from -2,147,483,648 to 2,147,483,647" );

        long myLong = 9_999_999_999L;
        System.out.println("The value of long variable is : " + myLong );
        System.out.println("The limit of long variable is from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807. Mention L at the end of value." );

        float myFloat = 3.141592F;
        System.out.println("The value of float variable is : " + myFloat );
        System.out.println("The limit of float variable is Sufficient for storing 6 to 7 decimal digits. Mention F at the end of the value." );
        
        double myDouble = 3.14159265358979D;
        System.out.println("The value of double variable is : " + myDouble );
        System.out.println("The limit of double variable is Sufficient for storing 15 to 16 decimal digits. Mention D at the end of the value." );
        
        boolean myBool = false;
        System.out.println("The value of boolean variable is : " + myBool );
        System.out.println("The limit of boolean variable is true or false." );

        char myChar = '@';
        System.out.println("The value of char variable is : " + myChar );
        System.out.println("The limit of char variable is a charachter like '@' or 'A'." );

        String myString = "Hello Java !";
        System.out.println("The value of String variable is : " + myString );
        System.out.println("The limit of String variable is a line." );

        var myVar = 5;  // x is an int
        System.out.println("The value of var variable is : " + myVar );
        System.out.println("A variable declared with var compiler automatically detect and assign data type." );

        final int myFinal = 15;
        System.out.println("The value of String variable is : " + myFinal );
        System.out.println("A variable declared with final becomes a constant,." );

    }
}
```



