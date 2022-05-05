package GUI_2.Zadanie1;

import GUI_2.Zadanie1.Figura;

public class Kolo extends Figura {
    private double r;

    public Kolo (double r){
        this.r = r;
    }

    public double getR() {
        return r;
    }

    @Override
    public double getPole() {
        return Math.PI * r* r;
    }

    @Override
    public double getObwod() {
        return 2 * Math.PI * r;
    }
}
