package gr.aueb.cf.sokratis.ch3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LightsOnApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int speed = 0;
        boolean lightsOn = false;
        final int MAX_SPEED = 100;

        System.out.println("Please insert if it is raining (true/false): ");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it is dark (true/false): ");
        isDark = in.nextBoolean();

        System.out.println("Please insert car speed (int): ");
        speed = in.nextInt();

        isRunning = (speed > MAX_SPEED);
        lightsOn = isRunning && (isDark || isRaining);

        System.out.println("Lights on: " + lightsOn);
    }
}
