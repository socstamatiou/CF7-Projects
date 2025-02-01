package gr.aueb.cf.sokratis.ch2;

import java.util.Scanner;
import java.util.Locale;

public class DHMToSec {
    public static void main(String[] args) {
        final int SEC_PER_DAY = 24 * 60 * 60;
        final int SEC_PER_HOUR = 60 * 60;
        final int SEC_PER_MIN = 60 * 60;

        Scanner sc = new Scanner(System.in);
        long days, hours, mins, secs;
        long totalSec;

        System.out.println("Δώστε Μέρες, Ώρες, Λεπτά, Δευτερόλεπτα");
        days = sc.nextLong();
        hours = sc.nextLong();
        mins = sc.nextLong();
        secs = sc.nextLong();

        totalSec = (days*SEC_PER_DAY) + (hours*SEC_PER_HOUR) + (mins*SEC_PER_MIN) + secs;

        System.out.printf(Locale.US, "Total Sec: %,8d", totalSec);
    }
}
