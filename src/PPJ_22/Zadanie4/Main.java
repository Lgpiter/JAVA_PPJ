package PPJ_22.Zadanie4;

public class Main {
    public static void main(String[] args) {
        /*
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
        System.out.println(jablon.toString());*/

        //Zadanie 1 ppj_24
        Drzewo[] las = new Drzewo[30];
        for(int i = 0; i < las.length; i++){
            if(i % 6 == 0)
                las[i] = new DrzewoIglaste(true, 10, "jodla",1000,15);
            if(i % 6 == 1)
                las[i] = new DrzewoIglaste(true, 7, "modrzew",900,10);
            if(i % 6 == 2)
                las[i] = new DrzewoLisciaste(false,15,"dab", 8);
            if(i % 6 == 3)
                las[i] = new DrzewoLisciaste(false, 11,"osiki", 7);
            if(i % 6 == 4)
                las[i] = new DrzewoOwocowe(false,5,"morelowiec", 7, "morela");
            if(i % 6 == 5)
                las[i] = new DrzewoOwocowe(false,3,"sliwa",6,"sliwka");
            System.out.println(las[i].toString());
        }

        try {
            las[3].zerwijOwoc();
        }catch (DrzewoBezOwocoweException ex){
            ex.printStackTrace();
        }
    }
}
