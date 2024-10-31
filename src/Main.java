//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //    Zadatak:
//    kreirati klasu polaznik, koja ima ime, prezime, dob i spol.
//    Kreirajte jednog polaznika koji ima samo ime i prezime, drugi polaznik mora imati sve vrijednosti propertia (varijabli)
//    te treci polaznik nema niti jednu vrijednost varijabli.
//    Nakon kreiranja prva tri polaznika, ispisati ime i prezime zajedno od prvog polaznika,
//    drugom polazniku promjeniti dob, trecem polazniku treba postaviti ime i prezime(posebno ime i posebno prezime). (edited)
    public static void main(String[] args) {

        Polaznik prviPolaznik = new Polaznik("Marko", "Maric");
        Polaznik drugiPolaznik = new Polaznik("Ivan", "Ivic", 23, "non-binary");
        Polaznik treciPolaznik = new Polaznik();

        System.out.println("Ime " + prviPolaznik.getIme() + " prezime " + prviPolaznik.getPrezime());
        drugiPolaznik.setDob(25);
        treciPolaznik.setIme("Ana");
        treciPolaznik.setPrezime("Anic");

    }
}
