import java.util.Scanner;

public class LengthConverter {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int totalInches;
        int numYards;
        int numFeet;
        int numInches;

        totalInches = scnr.nextInt();

        /* Your code goes here */
        numYards = totalInches / 36;
        totalInches = totalInches - (36 * numYards);
        numFeet = totalInches / 12;
        numInches = totalInches - (12 * numFeet);

        System.out.println("Yards: " + numYards);
        System.out.println("Feet: " + numFeet);
        System.out.println("Inches: " + numInches);
    }
}