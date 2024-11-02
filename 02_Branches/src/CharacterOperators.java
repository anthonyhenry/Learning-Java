import java.util.Scanner;

public class CharacterOperators {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput;

        // The Character class provides several methods for working with characters

        System.out.print("Type a string that begins with a letter and ends with a string: ");
        userInput = scnr.nextLine();

        // Checking if a character is a letter
        if(Character.isLetter(userInput.charAt(0)))
        {
            System.out.println(userInput.charAt(0) + " is a letter");
        }
        else
        {
            System.out.println(userInput.charAt(0) + " is not a letter");
        }

        // Check if a character is a digit
        if(Character.isDigit(userInput.charAt(userInput.length()-1)))
        {
            System.out.println(userInput.charAt(userInput.length()-1) + " is a digit");
        }
        else
        {
            System.out.println(userInput.charAt(userInput.length()-1) + " is not a digit");
        }

        // Some other methods

        // isWhitespace(' ')  // true
        // isWhitespace('\n') // true
        // isWhitespace('x')  // false

        // toUpperCase('a')  // A
        // toUpperCase('A')  // A
        // toUpperCase('3')  // 3

        // toLowerCase('A')  // a
        // toLowerCase('a')  // a
        // toLowerCase('3')  // 3

    }
}
