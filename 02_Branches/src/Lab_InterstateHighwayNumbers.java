import java.util.Scanner;

public class Lab_InterstateHighwayNumbers {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int highwayNumber;
        int primaryNumber;

        highwayNumber = scnr.nextInt();

        // Check if valid highway
        if(highwayNumber > 0 && highwayNumber <= 999 && highwayNumber % 100 != 0)
        {
            System.out.print("I-" + highwayNumber + " is ");

            // Primary or auxiliary
            if(highwayNumber < 100)
            {
                System.out.print("primary");
            }
            else
            {
                System.out.print("auxiliary, serving I-" + (highwayNumber % 100));
            }

            System.out.print(", going ");

            // Direction
            if(highwayNumber % 2 == 0)
            {
                System.out.print("east/west");
            }
            else
            {
                System.out.print("north/south");
            }
            System.out.println(".");
        }
        else
        {
            System.out.println(highwayNumber + " is not a valid interstate highway number.");
        }
    }
}
