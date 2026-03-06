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
    }
}