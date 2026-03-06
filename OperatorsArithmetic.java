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

        int x1 = 5;
        int y1 = ++x1; 
        // x becomes 6, then y is assigned the new value of x1 (6).
        // Result: x1 = 6, y1 = 6

        int x2 = 5;
        int y2 = x2++; 
        // The original value of x (5) is assigned to y2.
        // Then x2 is incremented to 6.
        // Result: x2 = 6, y2 = 5
    }
}