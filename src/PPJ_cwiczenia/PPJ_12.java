package PPJ_cwiczenia;
import java.util.Random;

public class PPJ_12 {
    public static void main(String[] args){
        zadanie4();
    }

    static void zadanie1(){
        int[] tab = {1,2,3,4,4,3,2,1};
        boolean czy_Palindrom = true;

        if(tab.length % 2 != 0)
            czy_Palindrom = false;
        else{
            for (int i = 0; i < tab.length/2; i++){
                if (czy_Palindrom) {
                    if (tab[i] != tab[tab.length - i - 1]) {
                        czy_Palindrom = false;

                    } else {
                        czy_Palindrom = true;
                    }
                }
            }
        }
        System.out.println(czy_Palindrom);
    }

    static void zadanie2(){
        Random r = new Random();
        boolean[] tablica = new boolean[10];
        int randomowa = r.nextInt(2);

        int ile_true = 0;
        int ile_false = 0;

        for (int i = 0; i < tablica.length; i++){
            if (randomowa % 2 == 0) {
                tablica[i] = true;
                ile_true++;
            }
            else {
                tablica[i] = false;
                ile_false++;
            }
            randomowa = r.nextInt(2);
        }

        System.out.println("Tablica poczatkowa:");

        for (int i = 0; i < tablica.length; i++){
            System.out.print(tablica[i] + " ");
        }
        System.out.println();
        boolean[] tablica_1 = new boolean[ile_true];
        boolean[] tablica_2 = new boolean[ile_false];

        System.out.println("Tablica z true ");
        for(int i = 0; i < tablica_1.length; i++){
            tablica_1[i] = true;
            System.out.print(tablica_1[i] + " ");
        }

        System.out.println("\nTablica z false");
        for(int i = 0; i < tablica_2.length; i++){
            tablica_1[i] = false;
            System.out.print(tablica_2[i] + " ");
        }

    }

    static boolean pomocnicza(long[] tablica){
        for (int i = 1; i < tablica.length; i++) {
            if(tablica[i] - tablica[i - 1] == 1)
                return false;
        }
        return true;
    }

    static void zadanie3(){
        Random r= new Random();
        long[] tablica = new long[12];
        tablica[0] = 1356;

        for(int i = 1; i < tablica.length; i++){
            tablica[i] = tablica[i-1] + 1;
            System.out.println(tablica[i]);
        }
        boolean czy_blisko = true;
        boolean w_tablicy = false;
        int losowanie_1 = r.nextInt(tablica.length);
        int losowanie_2 = r.nextInt(tablica.length);
        System.out.println("LOSOWANIE 1 " + tablica[losowanie_1]);
        System.out.println("LOSOWANIE 2 " + tablica[losowanie_2]);
        long pom;
        int k = 0;

        while(czy_blisko){
            pom = tablica[losowanie_1];
            tablica[losowanie_1] = tablica[losowanie_2];
            tablica[losowanie_2] = pom;


            w_tablicy = pomocnicza(tablica);

            if (w_tablicy)
                czy_blisko = false;
            losowanie_1 = r.nextInt(tablica.length);
            losowanie_2 = r.nextInt(tablica.length);
        }

        System.out.println("Sprawdzenie czy sie udalo");
        for(int i = 0; i < tablica.length; i++){
            System.out.println(tablica[i]);
        }

    }

    static boolean czy_krzyzyk (boolean a, boolean b){
        if(a && b)
            return true;
        else
            return false;
    }

    static boolean czy_kolko (boolean a, boolean b){
        if(a && !b)
            return true;
        else
            return false;
    }

