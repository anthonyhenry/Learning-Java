import java.util.Scanner;

public class _06_ConditionalExpressions {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String condStr;
        int userVal;

        System.out.print("Enter a number: ");

        userVal = scnr.nextInt();

        condStr = (userVal < 0) ? "negative" : "non-negative";

        System.out.println(userVal + " is " + condStr + ".");

        userVal = (userVal < 0) ? userVal - 1 : userVal + 1;
        System.out.println(userVal);
    }
}
