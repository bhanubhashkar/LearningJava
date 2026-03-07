## Loops
> Loops in programming allow a set of instructions to run multiple times based on a condition. Loops can execute a block of code as long as a specified condition is true. In Java, there are three types of Loops.

1. while loop : A while loop is used when we want to check the condition before executing the loop body.
2. do whilw loop : The do-while loop ensures that the code block executes at least once before checking the condition.
3. for loop : The for loop is used when we know the number of iterations (we know how many times we want to repeat a task). The for statement includes the initialization, condition, and increment/decrement in one line. 
4. for each loop : The for-each" loop is used exclusively to loop through elements in an array (or other data structures).

## While Loop
Syntax
while (condition) {
  // code block to be executed
}

## Do While Loop
Syntax
do {
  // code block to be executed
}
while (condition);

## For Loop
Syntax 
for (statement 1; statement 2; statement 3) {
  // code block to be executed
}
Statement 1 is executed (one time) before the execution of the code block.
Statement 2 defines the condition for executing the code block.
Statement 3 is executed (every time) after the code block has been executed.

## For Each Loop
for (type variableName : arrayName) {
  // code block to be executed
}

### Example Loops
```java
import java.lang.*;

public class Loops{
    public static void main (String[] Args){

        // While Loop
        int num = 1;
        while(num <= 5){
            System.out.println("While : " + num );
            num++;
        }

        // Do While Loop
        int newNum = 1;
        do{
             System.out.println("Do While : " + newNum );
             newNum++;
        } while(newNum <= 5);

        int myNum = 1;
        int i;
        int j;
        for( i = 1; i <= 5; i++){
            System.out.println("For : " + myNum);
            myNum++;
        }

        // Nested For Loop
        for ( i = 1; i <= 3; i++) {
            System.out.println("Outer: " + i); // Executes 2 times
  
            // Inner loop
            for ( j = 1; j <= 2; j++) {
                System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        } 

        // For Each loop
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for(String car : cars ){
            System.out.println("Array element : " + car);
        }
    }
}
// Output
/*
While : 1
While : 2
While : 3
While : 4
While : 5
Do While : 1
Do While : 2
Do While : 3
Do While : 4
Do While : 5
For : 1
For : 2
For : 3
For : 4
For : 5
Outer: 1
 Inner: 1
 Inner: 2
Outer: 2
 Inner: 1
 Inner: 2
Outer: 3
 Inner: 1
 Inner: 2
Array element : Volvo
Array element : BMW
Array element : Ford
Array element : Mazda
*/
```