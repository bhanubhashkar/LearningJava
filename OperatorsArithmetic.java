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