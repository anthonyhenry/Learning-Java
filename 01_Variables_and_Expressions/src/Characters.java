import java.util.Scanner;

public class Characters {
    public static void main(String[] args) {
        // The char type is used to declare character variables
        // char literals go inside single quotes
        char arrowBody = '-';
        char arrowHead = '>';

        // To print character variables, the output must start with a string, even if it's an empty one
        System.out.println("" + arrowBody + arrowBody + arrowBody + arrowHead);
        // Without the opening "" an integer will be output
        System.out.println(arrowBody + arrowBody + arrowBody + arrowHead);

        // To get a character from input, use scnr.next().charAt(0)
        char userChar;

        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a character: ");
        userChar = scnr.next().charAt(0); // charAt(#) gets a character at the index provided

        System.out.println(userChar + " " + userChar);
        System.out.println(" " + userChar);
        System.out.println("" + userChar + " " + userChar);
        System.out.println(" " + userChar);

        // Common escape sequences
        // Some special characters require an escape sequence
        char newLine = '\n';
        char tab = '\t';
        char singleQuote = '\'';
        char doubleQuote = '\"';
        char backslash = '\\';

        System.out.println("" + backslash + newLine + doubleQuote + tab + singleQuote);
    }
}
