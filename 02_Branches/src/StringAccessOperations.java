import java.util.Scanner;

public class StringAccessOperations {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userCaption;
        int lastIndex;
        char lastChar;

        System.out.print("Enter a caption: ");
        userCaption = scnr.nextLine();

        // You can get the length of a string using .length()
        lastIndex = userCaption.length() - 1;
        // You can get a character at a position in a string using .charAt()
        lastChar  = userCaption.charAt(lastIndex);

        if ( (lastChar != '.') && (lastChar != '!') && (lastChar != '?') ) {
            // User's caption lacked ending punctuation, so add a period
            userCaption = userCaption + ".";
        }

        String updatedCaption = "Updated caption";
        // You can add to a string with + or .concat
        updatedCaption += ": ";
        updatedCaption = updatedCaption.concat(userCaption);

        System.out.println(updatedCaption);

        // You can find the index of a character using .indexOf()
        int firstSpaceIndex = userCaption.indexOf(' ');
        // You can get parts of a string using .substring()
        String firstWordOfCaption = userCaption.substring(0,firstSpaceIndex);
        System.out.println("First word of caption: " + firstWordOfCaption);

        int lastSpaceIndex = updatedCaption.lastIndexOf(' ');
        String lastWordOfCaption = updatedCaption.substring(lastSpaceIndex);
        System.out.println("Last word of caption: " + lastWordOfCaption);

        // You can replace parts of a string using .replace()
        updatedCaption = updatedCaption.replace(firstWordOfCaption, "First");
        System.out.println(updatedCaption);
    }
}
