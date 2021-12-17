package PPJ_22.Zadanie1;

public class Prostokat {
    private int bok_a;
    private int bok_b;


    public Prostokat(int bok_a, int bok_b){
        this.bok_a = bok_a;
        this.bok_b = bok_b;
    }

    public void show(){
        System.out.println("Pole prostokata jest rowne " + (bok_a * bok_b));
    }

    public int getBok_a(){
        return bok_a;
    }

    public int getBok_b(){
        return bok_b;
    }
}
