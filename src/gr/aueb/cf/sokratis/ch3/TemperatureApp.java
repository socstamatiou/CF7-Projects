package gr.aueb.cf.sokratis.ch3;

import java.util.Scanner;

public class TemperatureApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isTempBelowZero = false;
        int temp = 0;

        System.out.println("Please enter a temperature in degrees: ");
        temp = in.nextInt();

        isTempBelowZero = (temp < 0);

        System.out.println("The temperature in bellow zero: " + isTempBelowZero);
    }
}
