package PPJ_19_cw;

public class Sloik {
    Dzem dzem;
    int licznik_otwarc = 0;
    int licznik_zamkniec = 0;

    public Sloik(Dzem a){
        this.dzem = a;
        otworz();
        czyOtwarty();
        System.out.println("A zatem Czu sloik jest otwarty is " + czyOtwarty());
    }

    public void otworz(){
        System.out.println("Sloik zostal otwarty");
        licznik_otwarc++;
    };
    public void zamknij(){
        System.out.println("Sloik zostal zamkniety");
        licznik_zamkniec++;
    };
    public boolean czyOtwarty(){
        if(licznik_otwarc > licznik_zamkniec)
            return true;
        else
            return false;
    };
}
