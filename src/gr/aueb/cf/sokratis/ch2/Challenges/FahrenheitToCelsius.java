package gr.aueb.cf.sokratis.ch2.Challenges;

import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Δώστε τη θερμοκρασία σε βαθμούς Fahrenheit");
        int fahrenheit = in.nextInt();
        int celsius = 5 * (fahrenheit - 32) / 9;
        System.out.printf("%d degrees fahrenheit are %d degrees Celsius", fahrenheit, celsius);
    }
}
