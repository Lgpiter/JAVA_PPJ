package PPJ_23.Zadanie2;

public class Telefon {
    private String interfejsKomunikacyjny;
    private String color;

    public Telefon(String interfejsKomunikacyjny, String color){
        this.interfejsKomunikacyjny = interfejsKomunikacyjny;
        this.color = color;
    }

    public void zadzwon(String numer){
        System.out.println("Calling " + numer);
    }

    public void wyswietlHistoriePolaczen(){
        System.out.println("brak historii");
    }
}
