package gr.aueb.cf.sokratis.ch2;

import java.util.Scanner;

public class MenuOpApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please provide two integers");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        String s = "%";

        System.out.printf("Sum: %d + %d = %d\n", num1, num2, num1+num2);
        System.out.printf("Subtract: %d - %d = %d\n", num1, num2, num1-num2);
        System.out.printf("Multiply: %d * %d = %d\n", num1, num2, num1*num2);
        System.out.printf("Divide: %d/%d = %d\n", num1, num2, num1/num2);
        System.out.printf("Mod: %d %s %d %d\n", num1, s, num2, num1 % num2);
    }
}
