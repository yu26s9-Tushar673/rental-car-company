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

    public static void output(boolean ezpass, boolean gps, boolean roadside, int days, int age)
    {
        double total = 29.99;
        double ezpassTotal;
        double gpsTotal;
        double roadsideTotal;
        System.out.println("The basic car rental $29.99 per day.There is a 30% surcharge on the basic car rental\n" +
                "for drivers under 25. All taxes have already been incorporated into the fees shown: ");

        if (age < 25)
        {
            total = total + (total * .3);
        }

        total *= days;

        if (ezpass)
        {
            ezpassTotal = 3.95 * days;
            System.out.println("Ezpass Fees: " + ezpassTotal);
            total += ezpassTotal;
        }

        if (gps)
        {
            gpsTotal = 2.95 * days;
            System.out.println("Gps Fees: " + gpsTotal);
            total += gpsTotal;

        }

        if (roadside)
        {
            roadsideTotal = 3.95 * days;
            System.out.println("Roadside Fees: " + roadsideTotal);
            total += roadsideTotal;
        }

        System.out.println("The total cost of the rental is : " + total);

    }

    static void main()
    {
        String pickupDate;
        int numDays;
        boolean isEzpass;
        boolean isGps;
        boolean isRoadside;
        int age;


        Scanner scanner = new Scanner(System.in);

        pickupDate = getPickupDate(scanner);
        numDays = getDays(scanner);
        scanner.nextLine(); // Buffer handling
        isEzpass = ezpass(scanner);
        isGps = gps(scanner);
        isRoadside = roadside(scanner);
        age = getAge(scanner);
        output(isEzpass, isGps, isRoadside, numDays, age);

    }
}
