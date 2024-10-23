import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Primjer14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("unesi velicinu liste ");

        int velicinaListe = scanner.nextInt();

        List<Integer> lista = new ArrayList<>();


        for (int i = 0; i < velicinaListe; i++) {
            System.out.println("Unsei " + (i + 1) + " broj");
            lista.add(scanner.nextInt());
        }

        int brojPonavljanja = 1;
        boolean b = false;

        for (int i = 0; i < lista.size(); i++) {
            int trenutniBroj = lista.get(i);
            int brojIstihBrojeva = 0;

            for (Integer integer : lista) {

                if (integer.equals(trenutniBroj)) {
                    brojIstihBrojeva++;
                }


            }
            if (brojIstihBrojeva > brojPonavljanja) {
                brojPonavljanja = brojIstihBrojeva;
                b = true;
            }


        }

        System.out.println("u listi postoji duplikat ? " + b);
    }
}
