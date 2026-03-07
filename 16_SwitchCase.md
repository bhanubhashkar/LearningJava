## Switch Case
> The switch statement in Java is a multi-way decision statement that executes code based on the value of an expression. It is a cleaner alternative to an if-else-if ladder. Case values must be constants or literals and of the same type as the switch expression. Duplicate case values are not allowed.

> The break statement is used to exit from the switch block. It is optional but recommended to prevent fall-through. The default case is optional and executes if no case matches the switch expression. It can appear anywhere within the switch block.

### Example Switch Case
```java
import java.lang.*;

class SwitchCase {
    public static void main (String[] Args){

        // Older Version of Switch Case
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

        // Updated Version of Switch Case
        String data = "Tuesday";
        switch(data){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday":
                System.out.println("Office Day");
            break;
            case "Saturday", "Sunday":
                System.out.println("Weekend");
            break;
            default:
                System.out.println("Invalid Day");
        }

        String newData = "Sunday";
        switch(newData){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("Weekday...!");
            case "Saturday", "Sunday" -> System.out.println("Weekend...!");
            default -> System.out.println("Unknown...!");
        }

        String otherData = "Thursday";
        String res = "";
        switch(otherData){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> res = "Weekday......!";
            case "Saturday", "Sunday" -> res = "Weekend......!";
            default -> res = "Unknown......!";
        }
        System.out.println(res);

        String newRes = "";
        newRes = switch(otherData){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday.........!";
            case "Saturday", "Sunday" -> "Weekend.........!";
            default -> "Unknown.........!";
        };
        System.out.println(newRes);

        newRes = switch(otherData){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" : yield "Weekday............!";
            case "Saturday", "Sunday" : yield "Weekend............!";
            default : yield "Unknown............!";
        };
        System.out.println(newRes);

    }
}
// Output
/*
5: Friday
Office Day
Weekend...!
Weekday......!
Weekday.........!
Weekday............!
*/
```


