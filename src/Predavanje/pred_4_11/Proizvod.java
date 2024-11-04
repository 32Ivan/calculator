package Predavanje.pred_4_11;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Proizvod {
    private String naziv;
    private BigDecimal cijena;
    private BigDecimal popust = BigDecimal.ZERO;

    public Proizvod(String naziv, BigDecimal cijena) {
        this.naziv = naziv;
        this.cijena = cijena;
    }

    public void postaviPopust(BigDecimal popust) {
        this.popust = popust;
    }

    public BigDecimal izracunajCijenu() {

        BigDecimal izracunVrijednostiPopusta = cijena.multiply(popust).divide(BigDecimal.valueOf(100), 1, RoundingMode.HALF_UP);

        cijena = cijena.subtract(izracunVrijednostiPopusta);
        return cijena;
    }

    @Override
    public String toString() {
        return "Proizvod{" +
                "naziv='" + naziv + '\'' +
                ", cijena=" + cijena +
                ", popust=" + popust +
                '}';
    }
}
