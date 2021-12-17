package PPJ_22.Zadanie2;

public class Osoba {
    private String imie;

    public Osoba(String imie){this.imie = imie;}

    public String wyswietl(){
        System.out.print("Imie pracownika to " + imie);
        return imie;
    }

}
