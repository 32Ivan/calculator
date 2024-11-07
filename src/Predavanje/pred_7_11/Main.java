package Predavanje.pred_7_11;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Racun josinTekuciRacun = new TekuciRacun("234", BigDecimal.valueOf(20), "Joso");

        BigDecimal iznosTekucegRacunaSaKamatom = josinTekuciRacun.obracunKamate();


        System.out.println("iznosTekucegRacunaSaKamatom " + iznosTekucegRacunaSaKamatom);

        System.out.println("iznos tekuceg racuna nakon isplate " + josinTekuciRacun.isplataSaRacuna(10));

        System.out.println("iznos tekuceg racuna nakon isplate " + josinTekuciRacun.uplataNaRacun(12));

        System.out.println("---");

        Racun josinStedniRacun = new StedniRacun("234423", BigDecimal.valueOf(10), "Joso");

        BigDecimal iznosStednogRacunaSaKamatom = josinStedniRacun.obracunKamate();

        System.out.println("iznosStednogRacunaSaKamatom " + iznosStednogRacunaSaKamatom);

        System.out.println("iznos stednog racuna nakon isplate " + josinStedniRacun.isplataSaRacuna(35));

        System.out.println("iznos stednog racuna nakon uplate " + josinStedniRacun.uplataNaRacun(22));

    }
}
