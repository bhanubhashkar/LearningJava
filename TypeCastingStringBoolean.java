import java.lang.*;

public class TypeCastingString {
    public static void main (String[] args) {

        // String to int
        String myStr = "123";
        int myNum = Integer.parseInt(myStr);
        System.out.println(myNum);

        // int to String
        int newNum = 987654321;
        String newStr = String.valueOf(newNum); 
        System.out.println(newStr);

        int otherNum = 12345;
        String str = "" + otherNum;
        System.out.println(str); 

        // double to String
        double myDouble = 858.4898765;
        String otherStr = Double.toString(myDouble);
        System.out.println(otherStr);

        // String to boolean : It returns true only if the string argument is not null and is equal to the string "true" ignoring case otherwise, it returns false.
        // Boolean.parseBoolean(String s): This static method returns a primitive boolean value.
        String strTrue = "TrUe";
        boolean boolTrue = Boolean.parseBoolean(strTrue); 
        System.out.println(boolTrue); 

        String strFalse = "yes";
        boolean boolFalse = Boolean.parseBoolean(strFalse);
        System.out.println(boolFalse); 

        // Boolean.valueOf(String s): This static method returns a Boolean object representing the value.
        String strTrue2 = "tRuE";
        Boolean boolTrue2 = Boolean.valueOf(strTrue2);
        System.out.println(boolTrue2); 

        String strFalse2 = "anything";
        Boolean boolFalse2 = Boolean.valueOf(strFalse2);
        System.out.println(boolFalse2); 
        
    }
}

