import java.util.Scanner;

public class FloatingPointDoubles {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // A double variable stores a floating-point number
        // Doubles are typically used for measurements, or when dealing with fractions of countable items, such as the average number of cars per household.
        double milesTravel; // User input of miles to travel
        double hoursFly;    // Travel hours if flying those miles
        double hoursDrive;  // Travel hours if driving those miles

        System.out.print("Enter distance in miles: ");
        // scnr.nextDouble() reads a floating-point value from input
        milesTravel = scnr.nextDouble();

        // Doubles should have a decimal, even if the number to the right of the decimal is 0
        hoursFly   = milesTravel / 500.0;
        hoursDrive = milesTravel / 60.0;

        System.out.println(milesTravel + " miles would take:");
        System.out.println("   " + hoursFly + " hours to fly,");
        System.out.println("   " + hoursDrive + " hours to drive.");

        // When dividing by 0 Java will return infinity or -infinity, depending on the signs of the operands
        System.out.println("100.0/0.0 = " + (100.0 / 0.0));
        System.out.println("100.0/0.0 = " + (-100.0 / 0.0));
        // 0.0/0.0 results in a "Not a Number"
        System.out.println("0.0/0.0 = " + (0.0 / 0.0));

        // Use System.out.printf("%.2f", myFloat); to output a double with %.#f digits after the decimal
        System.out.println("Default output of pi: " + Math.PI);
        System.out.print("pi reduced to 4 digits after the decimal: ");
        System.out.printf("%.4f\n", Math.PI); // The \n inserts a new line

    }
}
