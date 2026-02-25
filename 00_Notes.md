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

## Basics

```java
// Single line comment

/*
Multi line comment
*/
```

```java
// Your Java code goes here
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

## Console Method
```java
/*

*/
```
