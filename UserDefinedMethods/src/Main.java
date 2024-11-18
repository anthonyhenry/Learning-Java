import java.util.Scanner;

public class Main {

    // This is how you create a user defined method in Java
    // User defined methods have a return type. Void is used if the method is not meant to return anything
    // A method's local variables are discarded from memory upon a method's return; each new call creates new local variables in memory.
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

    // When oversize arrays are passed to a method, two parameters are needed for both the array reference and the current size
    public static void printOversizeArray(String[] arrayRef, int arraySize) {
        int index;

        System.out.print("[");
        for (index = 0; index < arraySize; ++index) {
            System.out.print(arrayRef[index]);
            if (index != arraySize - 1) {  // Don't print trailing , for last element
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // If an array size is changed by a method, then the new array size needs to be returned by the method
    public static int addArrayElement(String[] arrayRef, int currentSize, String elementToAdd)
    {
        // Check that the array has space
        if(currentSize == arrayRef.length)
        {
            return currentSize;
        }

        // If the array has space, add the element
        arrayRef[currentSize] = elementToAdd;
        ++currentSize;
        return currentSize;
    }
    // Remove the first element from an oversize array whose value is equal to targetVal
    public static int removeFirst(String[] arrayRef, int arraySize, String targetVal)
    {
        boolean targetFound;
        int index;

        targetFound = false;

        // Step through the array one element at a time
        for (index = 0; index < arraySize; ++index)
        {
            // If matching element found, move each element to the previous index
            if (targetFound)
            {
                arrayRef[index-1] = arrayRef[index];
            }

            // Check if matching element found
            if (arrayRef[index] == targetVal)
            {
                targetFound = true;
            }
        }

        // If matching element found, array size is one element smaller
        // otherwise array size hasn't changed
        if (targetFound)
        {
            return arraySize - 1;
        }
        else
        {
            return arraySize;
        }
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

        final int NAMES_CAPACITY = 5;
        String[] names = new String[NAMES_CAPACITY];
        int namesSize = 0;

        namesSize = addArrayElement(names, namesSize, "Jamal");
        namesSize = addArrayElement(names, namesSize, "Jovanna");
        namesSize = addArrayElement(names, namesSize, "Naveen");
        namesSize = addArrayElement(names, namesSize, "Rosie");
        namesSize = addArrayElement(names, namesSize, "Blake");
        namesSize = addArrayElement(names, namesSize, "Kelly");
        printOversizeArray(names, namesSize);

        namesSize = removeFirst(names, namesSize, "Jovanna");
        printOversizeArray(names, namesSize);
    }

    // User defined methods can appear above or below where they are called
    public static int computeCuve(int numToCube)
    {
        return numToCube * numToCube * numToCube;
    }
}
