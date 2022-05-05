package GUI_3.Zadanie3;

public class Smartfon extends Urzadzenie implements GrajWGry, Internet,Sms, Zadzwon{
    boolean czyMaInternet;
    boolean czyMaSim;
    public Smartfon(double cena, String nazwaProducenta,boolean czyMaInternet, boolean czyMaSim) {
        super(cena, nazwaProducenta);
        this.czyMaInternet = czyMaInternet;
        this.czyMaSim = czyMaSim;
    }

    @Override
    public void graj() {
        if(czyMaInternet)
            System.out.println("Odpalam gre ...");
        else
            System.out.println("Nie mozna grac bez podlaczenia do internetu");
    }

    @Override
    public void uzyjInternetu() {
        if(czyMaInternet)
            System.out.println("Odpalam przegladarke");
        else
            System.out.println("Nie masz podlaczenia do internetu");
    }

    @Override
    public void napiszSms() {
        if(czyMaSim)
            System.out.println("Wysylam sms do ...");
        else
            System.out.println("Nie ma karty sim");
    }

    @Override
    public void zadzwon() {
        if(czyMaSim)
            System.out.println("Dzwonie do...");
        else
            System.out.println("Nie ma karty sim");
    }
}
