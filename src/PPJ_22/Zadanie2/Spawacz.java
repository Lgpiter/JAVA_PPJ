package PPJ_22.Zadanie2;

public class Spawacz
    extends Osoba{

    private int stazpracy;

    public Spawacz(String imie,int stazpracy){
        super(imie);
        this.stazpracy = stazpracy;
    }

    public String wyswietl(){
        super.wyswietl();
        System.out.println(" a jego staz pracy to " + stazpracy);
        return " A jego staz pracy to " + stazpracy;
    }
}
