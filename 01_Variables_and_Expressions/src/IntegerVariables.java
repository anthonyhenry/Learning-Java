import java.util.Scanner;

public class IntegerVariables {
    public static void main(String[] args) {
        // Java variables must start with a letter, underscore, or dollar sign
        // A good practice followed by many Java programmers is to not use _ or $ in variable names

        // This is how you declare an integer variable
        int userAge;


        System.out.print("Enter your age: ");
        Scanner scnr = new Scanner(System.in);
        userAge = scnr.nextInt();
        System.out.println(userAge + " is a great age.");
    }
}
