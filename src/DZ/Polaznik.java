public class Polaznik {

    private String ime;
    private String prezime;
    private Integer dob;
    private String spol;

    public Polaznik() {
    }

    public Polaznik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public Polaznik(String ime, String prezime, Integer dob, String spol) {
        this.ime = ime;
        this.prezime = prezime;
        this.dob = dob;
        this.spol = spol;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Integer getDob() {
        return dob;
    }

    public void setDob(Integer dob) {
        this.dob = dob;
    }

    public String getSpol() {
        return spol;
    }

    public void setSpol(String spol) {
        this.spol = spol;
    }
}
