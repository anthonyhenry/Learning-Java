// Need to import Random for access to the Random class
import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {

        // New random number generator
        Random randGen = new Random();  // Generates a random integer in the range (-2^32) - (2^31 - 1)
        //Random randGen = new Random(5); // You can set a random seed by providing an argument in Random()
        //randGen.setSeed(6); // You can also set a random seed like this

        System.out.println(randGen.nextInt());
        System.out.println(randGen.nextInt());
        System.out.println(randGen.nextInt());

        System.out.println(randGen.nextInt(10)); // Generates a random number 0-9

        System.out.println(randGen.nextInt(6) + 10); // Generates a random number 10-15

        // How to return a random number between numbers num1 and num2
        int num1;
        int num2;

        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num1 = scnr.nextInt();
        System.out.print("Enter a number larger than " + num1 + ": ");
        num2 = scnr.nextInt();

        int randomNum = randGen.nextInt(num2 - num1 + 1) + num1;
        System.out.println(randomNum);

        System.out.println(randGen.nextInt(12) + -4); // Random number -4 - 7
    }
}
