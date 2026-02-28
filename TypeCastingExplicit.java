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