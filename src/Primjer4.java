import java.util.Scanner;

public class Primjer4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int secret = 8;
        int num;

        do {
            System.out.println("pogodi tajni broj");
            num = scanner.nextInt();

        }while (secret != num );

        System.out.println("ma bravo tajni broj je "+ secret);

    }

}
