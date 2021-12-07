package PPJ_19_cw;

public class Owoc {
    public String nazwa;
    public double waga;

    public Owoc(String nazwa){
        this.nazwa = nazwa;
        this.waga = Math.random()*(0.3) + 0.5;
    }

    public void wypisz(){
        System.out.println("Twoj owoc to " + nazwa + " i wazy on " + waga);
    }
}
