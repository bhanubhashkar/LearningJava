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