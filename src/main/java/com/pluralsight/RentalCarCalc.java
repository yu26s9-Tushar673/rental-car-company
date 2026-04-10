package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalc
{
    public static String getPickupDate(Scanner scanner)
    {
        System.out.print("Enter Pick Up date - (mm/dd/yyyy): ");
        return scanner.nextLine();
    }

    public static int getDays(Scanner scanner)
    {
        System.out.print("Enter the number of days you would like to rent (Enter number not word): ");
        return scanner.nextInt();

    }

    public static boolean ezpass(Scanner scanner)
    {
        String input;
        System.out.print("Electronic toll tag at $3.95/day? Enter (yes/no) : ");
        input = scanner.nextLine();
        if (input.equals("yes"))
        {
            return true;
        }
        else if (input.equals("no"))
        {
            return false;
        }
        return false;
    }

    public static boolean gps(Scanner scanner)
    {
        String input;
        System.out.print("GPS at $2.95/day? Enter (yes/no) : ");
        input = scanner.nextLine();
        if (input.equals("yes"))
        {
            return true;
        }
        else if (input.equals("no"))
        {
            return false;
        }
        return false;
    }

    public static boolean roadside(Scanner scanner)
    {
        String input;
        System.out.print("Roadside assistance at $3.95/day? Enter (yes/no) : ");
        input = scanner.nextLine();
        if (input.equals("yes"))
        {
            return true;
        }
        else if (input.equals("no"))
        {
            return false;
        }
        return false;
    }

    public static int getAge(Scanner scanner)
    {
        System.out.print("Enter your age (Number not word) : ");
        return scanner.nextInt();
    }

    static void main()
    {
        String pickupDate;
        int numDays;
        boolean isEzpass;
        boolean isGps;
        boolean isRoadside;
        String age;

        Scanner scanner = new Scanner(System.in);

        pickupDate = getPickupDate(scanner);
        numDays = getDays(scanner);
        scanner.nextLine(); // Buffer handling
        isEzpass = ezpass(scanner);
        isGps = gps(scanner);
        isRoadside = roadside(scanner);


    }
}
