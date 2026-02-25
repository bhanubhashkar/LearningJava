## Java Development Kit
To install JDK access below URL and download JDK LTS version.
https://www.oracle.com/in/java/technologies/downloads/
Install downloaded file.
Additionally setup env path for Windows not required for Mac.

Verify if JDK is installed properly or not.
Run below command it should return installed version of JDK :
java --version      : Java version
javac --version     : Java compiler version



## JDK JVM JRE
JDK (Java Development Kit)
The Toolbox: It is the full software kit used to develop Java applications, basically to compile the java program.
What's inside: It contains the JRE (so you can run your code) plus development tools like the compiler (javac), a debugger (jdb), and documentation generators.
Who it's for: Developers who are writing and building Java software

JRE (Java Runtime Environment)
The Environment: It is the package you need if you only want to run Java applications, contains java library.
What's inside: It contains the JVM plus the standard libraries (like math or networking tools) and other files required to execute a program.
Who it's for: Typically for end-users who just want to use a Java-based app or game.

JVM (Java Virtual Machine)
The Engine: It is the core component that actually runs the Java code.
How it works: It takes the platform-independent "bytecode" (created when you compile your code) and translates it into machine code that your specific computer's hardware understands.
Key Fact: This is why Java is "Write Once, Run Anywhere"—the bytecode is always the same, but each operating system has its own JVM to translate it.

To run a java program, a .java file is required, which the Javac complier (part of JDK) will compile and create a .class file using "javac filename.java" command.
In terminal, we can run that java code using "java fileName.class" command which will call the JRE and JVM wil execute the code.
