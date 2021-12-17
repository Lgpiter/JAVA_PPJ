package PPJ_22.Zadanie4;

public class DrzewoIglaste
    extends Drzewo{
    private int iloscIgiel;
    private double dlugoscSzyszki;

    public DrzewoIglaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int iloscIgiel, int dlugoscSzyszki){
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.iloscIgiel = iloscIgiel;
        this.dlugoscSzyszki = dlugoscSzyszki;
    }

    public String toString(){
        return super.toString() + " na tym drzewie jest " + iloscIgiel + " igiel, a dlugosc szyszki na nim to " + dlugoscSzyszki + " cm";
    }
}
