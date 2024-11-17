import java.util.Scanner;

public class Main {

    // This is how you create a user defined method in Java
    // User defined methods have a return type. Void is used if the method is not meant to return anything
    public static int computeSquare(int numToSquare) // Parameters need to have their type specified
    {
        return numToSquare * numToSquare;
    }

    // An array is passed to a method by passing a reference to the array. The array reference is copied to the method's parameter, so a method can modify the elements of an array argument.
    // While the contents of an array (or object) parameter can be changed in a method, the array reference passed to the method cannot
    public static void updateArrayVals(int[] arrayVals, int updateVal)
    {
        for (int i = 0; i < arrayVals.length; ++i)
        {
            arrayVals[i] = arrayVals[i] * updateVal;
        }
    }
    public static void printFinalVals(int[] finalVals)
    {
        for (int finalVal : finalVals) {
            System.out.println(finalVal);
        }
    }

    // Mehod overloading is when a program has two methods with the same name but differing in the number or types of parameters
    // The compiler determines which method to call based on the argument types
    public static void printDate(int currDay, int currMonth, int currYear)
    {
        System.out.print(currMonth + "/" + currDay + "/" + currYear);
    }

    public static void printDate(int currDay, String currMonth, int currYear)
    {
        System.out.print(currMonth + " " + currDay + ", " + currYear);
    }

    // A program should only use one Scanner per input stream
    // If a method needs to read user input, a good practice is to create a single Scanner object in main() and pass that Scanner object to the method
    public static int usingScannerInMethodsExample(Scanner scnr)
    {
        System.out.print("Input any number: ");
        return scnr.nextInt();
    }

    public static void main(String[] args) {
        System.out.println(computeSquare(2));
        System.out.println(computeCuve(2));

        int[] initialValues = {10, 11, 12};
        int multiplier = 2;

        updateArrayVals(initialValues, multiplier);
        printFinalVals(initialValues);

        printDate(30, 7, 2012);
        System.out.println();

        printDate(30, "July", 2012);
        System.out.println();

        Scanner scnr = new Scanner(System.in);
        System.out.println(usingScannerInMethodsExample(scnr));
    }

    // User defined methods can appear above or below where they are called
    public static int computeCuve(int numToCube)
    {
        return numToCube * numToCube * numToCube;
    }

    // A method's local variables are discarded from memory upon a method's return; each new call creates new local variables in memory.
}
