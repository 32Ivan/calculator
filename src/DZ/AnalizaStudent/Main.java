package DZ.AnalizaStudent;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> listaStudenata = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Unesi broj 1 ako želiš dodati novog studenta ili 2 ako želiš prekinuti dodavanje");
            int num = scanner.nextInt();
            scanner.nextLine();

            if (num == 1) {
                Student noviStudent = unosStudenata(scanner);
                listaStudenata.add(noviStudent);
                System.out.println("Student uspješno dodan.");
            } else if (num == 2) {
                break;
            } else {
                System.out.println("Nevažeći unos. Pokušaj ponovno.");
            }
        }
        podaciStudenata(listaStudenata);
        najvisiProsjekStudenta(listaStudenata);
        najniziProsjekStudenta(listaStudenata);
        prosjekOcjenaStudenta(listaStudenata);

        Student student = unosStudenata(scanner);

        Student kopija = student;
        System.out.println("Student prvi " + student);
        System.out.println("Student kopija " + kopija);

        System.out.println("Promjeni prosjek ocijene");

        kopija.promjeniProsjekOcjena(scanner.nextDouble());

        // objekti ce biti isti jer gledaju na isti objekt u memoriji
        System.out.println("Student prvi " + student);
        System.out.println("Student kopija " + kopija);

    }


    public static Student unosStudenata(Scanner scanner) {

        System.out.println("Ime studenta :");
        String imeStudenta = scanner.nextLine();

        System.out.println("Prezime studenta : ");
        String prezimeStudenta = scanner.nextLine();

        System.out.println("Broj indeksa studenta : ");
        String brojIndeksaStudenta = scanner.nextLine();

        System.out.println("Prosjek ocjena studenta : ");
        double prosjekOcjenaStudenta = scanner.nextDouble();


        Student student = new Student(imeStudenta, prezimeStudenta, brojIndeksaStudenta, prosjekOcjenaStudenta);

        return student;
    }

    public static void podaciStudenata(ArrayList<Student> studenti) {
        System.out.println("Podaci svih studenata studenata");
        for (Student student : studenti) {
            System.out.println(student);
        }
    }

    public static void najvisiProsjekStudenta(ArrayList<Student> studenti) {
        Student najvisiProsjek = studenti.get(0);
        for (Student student : studenti) {
            if (student.getProsjekOcjena() > najvisiProsjek.getProsjekOcjena()) {
                najvisiProsjek = student;
            }
        }
        System.out.println("Student sa najvisim prosjekom je " + najvisiProsjek);
    }

    public static void najniziProsjekStudenta(ArrayList<Student> studenti) {
        Student najniziProsjek = studenti.get(0);
        for (Student student : studenti) {
            if (student.getProsjekOcjena() < najniziProsjek.getProsjekOcjena()) {
                najniziProsjek = student;
            }
        }
        System.out.println("Student sa najnizim prosjekom je " + najniziProsjek);
    }

    public static void prosjekOcjenaStudenta(ArrayList<Student> studenti) {
        double zbrojProsjeka = 0;
        for (Student student : studenti) {
            zbrojProsjeka += student.getProsjekOcjena();
        }
        System.out.println("Prosjek Ocjena Studenta " + zbrojProsjeka / studenti.size());
    }
}


