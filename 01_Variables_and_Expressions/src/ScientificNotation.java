import java.util.Scanner;

public class ScientificNotation {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // A floating-point literal using scientific notation is written using an e preceding the power-of-10 exponent
        // As in 6.02e23 to represent 6.02 x 1023. Likewise, 0.001 is 1 x 10-3 and can be written as 1.0e-3
        // For a floating-point literal, good practice is to make the leading digit non-zero.
        double avogadrosNumber = 6.02e23; // Approximation of atoms per mole
        double gramsPerMoleGold = 196.9665;
        double gramsGold;
        double atomsGold;

        System.out.print("Enter grams of gold: ");
        gramsGold = scnr.nextDouble();

        atomsGold = gramsGold / gramsPerMoleGold * avogadrosNumber;

        System.out.print(gramsGold + " grams of gold contains ");
        System.out.println(atomsGold + " atoms");

    }
}
