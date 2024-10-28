import java.util.Scanner;

public class ConstantVariables {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Use the keyword final to indicate a constant variable
        // It is best practice to name final variables in all caps
        // If a final variable is changed, an error will occur
        final double SPEED_OF_SOUND   = 761.207; // Miles/hour (sea level)
        final double SECONDS_PER_HOUR = 3600.0;  // Secs/hour
        double secondsBetween;
        double timeInHours;
        double distInMiles;

        System.out.println("Enter seconds between");
        System.out.print("lightning strike and thunder: ");
        secondsBetween = scnr.nextDouble();

        timeInHours = secondsBetween / SECONDS_PER_HOUR;
        distInMiles = SPEED_OF_SOUND * timeInHours;

        System.out.println("Lightning strike was approximately");
        System.out.println(distInMiles + " miles away.");
    }
}