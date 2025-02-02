package gr.aueb.cf.sokratis.ch3;

import java.util.Scanner;

public class SumApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int i = 1;
        int n = 0;

        System.out.println("Please insert n: ");
        n = in.nextInt();

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("Sum: " + sum);
    }
}
