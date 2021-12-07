package PPJ_19_cw;


public class Main {
    public static void main(String[] args) {
        Kwadrat kwadrat1 = new Kwadrat(3);
        kwadrat1.show();

        Walec walec1 = new Walec(3,8);
        walec1.show();

        KulaW kula1 = new KulaW(kwadrat1);
        kula1.show();

        KulaNa kula2 = new KulaNa(kwadrat1);
        kula2.show();

        Owoc mango = new Owoc("Mango");
        mango.wypisz();
    }
}
