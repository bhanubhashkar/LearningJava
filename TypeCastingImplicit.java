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
