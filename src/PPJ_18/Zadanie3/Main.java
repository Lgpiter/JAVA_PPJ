package PPJ_18.Zadanie3;

public class Main {
    public static void main(String[] args) {

        Donkey donkey = new Donkey();
        int licznik_balonow = 0;

        while (!donkey.isFlying()){
            Balloon balloon_w_petli = new Balloon();
            donkey.addBaloon(balloon_w_petli);
            licznik_balonow++;
        }
        System.out.println("Ja latam!!!");
        System.out.println("Do podniesienia osla potrzebne bylo " + licznik_balonow);
    }
}
