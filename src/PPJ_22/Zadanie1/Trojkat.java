package PPJ_22.Zadanie1;

public class Trojkat {
    private int bok_trojkata;

    public Trojkat(int a){
        this.bok_trojkata = a;
    }

    public void show(){
        double pole = (Math.pow(bok_trojkata,2)*Math.sqrt(3))/4;
        System.out.println("Pole trojkata jest rowne " + pole);
    }

    public int getBok_trojkata(){
        return bok_trojkata;
    }
}
