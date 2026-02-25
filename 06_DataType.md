Data types are divided into two groups:

Primitive data types - includes byte, short, int, long, float, double, boolean and char
Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in a later chapter)


A primitive data type specifies the type of a variable and the kind of values it can hold.

There are eight primitive data types in Java:

Data Type	Description
byte	Stores whole numbers from -128 to 127
short	Stores whole numbers from -32,768 to 32,767
int	    Stores whole numbers from -2,147,483,648 to 2,147,483,647
long	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double	Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
boolean	Stores true or false values
char	Stores a single character/letter or ASCII values


int myNum = 5;               // Integer (whole number)
float myFloatNum = 5.99f;    // Floating point number
char myLetter = 'D';         // Character
boolean myBool = true;       // Boolean
String myText = "Hello";     // String

byte myNum = 100;
System.out.println(myNum);
short myNum = 5000;
System.out.println(myNum)

int myNum = 10_00_00;
System.out.println(myNum);
long myNum = 15000000000L;
System.out.println(myNum);
float myNum = 5.75f;
System.out.println(myNum);
double myNum = 19.99d;
System.out.println(myNum);

boolean isJavaFun = true;
boolean isFishTasty = false;
System.out.println(isJavaFun);     // Outputs true
System.out.println(isFishTasty);   // Outputs false

char myGrade = 'B';
System.out.println(myGrade);

String greeting = "Hello World";
System.out.println(greeting);

The var keyword lets the compiler automatically detect the type of a variable based on the value you assign to it.

var x = 5;  // x is an int
System.out.println(x);