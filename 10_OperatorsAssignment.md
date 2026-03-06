## Assignment Operators
> Assignment operators are used to assign values to variables.

| Operator | Example | Same As |
|---|---|---|
| =	| x = 5	| x = 5 |
| += | x += 3 | x = x + 3 |
| -= | x -= 3 | x = x - 3 |
| *= | x *= 3 | x = x * 3 |
| /= | x /= 3 | x = x / 3 |
| %= | x %= 3 | x = x % 3 |
| &= | x &= 3 | x = x & 3 |
| \|= | x \|= 3 | x = x \| 3 |
| ^= | x ^= 3 |	x = x ^ 3 |	
| >>= |	x >>= 3 | x = x >> 3 |	
| <<= |	x <<= 3 | x = x << 3 |


### Example Assignment Operators
```java
import java.lang.*;

public class OperatorsAssignment {
    public static void main(String[] Args){

        int a = 10;
        int b = 20;
        int c = 0;

        c = a + b;
        System.out.println("c = a + b = " + c );
        c += a ;
        System.out.println("c += a  = " + c );
        c -= a ;
        System.out.println("c -= a = " + c );
        c *= a ;
        System.out.println("c *= a = " + c );
    }
}
// Output
/*
c = a + b = 30
c += a  = 40
c -= a = 30
c *= a = 300
*/
```