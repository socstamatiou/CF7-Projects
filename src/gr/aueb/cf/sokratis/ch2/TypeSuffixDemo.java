package gr.aueb.cf.sokratis.ch2;

import java.util.Locale;

public class TypeSuffixDemo {
    public static void main(String[] args) {

        System.out.println(Integer.MAX_VALUE);
        long num = 2_147_483_648L;
        System.out.printf(Locale.forLanguageTag("el"), "%,d", num);
    }
}
