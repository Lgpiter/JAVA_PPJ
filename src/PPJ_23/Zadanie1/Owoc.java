package PPJ_23.Zadanie1;

public class Owoc {
    private String nazwa;
    private double masa = Math.random()*(50) + 100;

    public Owoc(String nazwa){
        this.nazwa = nazwa;
    }

    public double getMasa() {
        return masa;
    }

    public String getNazwa(){
        return nazwa;
    }
}
