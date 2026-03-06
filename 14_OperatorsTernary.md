## Ternary Operators
> The ternary operator is a compact alternative to the if-else statement. It evaluates a condition and returns one of two values depending on whether the condition is true or false.

> variable = (condition) ? expressionTrue :  expressionFalse;

Example : String result = (time < 18) ? "Good day." : "Good evening.";
In above example the result variable will have 'Good Day' if value of time is < 18 else the value will be 'Good Evening'.

Example : String message = (time < 12) ? "Good Morning." : (time < 18) ? "Good Afternoon." : "Good Evening.";
In above nested ternary operator example the message variable will have 'Good Morning' if value of time is < 12, If the message variable will have 'Good Afternoon' if value is < 18, else it will have 'Good Evening'.

### Example Ternary Operators
```java
import java.lang.*;

public class OperatorsTernary{
    public static void main (String[] Args){
        int age = 20;
        String result = (age > 18) ? "Eligible for Driving" : "Not Eligible for Driving";
        System.out.println(result);

        // Nested Ternary Operator
        int marks = 55; 
        String division;
        division = (marks > 80) ? "Distinction" : (marks > 60) ? "First Division" : (marks > 40) ? "Second Division" : "Fail";
        System.out.println(division);
    }
}
// Output
/*
Eligible for Driving
Secnd Division
*/
```