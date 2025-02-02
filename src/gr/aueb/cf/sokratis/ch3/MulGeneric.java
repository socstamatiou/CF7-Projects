package gr.aueb.cf.sokratis.ch3;

import java.util.Scanner;

public class MulGeneric {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //Το 1 είναι το ουδέτερο στοιχείο του πολλαπλασιασμού

        int result =1;
        int n = 0;
        int i = 1;

        System.out.println("Please insert n");
        n = in.nextInt();

        while (i <= n) {
            result *= i;
            i++;
        }

        System.out.println("The result is: " + result);
    }
}
