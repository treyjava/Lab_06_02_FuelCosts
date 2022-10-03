import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double gasTank = 0;
        double milesGallon = 0;
        double gasPrice = 0;
        String trash = "";

        System.out.print("Enter the number of gallons of gas in your tank: ");

        if (in.hasNextDouble())
        {
            gasTank = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered an invalid number " + trash + ", please try again");
            System.exit(0);
        }

        System.out.print("Enter the fuel efficiency in miles per gallon: ");
        if (in.hasNextDouble())
        {
            milesGallon = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered an invalid number " + trash + ", please try again");
            System.exit(0);
        }
        System.out.print("Enter the price of gas per gallon: ");
        if (in.hasNextDouble())
        {
            gasPrice = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered an invalid number " + trash + ", please try again");
            System.exit(0);
        }
        double per100Miles = 100 / milesGallon * gasPrice;
        System.out.println("The cost per 100 miles is " + per100Miles);

        double gasDistance = gasTank * milesGallon;
        System.out.println("The car can go " + gasDistance + " miles ");

    }
}