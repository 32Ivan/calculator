package Predavanje.pred_7_11;

import java.math.BigDecimal;

public abstract class Racun {
    private String brojRacuna;

    private BigDecimal stanje;

    private String vlasnik;

    public Racun(String brojRacuna, BigDecimal stanje, String vlasnik) {
        this.brojRacuna = brojRacuna;
        this.stanje = stanje;
        this.vlasnik = vlasnik;
    }

    public abstract BigDecimal obracunKamate();

    public BigDecimal uplataNaRacun(int iznos) {
        BigDecimal stanjeRacunaNakonUplate = getStanje().add(BigDecimal.valueOf(iznos));
        setStanje(stanjeRacunaNakonUplate);
        return stanjeRacunaNakonUplate;
    }
    
    public BigDecimal isplataSaRacuna(int iznos) {
        BigDecimal stanjeRacunaNakonIsplate = getStanje().subtract(BigDecimal.valueOf(iznos));
        setStanje(stanjeRacunaNakonIsplate);
        return stanjeRacunaNakonIsplate;
    }


    public BigDecimal getStanje() {
        return stanje;
    }

    public void setStanje(BigDecimal stanje) {
        this.stanje = stanje;
    }


}
