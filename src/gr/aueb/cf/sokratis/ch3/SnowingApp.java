package gr.aueb.cf.sokratis.ch3;

import java.util.Scanner;

public class SnowingApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        boolean irRaining = false;
        int temp = 0;

        System.out.println("Please insert if it is raining (true/false): ");
        irRaining = in.nextBoolean();
        System.out.println("Please insert temperature: ");
        temp = in.nextInt();
        isSnowing = irRaining && (temp < 0);

        System.out.println("Snowing is: " + isSnowing);
    }
}
