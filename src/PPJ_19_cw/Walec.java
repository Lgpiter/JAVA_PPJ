package PPJ_19_cw;

public class Walec {
    private double promien;
    private double wysokosc;

    public Walec(double r, double h){
        this.promien = r;
        this.wysokosc = h;
    }

    public void show(){
        System.out.println("Pole powierzchni podstawi jest rowne " + promien*promien*Math.PI);
        System.out.println("Objetosc walca jest rowna " + promien*promien*Math.PI*wysokosc);
    }

    public double getWysokosc(){
        return wysokosc;
    }

    public double getPromien(){
        return promien;
    }
}
