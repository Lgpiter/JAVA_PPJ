package PPJ_22.Zadanie1;

public class Main {
    public static void main(String[] args) {
        Prostokat prostokat1 = new Prostokat(5, 10);
        prostokat1.show();
        Prostopadloscian prostopadloscian1 = new Prostopadloscian(prostokat1.getBok_a(), prostokat1.getBok_b(), 12);
        prostopadloscian1.showProstopadloscian();
        Trojkat trojkat1 = new Trojkat(7);
        trojkat1.show();
        Ostroslup ostroslup1 = new Ostroslup(trojkat1.getBok_trojkata(), 15);
        ostroslup1.showOstroslup();
        Graniastoslup graniastoslup1 = new Graniastoslup(trojkat1.getBok_trojkata(), 20);
        graniastoslup1.showGraniastoslupa();
    }

}
