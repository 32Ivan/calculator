package DZ.AnalizaStudent;

public class Student {
    private String ime;
    private String prezime;
    private String brojIndeksa;
    private double prosjekOcjena;

    public Student(String ime, String prezime, String brojIndeksa, double prosjekOcjena) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
        this.prosjekOcjena = prosjekOcjena;
    }

    public Student() {
    }

    public String getIme() {
        return this.ime;
    }

    public String getPrezime() {
        return this.prezime;
    }

    public String getBrojIndeksa() {
        return this.brojIndeksa;
    }

    public double getProsjekOcjena() {
        return this.prosjekOcjena;
    }

    public void promjeniProsjekOcjena(double noviProsjek) {
        this.prosjekOcjena = noviProsjek;
    }

    @Override
    public String toString() {
        return "Student {" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", brojIndeksa='" + brojIndeksa + '\'' +
                ", prosjekOcjena=" + prosjekOcjena +
                '}';
    }
}
