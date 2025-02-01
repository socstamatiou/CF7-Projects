package gr.aueb.cf.sokratis.ch2.Challenges;

import java.util.Scanner;

public class IntsToDMSFormat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please provide the day (in digits [1-31]):");
        int day = in.nextInt();
        System.out.println("Please provide the month (in digits [1-12]):");
        int month = in.nextInt();
        System.out.println("Please provide the year:");
        int year = in.nextInt();

        System.out.printf("%02d/%02d/%02d", day, month, year%2000);
    }
}
