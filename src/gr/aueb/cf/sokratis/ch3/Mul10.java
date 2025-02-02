package gr.aueb.cf.sokratis.ch3;

public class Mul10 {

    public static void main(String[] args) {

        int result = 1; // Το 1 είναι το ουδέτερο στοιχείο του πολλαπλασιασμού
        int i =1;

        while (i <= 10) {
            result *= i;
            i++;
        }

        System.out.println("result = " + result);
    }
}
