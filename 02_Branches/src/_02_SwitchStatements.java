import java.util.Scanner;

public class _02_SwitchStatements {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // A switch statement can more clearly represent multi-branch behavior involving a variable being compared to constant values
        // The program executes the first case whose constant expression matches the value of the switch expression, executes that case's statements, and then jumps to the end.
        // If no case matches, then the default case statements are executed

        int dogAgeYears;
        int dogAgeMonths;

        System.out.print("Enter dog's age (in years): ");
        dogAgeYears = scnr.nextInt();

        if (dogAgeYears == 0)
        {
            System.out.print("Enter dog's age in months: ");
            dogAgeMonths = scnr.nextInt();

            switch (dogAgeMonths) // The switch statement's expression should be an integer, char, or string. The expression should not be a Boolean or a floating-point type.
            {
                // The order of cases doesn't matter assuming break statements exist at the end of each case
                case 0:
                case 1:
                case 2:
                    System.out.println("That's 0..14 human months.");
                    break; // Omitting the break statement for a case will cause the statements within the next case to be executed. Such "falling through" to the next case can be useful when multiple cases, such as cases 0, 1, and 2, should execute the same statements.

                case 3:
                case 4:
                case 5:
                case 6:
                    System.out.println("That's 14 months to 5 human years.");
                    break;

                case 7:
                case 8:
                    System.out.println("That's 5..9 human years.");
                    break;

                case 9:
                case 10:
                case 11:
                case 12:
                    System.out.println("That's 9..15 human years.");
                    break;

                default: // Best practice is to always have a default case
                    System.out.println("Invalid input.");
                    break;
            }
        }
        else
        {
            switch (dogAgeYears)
            {
                case 0:
                    System.out.println("That's 0..14 human years.");
                    break;

                case 1:
                    System.out.println("That's 15 human years.");
                    break;

                case 2:
                    System.out.println("That's 24 human years.");
                    break;

                case 3:
                    System.out.println("That's 28 human years.");
                    break;

                case 4:
                    System.out.println("That's 32 human years.");
                    break;

                case 5:
                    System.out.println("That's 37 human years.");
                    break;

                default:
                    System.out.println("Human years unknown.");
                    break;
            }
        }

    }
}
