package gr.aueb.cf.sokratis.ch2;

import java.util.Scanner;

public class IntDigits {

    public static void main(String[] args) {
        int num;
        int leftDigit;
        int rightDigit;
        int sum;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        num = in.nextInt();

        leftDigit = num / 10;
        rightDigit = num % 10;
        sum = leftDigit + rightDigit;

        System.out.printf("Left digit: %d, Right digit: %d, Sum %d\n", leftDigit, rightDigit, sum);
    }
}
