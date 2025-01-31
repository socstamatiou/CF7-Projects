package gr.aueb.cf.sokratis.ch1;

/**
 * Προσθέτει δύο ακεραίου και εμφανίζει το
 * αποτέλεσμα στην οθόνη (κονσόλα)
 */

public class addApp {
    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 5;
        int num2 = 12;
        int result = 0;

        //Εντολές
        result = num1 + num2;

        //Εκτύπωση αποτελέσματος
        System.out.println("Το αποτέλεσμα είναι:" + result);
    }
}
