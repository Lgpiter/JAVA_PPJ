package GUI_3.Zadanie3;

public class TelefonKomorkowy extends Urzadzenie implements Sms,Zadzwon{

    boolean czySim;
    public TelefonKomorkowy(double cena, String nazwaProducenta, boolean czySim) {
        super(cena, nazwaProducenta);
        this.czySim = czySim;
    }

    @Override
    public void napiszSms() {
        if(czySim)
            System.out.println("Wysylam sms do ...");
        else
            System.out.println("Nie ma karty sim");
    }

    @Override
    public void zadzwon() {
        if(czySim)
            System.out.println("Dzwonie do...");
        else
            System.out.println("Nie ma karty sim");
    }
}
