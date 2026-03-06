## Unary Operators
> Logical operators are used to determine the logic between variables or values, by combining multiple conditions.

| Symbol | Operator Name | Example | Description |
|---|---|---|---|
| -	| Unary Minus | -x | It is used to denote a negative value.|
| +	| Unary Plus | +x | It is used to denote a positive value. |
| -- | Decrement Operator | --x, x-- |	Decrements value by 1 |
| ++ | Increment Operator | ++x, x++ | Increments value by 1 |
| !	| Logical Complement Operator | !x | Reverse the value of boolean variable |

> Unary Minus : It converts a positive value into a negative value and vice versa.

> Pre-Increment : The value of the variable is incremented first, and then the new, updated value is passed.

> Post-Increment : The original value of the variable is used, and then the variable is incremented.

### Example Logical Operators
```java
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
// Output
/*
Before - unary operation on xy1 = 12
After - unary operation on xy1 = -12
Before - unary operation on yy1 = -15
After - unary operation on yy1 = 15
Value of myNum is: 25
Increment myNum++ : 26
Value of newNum is: 4
Decrement newNum-- : 3
Value of x1 : 6 Value of y1/x1 after pre Inc : 6
Value of x2 : 6 Value of y2/x2 after post Inc : 5
Value of Var1 before ! operation : true
Value of Var1 after ! operation : false
Value of Var2 before ! operation : false
Value of Var2 after ! operation : true
Value of logged in is : true
Value of logged in after : false
*/
```