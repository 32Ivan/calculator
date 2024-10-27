import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DZ6 {
//    Statistika riječi Napravi program koji učitava rečenicu i ispisuje:
//    Sve riječi duže od 5 slova
//    Najdužu riječ
//    Prosječnu duljinu riječi

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesi recenicu ");

        String sentence = scanner.nextLine();

        System.out.println("Lista rijeci sa 5 ili vise slova : " + findBigWordsInSentence(sentence));

        System.out.println("Najveca rijec u recenici je : " + biggestWord(findBigWordsInSentence(sentence)));

        System.out.println("Prosjecna duljina rijeci je : " + averageWordLength(sentence));


    }

    private static List<String> findBigWordsInSentence(String sentence) {

        String[] split = sentence.split(" ");

        List<String> fiveLetterWords = new ArrayList<>();
        for (String s : split) {
            if (s.length() >= 5) {
                fiveLetterWords.add(s);
            }
        }
        return fiveLetterWords;
    }

    private static String biggestWord(List<String> list) {

        String biggestWord = "";
        for (String s : list) {
            if (s.length() >= biggestWord.length()) {
                biggestWord = s;
            }
        }
        return biggestWord;

    }

    private static double averageWordLength(String sentence) {

        String[] split = sentence.split(" ");
        int totalLength = 0;

        for (String word : split) {
            totalLength += word.length();
        }

        return split.length > 0 ? (double) totalLength / split.length : 0.0;
    }

}
