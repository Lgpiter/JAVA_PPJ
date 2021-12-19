package dodatkowe_03;

public class Zwierzak {
    private String nazwa;
    private int waga;
    private int wiek;

    public Zwierzak(String nazwa, int wiek){
        this.wiek = wiek;
        this.nazwa = nazwa;
    }

    public void setWaga(int a){
        this.waga = a;
    }

    public void incWiek(){
        this.wiek ++;
    }

    public void show(){
        System.out.println("To zwierze jest " + nazwa + " a waży on " + waga);
    }
}
