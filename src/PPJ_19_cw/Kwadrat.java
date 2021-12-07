package PPJ_19_cw;

public class Kwadrat {
    private double bok;

    public Kwadrat(double a){
        this.bok = a;
    }

    public void show(){
        System.out.println("Pole powierzchni to " + bok*bok);
        System.out.println("Objetosc szescianu to " + bok*bok*bok);
    }

    public double getbok(){
        return bok;
    }
}
