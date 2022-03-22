package GUI_2.Zadanie1;

import GUI_2.Zadanie1.Figura;

public class Prostokat extends Figura {
    private int a;
    private int b;

    public Prostokat(int a, int b){
        this.a = a;
        this.b = b;
    }
    @Override
    public double getPole() {
        return 0;
    }

    @Override
    public double getObwod() {
        return 0;
    }
}
