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

        // For Each Loop
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for(String car : cars ){
            System.out.println("Array element : " + car);
        }
    }
}
