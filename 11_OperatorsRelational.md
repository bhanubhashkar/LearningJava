## Relational Operators
> Relational/Comparison operators are used to compare two values (or variables) and returns a boolean value either true or false.

| Operator | Name | Example	|
|---|---|---|
| == | Equal to	| x == y |
| != | Not equal | x != y |
| >	| Greater than | x > y |	
| <	| Less than	| x < y	|
| >= | Greater than or equal to	| x >= y |
| <= | Less than or equal to | x <= y |

### Example Relational Operators
```java
import java.lang.*;

public class OperatorsRelaional {
    public static void main(String[] Args){

        int a = 10;
        int b = 3;
        int c = 5;

        System.out.println("Value of A : " + a );
        System.out.println("Value of B : " + b );
        System.out.println("Value of C : " + c );

        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == c: " + (a == c));
        System.out.println("a != c: " + (a != c));

    }
}

// Output
/*
Value of A : 10
Value of B : 3
Value of C : 5
a > b: true
a < b: false
a >= b: true
a <= b: false
a == c: false
a != c: true
*/
```