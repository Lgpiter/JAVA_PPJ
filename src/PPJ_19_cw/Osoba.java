package PPJ_19_cw;

public class Osoba {
    public String imie;
    public int rokUrodzenia;

    public Osoba(String imie, int rokUrodzenia){
        this.imie = imie;
        this.rokUrodzenia = rokUrodzenia;
    }

    public Osoba(String imie){
        this.imie = imie;
        this.rokUrodzenia = 1990;
    }

    public int zwrocRokUrodzenia(){
        return rokUrodzenia;
    }

    public String zwrocImie(){return imie;}
    
    static Osoba zwrocStarszaOsobe(Osoba a, Osoba b){
        int wiek_a = a.zwrocRokUrodzenia();
        if(b.zwrocRokUrodzenia() > wiek_a)
            return b;
        else 
            return a;
    }
    
    static Osoba zwrocNajstarszaOsobe(Osoba[] tablica_osob){
        int max = 0;
        Osoba zwracana = null;
        for (int i = 0; i < tablica_osob.length; i++){
            if(tablica_osob[i].zwrocRokUrodzenia() > max){
                zwracana = tablica_osob[i];
                max = tablica_osob[i].zwrocRokUrodzenia();
            }                
        }
        return zwracana;
    }
}
