package gr.aueb.cf.sokratis.ch2;

/**
 * Προσθέτει δύο ακεραίου και εμφανίζει το
 * αποτέλεσμα στην οθόνη (κονσόλα)
 * δημιουργείται υπερχείλιση
 */

public class addApp {
    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 2_147_483_647;
        int num2 = 5;
        int sum = 0;

        //Εντολές
        sum = num1 + num2;

        //Εκτύπωση αποτελέσματος
        System.out.println("Το άθροισμα των: " + num1 + " + " + num2 + " = " + sum);
        System.out.printf("Το άθροισμα των: %d + %d = %d", num1, num2, sum);
    }
}
