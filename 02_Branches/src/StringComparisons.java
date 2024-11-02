import java.util.Scanner;

public class StringComparisons {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Type a string: ");
        String firstString;
        firstString  = scnr.next();

        System.out.print("Type another string: ");
        String secondString;
        secondString = scnr.next();

        // Strings cannot be compared with just ==
        // == compares the addresses of strings not the contents
        // To compare strings, use .equals()
        if(firstString.equals(secondString))
        {
            System.out.println("The two strings are the same.");
        }
        else
        {
            System.out.println("The two strings are differnt. I will now alphabetize them.");

            // To compare to strings alphabetically use compareTo()
            // firstString.compareTo(secondString) returns negative number if firstString is less than secondString, 0 if they are equal, and a positive number if firstString is greater than secondString
            if(firstString.compareTo(secondString) < 0)
            {
                System.out.println(firstString + " " + secondString);
            }
            else
            {
                System.out.println(secondString + " " + firstString);
            }
        }
    }
}
