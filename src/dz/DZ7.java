package dz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DZ7 {
//    trazi od korisnika da unese kolicinu novca koju treba dobiti natrag (kusur).
//    Ispisati sve novcanice koje morate dati natrag kupcu.Float
//
//    apoeni novcanica koje imate su :500,200,100,50,20,10,5,2,1,0.5,0.2,0.1,0.05,0.02,0.01
//
//    423,52
//    rezultat s primjera : 200,200,200,2,1,0.5,0.02

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesi kolicinu novca");
        double kolicinaNovca = scanner.nextDouble();


        System.out.println(kusurIzracun(kolicinaNovca));

    }

    public static List<Double> kusurIzracun(Double kolicinaNovca) {
        double[] apoeni = {500, 200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};

        List<Double> povratnaLista = new ArrayList<>();

        for (double apoen : apoeni) {

            while (kolicinaNovca >= apoen) {
                povratnaLista.add(apoen);

                kolicinaNovca = kolicinaNovca - apoen;

                kolicinaNovca = Math.round(kolicinaNovca * 100.0) / 100.0;
            }
        }
        return povratnaLista;
    }
}
