public class Main {

    // This is how you create a user defined method in Java
    // User defined methods have a return type. Void is used if the method is not meant to return anything
    public static int computeSquare(int numToSquare) // Parameters need to have their type specified
    {
        return numToSquare * numToSquare;
    }

    public static void main(String[] args) {
        System.out.println(computeSquare(2));
        System.out.println(computeCuve(2));
    }

    // User defined methods can appear above or below where they are called
    public static int computeCuve(int numToCube)
    {
        return numToCube * numToCube * numToCube;
    }
}
