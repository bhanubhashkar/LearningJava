## Logical Operators
> Logical operators are used to determine the logic between variables or values, by combining multiple conditions.

| Operator | Name | Description | Example |
|---|---|---|---|
| && | Logical AND |Returns true if both statements are true | x < 5 &&  x < 10	|
| \|\| | Logical OR	| Returns true if one of the statements is true | x < 5 \|\| x < 4 |
| ! | Logical NOT |	Reverse the result, returns false if the result is true | !(x < 5 && x < 10) |	


### Example Logical Operators
```java
import java.lang.*;

public class OperatorsLogical {
    public static void main (String[] Args){
        boolean isLoggedIn = true;
        boolean isAdmin = false;

        System.out.println("Regular user: " + (isLoggedIn && !isAdmin));
        System.out.println("Has access: " + (isLoggedIn || isAdmin));
        System.out.println("Not logged in: " + (!isLoggedIn));
    }
}
// Output
/*
Regular user: true
Has access: true
Not logged in: false
*/
```