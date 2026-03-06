import java.lang.*;

public class OperatorsUnary{
    public static void main (String[] Args){

        int xy1 = 12;
        int yy1 = -15;
		System.out.println("Before - unary operation on xy1 = " + xy1);
		xy1 = -xy1;
		System.out.println("After - unary operation on xy1 = " + xy1);
        System.out.println("Before - unary operation on yy1 = " + yy1);
		yy1 = -yy1;
		System.out.println("After - unary operation on yy1 = " + yy1);

        int myNum = 25;
        int newNum = 4;
        System.out.println("Value of myNum is: " + myNum ); 
        myNum++;
        System.out.println("Increment myNum++ : " + myNum ); 
        System.out.println("Value of newNum is: " + newNum ); 
        newNum--;
        System.out.println("Decrement newNum-- : " + newNum ); 

        // Pre Increment
        int x1 = 5;
        int y1 = ++x1; 
        // The original value of x1 is (5)
        // Then x1 becomes (6), and y is assigned with the new value of x1 (6).
        // Result: x1 = 6, y1 = 6
        System.out.println("Value of x1 : " + x1 + " Value of y1/x1 after pre Inc : " + y1 ); 

        // Post Increment
        int x2 = 5;
        int y2 = x2++; 
        // The original value of x2 is (5) and assigned to y2.
        // Then x2 is incremented to 6.
        // Result: x2 = 6, y2 = 5
        System.out.println("Value of x2 : " + x2 + " Value of y2/x2 after post Inc : " + y2 ); 

        boolean Var1 = true, Var2 = false;
        //Applying logical complement operator on Var1 changes true to false
        System.out.println("Value of Var1 before ! operation : " + Var1);
        Var1 = !Var1;
        System.out.println("Value of Var1 after ! operation : " + Var1);
        //Applying logical complement operator on Var2 changes false to true
        System.out.println("Value of Var2 before ! operation : " + Var2);
        Var2 = !Var2;
        System.out.println("Value of Var2 after ! operation : " + Var2);

        boolean isLoggedIn = true;
        System.out.println("Value of logged in is : " + isLoggedIn);
        isLoggedIn = !isLoggedIn;
        System.out.println("Value of logged in after : " + isLoggedIn);
    }
}