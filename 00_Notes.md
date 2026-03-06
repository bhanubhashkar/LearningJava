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
| Data Type |	Description |
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

There are foue non-primitive data types in Java:
| Data Type |	Description |
|---|---|
| 1. String   | Represents a sequence of characters enclosed in double quotes. String cannot be modified after creation. |
| 2. Array    | Stores multiple elements of the same type in single structure. Array are objects, dynamically allocated, indexed from 0.|
| 3. Class    | User-defined blueprint that defines variables and methods. Represents a type of object and forms the foundation of OOP. |
| 4. Object   | Instance of a class representing real-world entities, has state (data), behavior (methods), and identity (unique reference). |

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

        var myVar = 5; 
        System.out.println("The value of var variable is : " + myVar );
        System.out.println("A variable declared with var compiler automatically detect and assign data type." );

        final int myFinal = 15;
        System.out.println("The value of String variable is : " + myFinal );
        System.out.println("A variable declared with final becomes a constant." );

    }
}

// Output 
/*
Hello, From Java!
The value of Byte variable is : 120
The limit of Byte variable is from -128 t0 127.
The value of short variable is : 5000
The limit of short variable is from -32,768 to 32,767.
The value of int variable is : 65000
The limit of int variable is from -2,147,483,648 to 2,147,483,647
The value of long variable is : 9999999999
The limit of long variable is from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807. Mention L at the end of value.
The value of float variable is : 3.141592
The limit of float variable is Sufficient for storing 6 to 7 decimal digits. Mention F at the end of the value.
The value of double variable is : 3.14159265358979
The limit of double variable is Sufficient for storing 15 to 16 decimal digits. Mention D at the end of the value.
The value of boolean variable is : false
The limit of boolean variable is true or false.
The value of char variable is : @
The limit of char variable is a charachter like '@' or 'A'.
The value of String variable is : Hello Java !
The limit of String variable is a line.
The value of var variable is : 5
A variable declared with var compiler automatically detect and assign data type.
The value of String variable is : 15
A variable declared with final becomes a constant.
*/
```

## Data Types in Java
Type casting means converting one data type into another. For example, turning an int into a double.

In Java, there are two main types of casting:

1. Widening Type Casting (Implicit Casting)
Widening casting is done automatically when passing a smaller size type into a larger size type.

This works because there is no risk of losing information. For example, an int value can safely fit inside a double:
Widening Casting (automatic) - converting a smaller type to a larger type size
> byte -> short -> int -> long -> float -> double


2. Narrowing Type Casting (Explicit Casting)
Narrowing casting must be done manually by placing the type in parentheses () in front of the value.

This is required because narrowing may result in data loss (for example, dropping decimals when converting a double to an int):
Data loss every time the converting data size is greater than the size of new datatype.
For floating number only decimal points gets eliminated, but in case of whole number garbage data can be the result while converting to smaller size.
Narrowing Casting (manual) - converting a larger type to a smaller type size
> double -> float -> long -> int -> char -> short -> byte

* If result of any operation is greater than current datatype it is promoted to increased datatype. Ex multiplication result of two byte size data 10 and 25 is 250 which is greater than range of byte is auto promoted to int type.

Mainly there are two types of Explicit Casting:
Explicit Upcasting
Explicit Downcasting 


### Example Code - Type Casting Implicit
```java
import java.lang.*;

public class TypeCastingImplicit {
    public static void main (String[] args) {

        byte myByte = 11;
        byte newByte;
        short myShort = 2345;
        short newShort;
        int myInt = 12345678;
        int newInt;
        long myLong = 123456L;
        long newLong;
        float myFloat = 1.98765F;
        float newFloat;
        double myDouble = 9.9876543210D;
        double newDouble;

        // byte to short : 
        System.out.println("The value of myByte variable is : " + myByte );
        newShort = myByte;
        System.out.println("Typecasted from myByte to newShort is : " + newShort );
        
        // short to int : 
        System.out.println("The value of myShort variable is : " + myShort );
        newInt = myShort;
        System.out.println("Typecasted from myShort to newInt is : " + newInt );

        // int to long :
        System.out.println("The value of myInt variable is : " + myInt );
        newLong = myInt;
        System.out.println("Typecasted from myInt to newLong is : " + newLong );

        // long to float : 
        System.out.println("The value of myLong variable is : " + myLong );
        newFloat = myLong;
        System.out.println("Typecasted from myLong to newFloat is : " + newFloat );

        // float to double : 
        System.out.println("The value of myFloat variable is : " + myFloat );
        newDouble = myFloat;
        System.out.println("Typecasted from myFloat to newDouble is : " + newDouble );
    }
}
// Output 
/*
The value of myByte variable is : 11
Typecasted from myByte to newShort is : 11
The value of myShort variable is : 2345
Typecasted from myShort to newInt is : 2345
The value of myInt variable is : 12345678
Typecasted from myInt to newLong is : 12345678
The value of myLong variable is : 123456
Typecasted from myLong to newFloat is : 123456.0
The value of myFloat variable is : 1.98765
Typecasted from myFloat to newDouble is : 1.9876500368118286
*/
```

### Example Code - Type Casting Explicit
```java
import java.lang.*;

