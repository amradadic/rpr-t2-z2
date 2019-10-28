package ba.unsa.etf.rpr.tutorijal02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Nema ništa u mainu, pokrenite testove!");

        System.out.println("Unesite dva intervala");
        System.out.print("Pocetna tacka prvog intervala: ");
        Scanner ulaz = new Scanner(System.in);
        double pocetna1 = ulaz.nextDouble();
        System.out.print("Krajnja tacka prvog intervala: ");
        double krajnja1 = ulaz.nextDouble();
        Interval interval1 = new Interval(pocetna1, krajnja1, false, false);

        System.out.print("Pocetna tacka drugog intervala: ");
        double pocetna2 = ulaz.nextDouble();
        System.out.print("Krajnja tacka drugog intervala: ");
        double krajnja2 = ulaz.nextDouble();
        Interval interval2 = new Interval(pocetna2, krajnja2, false, false);

        System.out.print("Presjek intervala: ");
        System.out.println(interval1.intersect(interval2));

    }
}
