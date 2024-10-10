public class Primjer2 {
    public static void main(String[] args) {

        int parniBroj = 0;
        int neparniBroj = 0;

        for (int i = 1; i <= 100; i =i + 2) {

            if (i % 2 == 0) {
                parniBroj = parniBroj + 1;
            } else {
                neparniBroj++;
            }
        }
        System.out.println("parni " + parniBroj);
        System.out.println("neparni " + neparniBroj);



    }
}
