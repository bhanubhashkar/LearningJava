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