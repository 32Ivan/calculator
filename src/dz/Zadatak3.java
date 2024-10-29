import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cijeliBroj;
        int sum = 0;
        int attempts = 0;

        do {
            System.out.print("Unesi ciljni broj (veći od 0): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Nisi unio cijeli broj. Pokušaj ponovo.");
                scanner.next();
            }
            cijeliBroj = scanner.nextInt();
            if (cijeliBroj <= 0) {
                System.out.println("Ciljni broj mora biti veći od 0. Pokušaj ponovo.");
            }
        } while (cijeliBroj <= 0);

        do {
            System.out.print("Unesi pozitivan broj: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Nisi unio broj, pokušaj ponovo.");
                scanner.next();
            }

            int num = scanner.nextInt();

            if (num == 0) {
                attempts++;
                System.out.println("Prekid zbog unosa 0");
                break;
            } else if (num > 0) {
                sum += num;
                attempts++;
                System.out.println("Trenutni zbroj je " + sum);
            } else {
                attempts++;
                System.out.println("Moraš unijeti pozitivan broj. Pokušaj ponovo.");
            }
        } while (sum < cijeliBroj);

        System.out.println("Broj pokušaja: " + attempts);
        System.out.println("Zbroj: " + sum);


    }
}
