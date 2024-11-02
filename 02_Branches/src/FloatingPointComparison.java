import java.util.Scanner;
import java.lang.Math;

public class FloatingPointComparison {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double bodyTemp;

        System.out.print("Enter body temperature in Fahrenheit: ");
        bodyTemp = scnr.nextDouble();

        // To compare floating point values, get the absolute value of the difference and check if it is less than 0.0001
        if (Math.abs(bodyTemp - 98.6) < 0.0001) {
            System.out.println("Temperature is exactly normal.");
        }
        else if (bodyTemp > 98.6) {
            System.out.println("Temperature is above normal.");
        }
        else {
            System.out.println("Temperature is below normal.");
        }

    }
}
