package GUI_3.Zadanie3;

public class TelefonStacjonarny extends Urzadzenie implements Zadzwon{


    public TelefonStacjonarny(double cena, String nazwaProducenta) {
        super(cena, nazwaProducenta);
    }

    @Override
    public void zadzwon() {
        System.out.println("Dzwonie do ...");
    }
}
