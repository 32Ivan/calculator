import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadatak5_1 {
    //    Zadatak. Od korisnika trazite unos 10 brojeva te u listi pronadite koji broj se najvise puta ponavlja.
    //    Za rezultat ispisite broj koji se najvise puta ponavljao u listi te koliko se puta pojavio u listi.
    //    Treba uzeti u obriz da su svi brojevi razliciti.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesi 10 brojeva");

        List<Integer> listaBrojeva = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Unesi " + (i + 1) + " broj :");
            listaBrojeva.add(scanner.nextInt());
        }

        int najcesciBroj = listaBrojeva.get(0);
        int brojPonavljanja = 1;


        for (int i = 0; i < listaBrojeva.size(); i++) {

            int trenutniBroj = listaBrojeva.get(i);
            int brojac = 0;


            for (Integer integer : listaBrojeva) {
                if (integer.equals(trenutniBroj)) {
                    brojac++;
                }
            }

            if (brojac > brojPonavljanja) {
                brojPonavljanja = brojac;
                najcesciBroj = trenutniBroj;
            }
        }

        System.out.println("Broj koji se najviše ponavlja: " + najcesciBroj);
        System.out.println("Ponavlja se " + brojPonavljanja + " puta");
    }
}
