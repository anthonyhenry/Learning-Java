public class Arrays {
    public static void main(String[] args) {
        // The syntax for declaring an array is: dataType[] arrayName = new dataType[numElements];
        int[] myFirstArray = new int[3]; // NOTE: The array will have 3 indices, but the last item is at index 2

        myFirstArray[0] = 12;
        myFirstArray[1] = 14;
        // When you create an array, all elements are initialized as the default value for the array data type
        // 0 for ints, 0.0 for floating point data types, false for boolean
        System.out.println("Last item in myFirstArray: " + myFirstArray[2]); // 0

        // An array's length can be accessed by appending .length after the array's name
        System.out.println("myFirstArray.length = " + myFirstArray.length);


        System.out.println("---");


        // You can initialize an array's elements with non-default values by specifying the initial values in braces {} separated by commas
        int[] mySecondArray = {5, 7, 11};
        System.out.println(mySecondArray[2]);


        System.out.println("---");


        // Java has enhanced for loops for Arrays (for each loop) to easily iterate through an array
        // The syntax for a Java for each loop is: for(type iterableVariable : array)
        for(int arrayElement : mySecondArray)
        {
            System.out.println(arrayElement);
        }
    }
}
