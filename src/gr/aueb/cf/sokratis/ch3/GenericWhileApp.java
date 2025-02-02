package gr.aueb.cf.sokratis.ch3;

import java.util.Scanner;

public class GenericWhileApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = 0;
        int endValue = 0;
        int step = 0;
        int counter = 0;

        System.out.println("Please insert, beginValue, EndValue and step");
        start = in.nextInt();
        endValue = in.nextInt();
        step = in.nextInt();

        while (start <= endValue) {
            counter++;
            start += step;
        }
        System.out.println("Iterations count: " + counter);
    }
}
