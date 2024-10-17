// To get input you have to import a Scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int wage;

        wage = 35;

        // print() allows following lines to print to the same line as this print statement
        System.out.print("Salary is ");
        // println() moves the cursor, making following lines print below this line
        System.out.println(wage * 40 * 52);

        System.out.print("Enter your wage: ");
        // To get input you need to use a Scanner object
        Scanner scnr = new Scanner(System.in);
        wage = scnr.nextInt();
        System.out.print("Salary is ");
        System.out.println(wage * 40 * 52);

    }
}
