import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DZ6_1 {
    //     2. Telefonski imenik:
//    Napravi program koji simulira telefonski imenik koristeći dvije paralelne liste:
//    Lista u koju se spremaju imena, i lista u kojoj se sprema brojevi
//    Kod prvog odabira korisnik unosi ime i broj koji se spremaju u svoje liste
//    Korisnik ima mogucnost odabira, te za svaki odabir treba omoguciti odredenu funkcionalnost sa slike.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> listOfNames = new ArrayList<>();
        List<Integer> listOfNumbers = new ArrayList<>();

        addContact(scanner, listOfNames, listOfNumbers);

        while (true) {

            System.out.println("Odaberi ponudeno : ");
            System.out.println("\n1. Dodaj kontakt");
            System.out.println("2. Pretrazi po imenu");
            System.out.println("3. Pretrazi po broju");
            System.out.println("4. Ispisi sve");
            System.out.println("5. Izlaz");

            int number = scanner.nextInt();
            scanner.nextLine(); // Čistimo preostali novi red

            switch (number) {
                case 1:
                    addContact(scanner, listOfNames, listOfNumbers);
                    break;
                case 2:
                    filterByName(scanner, listOfNames, listOfNumbers);
                    break;
                case 3:
                    filterByNumber(scanner, listOfNames, listOfNumbers);
                    break;
                case 4:
                    seeAllInLists(listOfNames, listOfNumbers);
                    break;
                case 5:
                    System.out.println("Izasli ste iz programa");
                    return;
                default:
                    System.out.println("Unjeli ste krivi broj");
            }
        }


    }

    public static void addContact(Scanner scanner, List<String> listOfNames, List<Integer> listOfNumbers) {

        System.out.println("Unesi ime u telefonski imenik  ");

        listOfNames.add(scanner.nextLine());

        System.out.println("Unesi broj za ime");

        listOfNumbers.add(scanner.nextInt());

    }

    public static void filterByName(Scanner scanner, List<String> listOfNames, List<Integer> listOfNumbers) {

        System.out.println("Unesi ime :");
        String name = scanner.nextLine();

        if (listOfNames.contains(name)) {
            int num = listOfNames.indexOf(name);
            System.out.println("Broj za ime " + name + " je " + listOfNumbers.get(num));
        } else {
            System.out.println("Ime ne postoji u imeniku ");
        }
    }

    public static void filterByNumber(Scanner scanner, List<String> listOfNames, List<Integer> listOfNumbers) {
        System.out.println("Unesi broj :");
        int number = scanner.nextInt();

        if (listOfNumbers.contains(number)) {
            int num = listOfNumbers.indexOf(number);
            System.out.println("Ime za broj " + number + " je " + listOfNames.get(num));
        } else {
            System.out.println("Broj ne postoji u imeniku ");
        }
    }


    public static void seeAllInLists(List<String> listOfNames, List<Integer> listOfNumbers) {
        System.out.println("Kontakti u imeniku su : ");
        for (int i = 0; i < listOfNames.size(); i++) {
            System.out.println((i + 1) + "-  ime " + listOfNames.get(i) + " , broj " + listOfNumbers.get(i));
        }

    }
}
