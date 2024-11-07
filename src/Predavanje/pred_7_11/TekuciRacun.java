package Predavanje.pred_7_11;

import java.math.BigDecimal;

public class TekuciRacun extends Racun {


    public TekuciRacun(String brojRacuna, BigDecimal stanje, String vlasnik) {
        super(brojRacuna, stanje, vlasnik);
    }

    @Override
    public BigDecimal obracunKamate() {
        BigDecimal kamata = getStanje().multiply(BigDecimal.valueOf(0.1));
        BigDecimal stanjeSaKamatom = getStanje().add(kamata);
        setStanje(stanjeSaKamatom);
        return stanjeSaKamatom;
    }

    @Override
    public BigDecimal uplataNaRacun(int iznos) {
        BigDecimal stanjeRacunaNakonUplate = getStanje().add(BigDecimal.valueOf(iznos));
        setStanje(stanjeRacunaNakonUplate);
        return stanjeRacunaNakonUplate;
    }

    @Override
    public BigDecimal isplataSaRacuna(int iznos) {
        BigDecimal stanjeRacunaNakonIsplate = getStanje().subtract(BigDecimal.valueOf(iznos));
        setStanje(stanjeRacunaNakonIsplate);
        return stanjeRacunaNakonIsplate;
    }
}
