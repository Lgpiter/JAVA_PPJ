package PPJ_22.Zadanie3;

public class PojazdKolowy
    extends Pojazd{
    private int ilosc_osi;

    public PojazdKolowy(String color, int ilosc_osi){
        super(color);
        this.ilosc_osi = ilosc_osi;
    }

    public int getIlosc_osi(){return ilosc_osi;}
}
