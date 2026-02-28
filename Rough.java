import java.lang.*;

public class Rough {
    public static void main (String[] args) {

        long longValue = 2147483647L; // A value within the int range
int intValue = (int) longValue;
//System.out.println(intValue); // Output: 2147483647

long largeLongValue = 214748364987L; // A value one greater than Integer.MAX_VALUE
System.out.println(largeLongValue);
int overflowValue = (int) largeLongValue;
System.out.println(overflowValue); // Output: -2147483648 (due to overflow/truncation)

    }
}