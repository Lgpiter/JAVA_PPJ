package PPJ_19_cw;


public class Dzem {
    private String smak;
    private double waga;

    public Dzem(String smak, double waga){
        this.smak = smak;
        this.waga = waga;
    }

    public Dzem(double waga){
        this("No name", waga);
    }

    public Dzem(String smak){
        this(smak, 100.0);
    }
}
