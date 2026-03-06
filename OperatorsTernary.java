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
