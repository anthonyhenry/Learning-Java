import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        // This is how you declare a string
        String firstString; // Note the capital S in String
        firstString = "First";
        System.out.println(firstString);

        System.out.print("Input a single word: ");
        Scanner scnr = new Scanner(System.in);
        String inputString;
        inputString = scnr.next(); // scnr.next() skips initial whitespace in input and gets characters until the next whitespace to make a string
        System.out.println(inputString);

        System.out.print("Input multiple words: ");
        String firstWord;
        String secondWord;
        firstWord = scnr.next();
        secondWord = scnr.next();
        System.out.println("Second word: " + secondWord + "\nFirst word: " + firstWord);

        String wordRelative;
        String wordFood;
        String wordAdjective;
        String wordTimePeriod;

        // Get user's words
        System.out.println("Provide input without spaces.");

        System.out.println("Enter a kind of relative: ");
        wordRelative = scnr.next();

        System.out.println("Enter a kind of food: ");
        wordFood = scnr.next();

        System.out.println("Enter an adjective: ");
        wordAdjective = scnr.next();

        System.out.println("Enter a time period: ");
        wordTimePeriod = scnr.next();

        // Tell the story
        System.out.println();
        System.out.print  ("My " + wordRelative);
        System.out.println(" says eating " + wordFood);
        System.out.println("will make me more " + wordAdjective + ",");
        System.out.println("so now I eat it every " + wordTimePeriod + ".");

        // To get an entire line into a string use .nextLine()
        System.out.print("Enter your state abreviation followed by your full name (Example: CA Anthony Hernandez): ");
        String state;
        String fullName;
        state = scnr.next(); // Get first word of input
        fullName = scnr.nextLine(); // get remaining input

        System.out.println("You are" + fullName + " from " + state + "."); // Note how .nextLine gets the preceding space

    }
}
