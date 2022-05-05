package GUI_2.Zadanie1;

import GUI_2.Zadanie1.Figura;

public class Kwadrat extends Figura {
    private int bok;

    public Kwadrat(int bok){
        this.bok = bok;
    }

    public int getBok() {
        return bok;
    }

    @Override
    public double getPole() {
        return bok*bok;
    }

    @Override
    public double getObwod() {
        return 4*bok;
    }
}
