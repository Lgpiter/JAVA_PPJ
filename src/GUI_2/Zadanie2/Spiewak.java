package GUI_2.Zadanie2;

public abstract class Spiewak {
    private String imie;
    private static int numer_startowy = 1;
    int numer_danego;

    public Spiewak(String imie){
        this.imie = imie;
        numer_danego = this.numer_startowy++;
    }

    public int getNumer_startowy() {
        return numer_startowy;
    }

    abstract String spiewaj();

    @Override
    public String toString() {
        return "(" + this.numer_danego + ") " + this.imie + ": " + spiewaj();
    }

    public static String najglosniej(Spiewak sp[]){
        int licznik_duzych_liter = 0;
        int najwiekszy_indeks = 0;

        for (int i = 0; i < sp.length; i++) {
            int licznik = 0;
            char[] tekst = sp[i].spiewaj().toCharArray();
           for(int j = 0; j < tekst.length; j++){
               if(tekst[j] >= 'A' && tekst[j] <= 'Z')
                   licznik++;
           }

           if(licznik > licznik_duzych_liter) {
               najwiekszy_indeks = i;
               licznik_duzych_liter = licznik;
           }
        }

        return sp[najwiekszy_indeks].toString();
    };
}