public class TypeCastingExplicit {
    public static void main (String[] args) {

        double myDouble = 3.141592653589793D;
        float myFloat = 123456.12345678F;
        float newFloat;
        long myLong = 2147483647L;
        long newLong;
        int myInt = 32767;
        int newInt;
        short myShort = 127;
        short newShort;
        byte myByte = 123;
        byte newByte;


        // double to float : Eliminated all decimal point after 6-7 decimal place
        System.out.println("The value of myDouble variable is : " + myDouble );
        newFloat = (float)myDouble;
        System.out.println("Typecasted from myDouble to newFloat is : " + newFloat );
        
        // float to long : Eliminates all decimal points 
        System.out.println("The value of myFloat variable is : " + myFloat );
        newLong = (long)myFloat;
        System.out.println("Typecasted from myFloat to newLong is : " + newLong );

        // long to int : Stores garbage if long value is greater than the int limit i.e 2147483647
        System.out.println("The value of myLong variable is : " + myLong );
        newInt = (int)myLong;
        System.out.println("Typecasted from myLong to newInt is : " + newInt );

        // int to short : Stores garbage if int value is greater than the short limit i.e 32767
        System.out.println("The value of myInt variable is : " + myInt );
        newShort = (short)myInt;
        System.out.println("Typecasted from myInt to newShort is : " + newShort );

        // short to byte : Stores garbage if int value is greater than the byte limit i.e 127
        System.out.println("The value of myShort variable is : " + myShort );
        newByte = (byte)myShort;
        System.out.println("Typecasted from myShort to newVyte is : " + newByte );

    }
}
// Output 
/*
The value of myDouble variable is : 3.141592653589793
Typecasted from myDouble to newFloat is : 3.1415927
The value of myFloat variable is : 123456.125
Typecasted from myFloat to newLong is : 123456
The value of myLong variable is : 2147483647
Typecasted from myLong to newInt is : 2147483647
The value of myInt variable is : 32767
Typecasted from myInt to newShort is : 32767
The value of myShort variable is : 127
Typecasted from myShort to newVyte is : 127
*/
```

### Example Code - Type Casting String and Boolean
```java
import java.lang.*;

public class TypeCastingString {
    public static void main (String[] args) {

        // String to int
        String myStr = "123";
        int myNum = Integer.parseInt(myStr);
        System.out.println(myNum);

        // int to String
        int newNum = 987654321;
        String newStr = String.valueOf(newNum); 
        System.out.println(newStr);

        int otherNum = 12345;
        String str = "" + otherNum;
        System.out.println(str); 

        // double to String
        double myDouble = 858.4898765;
        String otherStr = Double.toString(myDouble);
        System.out.println(otherStr);

        // String to boolean : It returns true only if the string argument is not null and is equal to the string "true" ignoring case otherwise, it returns false.
        // Boolean.parseBoolean(String s): This static method returns a primitive boolean value.
        String strTrue = "TrUe";
        boolean boolTrue = Boolean.parseBoolean(strTrue); 
        System.out.println(boolTrue); 

        String strFalse = "yes";
        boolean boolFalse = Boolean.parseBoolean(strFalse);
        System.out.println(boolFalse); 

        // Boolean.valueOf(String s): This static method returns a Boolean object representing the value.
        String strTrue2 = "tRuE";
        Boolean boolTrue2 = Boolean.valueOf(strTrue2);
        System.out.println(boolTrue2); 

        String strFalse2 = "anything";
        Boolean boolFalse2 = Boolean.valueOf(strFalse2);
        System.out.println(boolFalse2); 
        
    }
}
// Output 
/*
123
987654321
12345
858.4898765
true
false
true
false
*/
```

## Literals
> In Java, a literal is a fixed, constant value that is written directly into the source code. These values do not change during the execution of a program and are used to initialize variables or define constant expressions.
For example, in the statement int age = 25;, the value 25 is an integer literal. 


## Operators
> In Java, operators are special symbols used to perform operations on variables and values. They are the fundamental tools for implementing logic, computation, and control flow in a program. 

* Java operators are categorized by their function: 
1. Arithmetic   : Perform basic math (+, -, *, /, %).
2. Relational   : Compare values, returning a boolean (==, !=, >, <, >=, <=).
3. Logical      : Combine boolean expressions (&&, ||, !).
4. Assignment   : Assign values (=, +=, -=, etc.).
5. Unary        : Act on single operands, including increment/decrement (++, --) and negation (-, !).
6. Bitwise & Shift : Operate on individual bits (&, |, ^, ~, <<, >>, >>>).
7. Ternary      : A compact if-else shortcut (? :).
8. instanceof   : Tests object type.

## Arithmetic Operators
> Arithmetic operators are used to perform common mathematical operations.

| Operator | Description | Example | 
|---|---|---|
| +	Addition | Adds together two values	| x + y	|
| -	Subtraction	| Subtracts one value from another | x - y |
| *	Multiplication | Multiplies two values | x * y |
| /	Division | Divides one value by another | x / y |	
| %	Modulus | Returns the division remainder | x % y |
| ++ Increment | Increases the value of a variable by 1 | ++x |
| -- Decrement | Decreases the value of a variable by 1 | --x |

> Pre-Increment : The value of the variable is incremented first, and then the new, updated value is passed.

> Post-Increment : The original value of the variable is used, and then the variable is incremented.

| Parameter | Pre-Increment (++x) | Post-Increment (x++) |
|---|---|---|
| Operation Order | Increments the value before using it in the expression. | Uses the current value in the expression, then increments it after. |
| Value Returned | Returns the updated value. | Returns the original value. |
| Performance | May be negligibly faster with primitive types as no temporary copy is needed. | Requires creating a temporary copy of the original value, which is a minor overhead. |


### Example Arithmetic Operators
```java
import java.lang.*;

