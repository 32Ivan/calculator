import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class primjer16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        System.out.println("unesi velicinu liste ");

        int velicinaListe = scanner.nextInt();


        for (int i = 0; i < velicinaListe; i++) {
            System.out.println("Unsei " + (i + 1) + " broj");
            lista.add(scanner.nextInt());
        }
        System.out.println(listaJeSortirana(lista));

    }

    private static boolean listaJeSortirana(List<Integer> lista) {
        boolean rezultat = false;

        for (int i = 1; i < lista.size(); i++) {

            if (lista.get(i) < lista.get(i - 1)) {
                rezultat = false;
                break;
            } else {

                rezultat = true;
            }

        }
        return rezultat;
    }


}