    static boolean konczenie_gry(boolean[] tablica_wynikowa, boolean[] tablica_planszowa){

        if (czy_kolko(tablica_wynikowa[0], tablica_planszowa[0]) &&
                czy_kolko(tablica_wynikowa[1], tablica_planszowa[1]) &&
                czy_kolko(tablica_wynikowa[2], tablica_planszowa[2]))
            return true;
        if (czy_krzyzyk(tablica_wynikowa[0], tablica_planszowa[0]) &&
                czy_krzyzyk(tablica_wynikowa[1], tablica_planszowa[1]) &&
                czy_krzyzyk(tablica_wynikowa[2], tablica_planszowa[2]))
            return true;
        if (    czy_kolko(tablica_wynikowa[3], tablica_planszowa[3]) &&
                czy_kolko(tablica_wynikowa[4], tablica_planszowa[4]) &&
                czy_kolko(tablica_wynikowa[5], tablica_planszowa[5]))
            return true;
        if (    czy_krzyzyk(tablica_wynikowa[3], tablica_planszowa[3]) &&
                czy_krzyzyk(tablica_wynikowa[4], tablica_planszowa[4]) &&
                czy_krzyzyk(tablica_wynikowa[5], tablica_planszowa[5]))
            return true;
        if (    czy_kolko(tablica_wynikowa[6], tablica_planszowa[6]) &&
                czy_kolko(tablica_wynikowa[7], tablica_planszowa[7]) &&
                czy_kolko(tablica_wynikowa[8], tablica_planszowa[8]))
            return true;
        if (    czy_krzyzyk(tablica_wynikowa[6], tablica_planszowa[6]) &&
                czy_krzyzyk(tablica_wynikowa[7], tablica_planszowa[7]) &&
                czy_krzyzyk(tablica_wynikowa[8], tablica_planszowa[8]))
            return true;
        if (    czy_kolko(tablica_wynikowa[0], tablica_planszowa[0]) &&
                czy_kolko(tablica_wynikowa[3], tablica_planszowa[3]) &&
                czy_kolko(tablica_wynikowa[6], tablica_planszowa[6]))
            return true;
        if (    czy_krzyzyk(tablica_wynikowa[0], tablica_planszowa[0]) &&
                czy_krzyzyk(tablica_wynikowa[3], tablica_planszowa[3]) &&
                czy_krzyzyk(tablica_wynikowa[6], tablica_planszowa[6]))
            return true;
        if (    czy_kolko(tablica_wynikowa[1], tablica_planszowa[1]) &&
                czy_kolko(tablica_wynikowa[4], tablica_planszowa[4]) &&
                czy_kolko(tablica_wynikowa[7], tablica_planszowa[7]))
            return true;
        if (    czy_krzyzyk(tablica_wynikowa[1], tablica_planszowa[1]) &&
                czy_krzyzyk(tablica_wynikowa[4], tablica_planszowa[4]) &&
                czy_krzyzyk(tablica_wynikowa[7], tablica_planszowa[7]))
            return true;
        if (    czy_kolko(tablica_wynikowa[2], tablica_planszowa[2]) &&
                czy_kolko(tablica_wynikowa[5], tablica_planszowa[5]) &&
                czy_kolko(tablica_wynikowa[8], tablica_planszowa[8]))
            return true;
        if (    czy_krzyzyk(tablica_wynikowa[2], tablica_planszowa[2]) &&
                czy_krzyzyk(tablica_wynikowa[5], tablica_planszowa[5]) &&
                czy_krzyzyk(tablica_wynikowa[8], tablica_planszowa[8]))
            return true;
        if (    czy_kolko(tablica_wynikowa[0], tablica_planszowa[0]) &&
                czy_kolko(tablica_wynikowa[4], tablica_planszowa[4]) &&
                czy_kolko(tablica_wynikowa[8], tablica_planszowa[8]))
            return true;
        if (    czy_krzyzyk(tablica_wynikowa[0], tablica_planszowa[0]) &&
                czy_krzyzyk(tablica_wynikowa[4], tablica_planszowa[4]) &&
                czy_krzyzyk(tablica_wynikowa[8], tablica_planszowa[8]))
            return true;
        if (    czy_kolko(tablica_wynikowa[2], tablica_planszowa[2]) &&
                czy_kolko(tablica_wynikowa[4], tablica_planszowa[4]) &&
                czy_kolko(tablica_wynikowa[6], tablica_planszowa[6]))
            return true;
        if (    czy_krzyzyk(tablica_wynikowa[2], tablica_planszowa[2]) &&
                czy_krzyzyk(tablica_wynikowa[4], tablica_planszowa[4]) &&
                czy_krzyzyk(tablica_wynikowa[6], tablica_planszowa[6]))
            return true;

        int licznik_true = 0;
        for (int i = 0; i < tablica_wynikowa.length; i++){
            if(tablica_wynikowa[i] == true)
                licznik_true++;
        }
        if (licznik_true == 9)
            return true;


        return false;
    } // to dopiero jest wstyd pokazac

