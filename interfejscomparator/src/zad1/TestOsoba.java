package zad1;

import java.util.Arrays;

public class TestOsoba {

    public static void main(String[] args) {
        Osoba[] osoby = new Osoba[5];
        osoby[0] = new Osoba("Jan", 20, 1.80);
        osoby[1] = new Osoba("Anna", 30, 1.70);
        osoby[2] = new Osoba("Piotr", 40, 1.60);
        osoby[3] = new Osoba("Zofia", 50, 1.50);
        osoby[4] = new Osoba("Krzysztof", 60, 1.40);

        System.out.println("Przed sortowaniem:");
        for (Osoba osoba : osoby) {
            System.out.println(osoba);
        }

        System.out.println("\nPo sortowaniu:");
        Arrays.sort(osoby, new WiekComparator());
        for (Osoba osoba : osoby) {
            System.out.println(osoba);
        }
    }
}
