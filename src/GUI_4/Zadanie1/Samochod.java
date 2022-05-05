package GUI_4.Zadanie1;

public class Samochod {
    private String nr_rejestracyjny;
    public Marka marka;

    public Samochod(String nr_rejestracyjny, Marka marka){
        this.nr_rejestracyjny = nr_rejestracyjny;
        this.marka = marka;
    }

    public String getNr_rejestracyjny() {
        return nr_rejestracyjny;
    }

    public enum Marka {
        SKODA,
        MAZDA,
        BMW,
        VOLVO
    }

    @Override
    public String toString() {
        return nr_rejestracyjny + " " + marka;
    }
}
