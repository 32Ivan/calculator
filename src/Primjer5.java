import java.util.Scanner;

public class Primjer5 {
    public static void main(String[] args) {

        boolean replay = false;

        do {

            Scanner scanner = new Scanner(System.in);
            int sum = calculateSum(scanner);
            System.out.println("Zbroj je " + sum);

            int sumOfDigits = calculateSumOfDigits(scanner);
            System.out.println("Zbroj znamenki je " + sumOfDigits);

            System.out.println("Hoces ponovo pokusat? Ako je odgovor da unesi `true` ili ako ne zelis unesi `false`");

            replay = scanner.nextBoolean();

        } while (replay);


    }

    private static int calculateSum(Scanner scanner) {
        int sum = 0;

        System.out.println("Unesi pozitivan cijeli broj");
        while (true) {
            if (scanner.hasNextInt()) {
                int cijeliBroj = scanner.nextInt();
                for (int i = 0; i <= cijeliBroj; i++) {
                    sum += i;
                }
                return sum;
            } else {
                System.out.println("unesi broj");
                scanner.next();
            }
        }
    }

    private static int calculateSumOfDigits(Scanner scanner) {
        int sum = 0;

        System.out.println("Unesi drugi pozitivan cijeli broj");
        while (true) {
            if (scanner.hasNextInt()) {
                int cijeliBroj = scanner.nextInt();
                while (cijeliBroj > 0) {
                    sum += cijeliBroj % 10;
                    cijeliBroj /= 10;
                }
                return sum;
            } else {
                System.out.println("unesi broj");
                scanner.next();
            }
        }
    }

}
