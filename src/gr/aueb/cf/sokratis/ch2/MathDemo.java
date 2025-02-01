package gr.aueb.cf.sokratis.ch2;

public class MathDemo {
    public static void main(String[] args) {
        System.out.println("Το απόλυτο του -5 είναι: " + Math.abs(-5));
        System.out.println(Math.min(1,10));
        System.out.println(Math.max(1,10));
        int die = (int) (Math.random()*6)+1;
        System.out.println("Το ζάρι έφερε: " + die);
    }
}

