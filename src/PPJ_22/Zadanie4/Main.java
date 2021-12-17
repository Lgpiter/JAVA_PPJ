package PPJ_22.Zadanie4;

public class Main {
    public static void main(String[] args) {
        DrzewoIglaste jodla = new DrzewoIglaste(
                true, 5, "Ladny przekroj", 15000, 13
                );
        DrzewoLisciaste klon = new DrzewoLisciaste(
                false, 8, "Dzwiny przekroj", 2
        );
        DrzewoOwocowe jablon = new DrzewoOwocowe(
                false,3,"brzydki przekroj", 1 , "jablko"
        );
        System.out.println(klon.toString());
        System.out.println(jodla.toString());
        System.out.println(jablon.toString());
    }
}
