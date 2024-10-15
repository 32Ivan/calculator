import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean brojInt = true;
        int num = 0;
        int pozitivanBroj;

        do {

            try {
                System.out.println("Unesi broj polja");
                num = scanner.nextInt();

                if (num > 0) {

                    int[] unesenaVrijednost = new int[num];


                    for (int i = 0; i < unesenaVrijednost.length; i++) {
                        boolean validInput = false;

                        while (!validInput) {
                            try {
                                System.out.println("Unesi pozitivan broj za polje " + (i + 1) + ":");
                                pozitivanBroj = scanner.nextInt();

                                if (pozitivanBroj > 0) {
                                    unesenaVrijednost[i] = pozitivanBroj;
                                    validInput = true;
                                } else {
                                    System.out.println("Broj mora biti veći od 0");
                                }

                            } catch (InputMismatchException e) {
                                System.out.println("Nije unesen broj. Pokušaj ponovo.");
                                scanner.next();  // Odbacivanje neispravnog unosa
                            }
                        }
                    }

                    int maxValue = unesenaVrijednost[0];
                    int minValue = unesenaVrijednost[0];
                    for (int i = 1; i < unesenaVrijednost.length; i++) {
                        maxValue = Math.max(maxValue, unesenaVrijednost[i]);
                        minValue = Math.min(minValue, unesenaVrijednost[i]);

                    }
                    System.out.println("Najveca vrijednost je " + maxValue + " ,najmanja vrijednost je " + minValue);


                    brojInt = false;
                } else {
                    System.out.println("broj nije veci od 0");

                }


            } catch (InputMismatchException e) {
                System.out.println("nije unesen broj, pokusaj ponovo");
                scanner.nextInt();
            }
        } while (brojInt);


    }
}