    static void wypisywanie_planszy(boolean[] tablica_wynikowa, boolean[] tablica_planszowa){
        for (int i = 0; i < tablica_wynikowa.length; i++){
            if(i == 2 || i == 5) {
                if(tablica_wynikowa[i] == false && tablica_planszowa[i] == false)
                    System.out.print(" PUSTE ");
                else if(tablica_wynikowa[i] == true && tablica_planszowa[i] == true)
                    System.out.print(" KRZYZYK ");
                else if (tablica_wynikowa[i] == true && tablica_planszowa[i] == false)
                    System.out.print(" KOLKO ");
                System.out.println();
            }
            else{
                if(tablica_wynikowa[i] == false && tablica_planszowa[i] == false)
                    System.out.print(" PUSTE ");
                else if(tablica_wynikowa[i] == true && tablica_planszowa[i] == true)
                    System.out.print(" KRZYZYK ");
                else if (tablica_wynikowa[i] == true && tablica_planszowa[i] == false)
                    System.out.print(" KOLKO ");
            }
        }
    }

    static void zadanie4(){
        java.util.Scanner in = new java.util.Scanner(System.in);
        boolean[] tablica_wynikowa = new boolean[9];
        boolean[] tablica_planszowa = new boolean[9];
        boolean koniec_gry = false;
        boolean wpisanie = false;
        int miejsce;
        int przypisanie_kolko_krzyzyk;
        int pom = 0;

        System.out.println("Plansza wyglada tak ");
        for (int i = 0; i <9; i += 3){
            for(int j = 0; j < 3 ;j++)
                System.out.print(i + j +" ");
            System.out.println();
        }

        wypisywanie_planszy(tablica_wynikowa,tablica_planszowa);

        while(!koniec_gry){

            if(pom%2 != 0){
                System.out.println("\nTeraz gra krzyzyk, wybierz miejsce, w ktore chcesz je wstawic (przypominam, ze od 0 do 8)");
                miejsce = in.nextInt();

                while(miejsce > 8){
                    System.out.println("Wpisales za duza liczbe i wykroczyles poza plansze sprobuj jeszcze raz");
                    miejsce = in.nextInt();
                }

                if (tablica_wynikowa[miejsce]){
                    while(tablica_wynikowa[miejsce]){
                        System.out.println("To miejsce bylo juz zajete, sprobuj jeszcze raz");
                        miejsce = in.nextInt();
                    }
                }

                wpisanie = true;
            }
            else{
                System.out.println("\nTeraz gra kolko, wybierz miejsce, w ktore chcesz je wstawic (przypominam, ze od 0 do 8)");
                miejsce = in.nextInt();

                while(miejsce > 8){
                    System.out.println("Wpisales za duza liczbe i wykroczyles poza plansze sprobuj jeszcze raz");
                    miejsce = in.nextInt();
                }

                if (tablica_wynikowa[miejsce]){
                    while(tablica_wynikowa[miejsce]){
                        System.out.println("To miejsce bylo juz zajete, sprobuj jeszcze raz");
                        miejsce = in.nextInt();
                    }
                }

                wpisanie = false;
            }
            pom++;


            tablica_wynikowa[miejsce] = true;
            tablica_planszowa[miejsce] = wpisanie;

            wypisywanie_planszy(tablica_wynikowa,tablica_planszowa);

            koniec_gry = konczenie_gry(tablica_wynikowa,tablica_planszowa);
        }
    }
}
