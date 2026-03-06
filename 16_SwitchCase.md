## Switch Case
> The switch statement in Java is a multi-way decision statement that executes code based on the value of an expression. It is a cleaner alternative to an if-else-if ladder. Case values must be constants or literals and of the same type as the switch expression. Duplicate case values are not allowed.

> The break statement is used to exit from the switch block. It is optional but recommended to prevent fall-through. The default case is optional and executes if no case matches the switch expression. It can appear anywhere within the switch block.

### Example Switch Case
```java
import java.lang.*;

class SwitchCase {
    public static void main (String[] Args){
        int day = 5;

        switch(day){
            case 1:
                System.out.println("1: Monday");
                break;
            case 2:
                System.out.println("2: Tuesday");
                break;
            case 3:
                System.out.println("3: Wednesday");
                break;
            case 4:
                System.out.println("4: Thursday");
                break;
            case 5:
                System.out.println("5: Friday");
                break;
            case 6:
                System.out.println("6: Saturday");
                break;
            case 7:
                System.out.println("7: Sunday");
                break;
            default :
                System.out.println("Invalid");
        }
    }
}
// Output
/*
5: Friday
*/
```