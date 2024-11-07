package Predavanje.pred_7_11;

import java.math.BigDecimal;

public class StedniRacun extends Racun {


    public StedniRacun(String brojRacuna, BigDecimal stanje, String vlasnik) {
        super(brojRacuna, stanje, vlasnik);
    }

    @Override
    public BigDecimal obracunKamate() {
        BigDecimal kamata = getStanje().multiply(BigDecimal.valueOf(1.5));
        BigDecimal stanjeSaKamatom = getStanje().add(kamata);
        setStanje(stanjeSaKamatom);
        return stanjeSaKamatom;
    }
    
}
