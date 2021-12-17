package PPJ_22.Zadanie3;

public class CiagnikSiodlowy
    extends PojazdKolowy{

    private int masa;

    public CiagnikSiodlowy(String color, int ilosc_osi, int masa){
        super(color, ilosc_osi);
        this.masa = masa;
    }

    public void rozpocznijJazde(){
        if(masa/getIlosc_osi() > 11000){
            System.out.println("Jazda niebezpieczna, odmowa uruchomienia silnika");
        }
        else {
            System.out.println("Ruszamy w droge!");
        }
    }
}
