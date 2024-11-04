package Predavanje.pred_4_11;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Koliko zelis imati proizvoda ");

        int velicinaPolja = scanner.nextInt();

        ArrayList<Proizvod> proizvodi = new ArrayList<>();

        for (int i = 0; i < velicinaPolja; i++) {
            System.out.println("Unesi naziv proizvoda ");
            String imeProizvoda = scanner.next();

            System.out.println("Unesi cijenu proizvoda");
            BigDecimal cijena = scanner.nextBigDecimal();

            Proizvod proizvod = new Proizvod(imeProizvoda, cijena);

            System.out.println("Unesi velicinu popusta");
            BigDecimal popust = scanner.nextBigDecimal();

            proizvod.postaviPopust(popust);

            BigDecimal rezultat = proizvod.izracunajCijenu();

            System.out.println(rezultat);
            proizvodi.add(proizvod);
        }
        ;

        for (Proizvod proizvod : proizvodi) {
            System.out.println(proizvod);
        }

    }
}
