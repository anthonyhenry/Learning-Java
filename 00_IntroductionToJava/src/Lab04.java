import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int currentPrice;
        int lastMonthsPrice;

        currentPrice = scnr.nextInt();
        lastMonthsPrice = scnr.nextInt();

        /* Type your code here. */
        System.out.println("This house is $" + currentPrice + ". The change is $" + (currentPrice - lastMonthsPrice) + " since last month.");
        System.out.println("The estimated monthly mortgage is $" + ((currentPrice * 0.051) / 12) + ".");
    }
}
