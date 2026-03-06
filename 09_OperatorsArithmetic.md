## Arithmetic Operators
> Arithmetic operators are used to perform common mathematical operations.

| Operator | Description | Example | 
|---|---|---|
| +	Addition | Adds together two values	| x + y	|
| -	Subtraction	| Subtracts one value from another | x - y |
| *	Multiplication | Multiplies two values | x * y |
| /	Division | Divides one value by another | x / y |	
| %	Modulus | Returns the division remainder | x % y |
| ++ Increment | Increases the value of a variable by 1 | ++x |
| -- Decrement | Decreases the value of a variable by 1 | --x |

> Pre-Increment : The value of the variable is incremented first, and then the new, updated value is passed.

> Post-Increment : The original value of the variable is used, and then the variable is incremented.

| Parameter | Pre-Increment (++x) | Post-Increment (x++) |
|---|---|---|
| Operation Order | Increments the value before using it in the expression. | Uses the current value in the expression, then increments it after. |
| Value Returned | Returns the updated value. | Returns the original value. |
| Performance | May be negligibly faster with primitive types as no temporary copy is needed. | Requires creating a temporary copy of the original value, which is a minor overhead. |


### Example Arithmetic Operators
```java
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
// Output
/*
Addition : 25 + 4 = 29
Substraction : 25 - 4 = 21
Multiplication : 25 * 4 = 100
Quotient : 25 / 4 = 6
Remainder : 25 % 4 = 1
Increment myNum++ : 26
Decrement newNum-- : 3
*/
```