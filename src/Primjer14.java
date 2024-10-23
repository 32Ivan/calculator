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


        int minNum = lista.get(0);
        int maxNum = lista.get(0);

        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i) < minNum) {
                minNum = lista.get(i);
            }
            if (lista.get(i) > maxNum) {
                maxNum = lista.get(i);
            }
        }
        int finalMaxNum = maxNum;
        int finalMinNum = minNum;
        int sum = 0;

        lista.removeIf(broj -> broj.equals(finalMaxNum));
        lista.removeIf(broj -> broj.equals(finalMinNum));

        for (Integer i : lista) {
            System.out.println(i);
            sum += i;
        }
        double prosjek = (double) sum / lista.size();
        System.out.println("Prosjek brojeva u novoj listi je " + prosjek);
    }

}