public class OperatorsArithmetic{
    public static void main (String[] Args){
        int myNum = 25;
        int newNum = 4;
        int result;

        result = myNum + newNum;
        System.out.println("Addition : " + myNum + " + " + newNum + " = " + result); 

        result = myNum - newNum;
        System.out.println("Substraction : " + myNum + " - " + newNum + " = " + result); 

        result = myNum * newNum;
        System.out.println("Multiplication : " + myNum + " * " + newNum + " = " + result); 

        result = myNum / newNum;
        System.out.println("Quotient : " + myNum + " / " + newNum + " = " + result); 

        result = myNum % newNum;
        System.out.println("Remainder : " + myNum + " % " + newNum + " = " + result); 

        myNum++;
        System.out.println("Increment myNum++ : " + myNum ); 

        newNum--;
        System.out.println("Decrement newNum-- : " + newNum ); 

        int x = 5;
        int y = ++x; 
        // x becomes 6, then y is assigned the new value of x (6).
        // Result: x = 6, y = 6

        int x = 5;
        int y = x++; 
        // The original value of x (5) is assigned to y.
        // Then x is incremented to 6.
        // Result: x = 6, y = 5

    }
}
// Output
/*
Addition : 25 + 4 = 29
Substraction : 25 - 4 = 21
Multiplication : 25 * 4 = 100
Quotient : 25 / 4 = 6
Remainder : 25 % 4 = 1
Increment myNum++ : 26
Decrement newNum-- : 3
*/
```

## Assignment Operators
> Assignment operators are used to assign values to variables.

| Operator | Example | Same As |
|---|---|---|
| =	| x = 5	| x = 5 |
| += | x += 3 | x = x + 3 |
| -= | x -= 3 | x = x - 3 |
| *= | x *= 3 | x = x * 3 |
| /= | x /= 3 | x = x / 3 |
| %= | x %= 3 | x = x % 3 |
| &= | x &= 3 | x = x & 3 |
| \|= | x \|= 3 | x = x \| 3 |
| ^= | x ^= 3 |	x = x ^ 3 |	
| >>= |	x >>= 3 | x = x >> 3 |	
| <<= |	x <<= 3 | x = x << 3 |

### Example Assignment Operators
```java
import java.lang.*;

public class OperatorsAssignment {
    public static void main(String[] Args){

        int a = 10;
        int b = 20;
        int c = 0;

        c = a + b;
        System.out.println("c = a + b = " + c );
        c += a ;
        System.out.println("c += a  = " + c );
        c -= a ;
        System.out.println("c -= a = " + c );
        c *= a ;
        System.out.println("c *= a = " + c );
    }
}
// Output
/*
c = a + b = 30
c += a  = 40
c -= a = 30
c *= a = 300
*/
```

## Relational Operators
> Relational/Comparison operators are used to compare two values (or variables) and returns a boolean value either true or false.

| Operator | Name | Example	|
|---|---|---|
| == | Equal to	| x == y |
| != | Not equal | x != y |
| >	| Greater than | x > y |	
| <	| Less than	| x < y	|
| >= | Greater than or equal to	| x >= y |
| <= | Less than or equal to | x <= y |

### Example Relational Operators
```java
import java.lang.*;

public class OperatorsRelaional {
    public static void main(String[] Args){

        int a = 10;
        int b = 3;
        int c = 5;

        System.out.println("Value of A : " + a );
        System.out.println("Value of B : " + b );
        System.out.println("Value of C : " + c );

        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == c: " + (a == c));
        System.out.println("a != c: " + (a != c));

    }
}

// Output
/*
Value of A : 10
Value of B : 3
Value of C : 5
a > b: true
a < b: false
a >= b: true
a <= b: false
a == c: false
a != c: true
*/
```