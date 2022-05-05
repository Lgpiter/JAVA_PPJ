package GUI_3.Zadanie3;

public class Konsola extends Urzadzenie implements GrajWGry, Internet{
    boolean czyMaInternet;
    public Konsola(double cena, String nazwaProducenta, boolean czyMaInternet) {
        super(cena, nazwaProducenta);
        this.czyMaInternet = czyMaInternet;
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
}
