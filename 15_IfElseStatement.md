## If Else Statement
> The if-else statement in Java is a decision-making tool used to control the program's flow based on conditions. It executes one block of code if a condition is true and another block if the condition is false. This means if else statements work hand-in-hand with boolean values.

1. If Statement
The if statement specifies a block of code to be executed if a condition is true. Every if statement needs a condition that results in true or false.
Ex : Bring unbrella if its raining.

2. If Else
The if else statement lets us run a block of code when the condition in the if statement is false.
Ex : Bring umbrella if its raining, dont bring bring umbrella.

3. If Else If
The if else is statements lets run a block of code based on condition if the first condition is false.
Ex : Bring umbrella if its raining, bring umbrella if its sunny, dont bring bring umbrella.

4. Nested If Else
We can also place an if statement inside another if. This is called a nested if statement. A nested if lets you check for a condition only if another condition is already true.
Ex : First check If student taken science, then check subject If student taken Math eligible for Engineering, if student taken math eligible for medical, else other field.


### Example If Else
```java
import java.lang.*;

public class IfElseStatement{
    public static void main (String[] Args){

        boolean isRaining = true;
        boolean isSunny = false;
        if (isRaining) {
            System.out.println("Raining : Bring an umbrella!");
        }

        if (isSunny) {
            System.out.println("Sunny : Bring an umbrella!");
        } else {
            System.out.println("No need for an umbrella!");
        }

        if (isRaining) {
            System.out.println("Raining : Bring an umbrella!");
        } else if (isSunny) {
            System.out.println("Sunny : Bring an umbrella!");
        } else {
            System.out.println("No need for an umbrella!");
        }

        String stream = "Science";
        String subject = "Biology";
        if (stream == "Science") {
            if (subject == "Math") {
                System.out.println("Math : Student can go for Engineering");
            } else if (subject == "Biology") {
                System.out.println("Biology : Student can go for Medical");
            } else {
                System.out.println("Other : Student can for other Field");
            }
        } else {
            System.out.println("Student is from non science background.");
        }
    }
}

// Output
/*
No need for an umbrella!
Raining : Bring an umbrella!
Biology : Student can go for Medical
*/
```