import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String errorText = "Uneseni podatak nije broj";
        int num1 = getScannerInput("Unesi prvi broj:", scanner, errorText);
        int num2 = getScannerInput("Unesi drugi broj:", scanner, errorText);

        System.out.println("Odaberi operaciju:");
        System.out.println("1. Zbrajanje");
        System.out.println("2. Oduzimanje");
        System.out.println("3. Množenje");
        System.out.println("4. Dijeljenje");

        int choice = getOperationChoice(scanner, errorText);
        double result = calculate(num1, num2, choice);

        System.out.println("Rezultat : " + result);
    }

    private static int getScannerInput(String message, Scanner scanner, String errorText) {
        while (true) {
            System.out.println(message);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println(errorText);
                scanner.next();
            }
        }
    }

    private static int getOperationChoice(Scanner scanner, String errorText) {
        while (true) {
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                if (choice >= 1 && choice <= 4) {
                    return choice;
                } else {
                    System.out.println("Odaberi broj između 1 i 4.");
                }
            } else {
                System.out.println(errorText);
                scanner.next();
            }
        }
    }


    private static double calculate(int num1, int num2, int choice) {
        switch (choice) {
            case 1:
                return num1 + num2;
            case 2:
                return num1 - num2;
            case 3:
                return num1 * num2;
            case 4:
                if (num2 != 0) {
                    return (double) num1 / num2;
                } else {
                    System.out.println("Dijeljenje s nulom nije dopušteno!");
                    return 0;
                }
            default:
                return 0;
        }
    }
}