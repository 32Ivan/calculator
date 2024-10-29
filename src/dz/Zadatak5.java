import java.util.*;

public class Zadatak5 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesi velicinu liste brojeva");


        int velicinListe = scanner.nextInt();

        if (velicinListe <= 0) {
            System.out.println("Veličina liste mora biti veća od 0.");
            return;
        }

        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < velicinListe; i++) {
            System.out.println("Upisi broj " + (i + 1) + " :");
            integerList.add(scanner.nextInt());
        }

        int minIndex = 0;
        int maxIndex = 0;

        int minNum = integerList.get(0);
        int maxNum = integerList.get(0);

        for (int i = 1; i < integerList.size(); i++) {
            if (integerList.get(i) < minNum) {
                minNum = integerList.get(i);
                minIndex = i;
            }
            if (integerList.get(i) > maxNum) {
                maxNum = integerList.get(i);
                maxIndex = i;
            }
        }

        integerList.set(minIndex, maxNum);
        integerList.set(maxIndex, minNum);

        System.out.println("Najveci broj u listi je " + maxNum + " ,najmanji broj u lisiti je " + minNum);

        System.out.println("Nova lista nakon zamjene najmanjeg i najvećeg broja:");
        for (Integer broj : integerList) {
            System.out.print(broj + " ");
        }
    }


}

