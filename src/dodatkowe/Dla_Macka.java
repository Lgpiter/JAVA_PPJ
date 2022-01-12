package dodatkowe;

public class Dla_Macka {
    public static void main(String[] args) {
        /*
        int[] tab = {0,7,12,35,41,83,6,3,2};
        uporzadkuj(tab);
        wyswietl(tab);
         */
        String[] tab2 = {"Ala", "ma", "kota", "a kot ma psa", "Ala", "ma", "fajnie"};
        wypisz_String(UsunDuplikaty(tab2));
    }

    public static int[] uporzadkuj(int[] T){
        int pom;//do zamiany
        //parzyste nierosnaco
        for (int i = 0; i < T.length; i+=2){
            for(int j = i; j < T.length; j += 2){
                if(T[j] >= T[i]){
                    pom = T[j];
                    T[j] = T[i];
                    T[i] = pom;
                }
            }
        }

        //nieparzyste nierosnaco
        for (int i = 1; i < T.length; i+=2){
            for(int j = i; j < T.length; j += 2){
                if(T[j] <= T[i]){
                    pom = T[j];
                    T[j] = T[i];
                    T[i] = pom;
                }
            }
        }

        return T;
    }

    public static void wyswietl(int[] tab){
        System.out.println("Parzyste");
        for(int i = 0; i < tab.length; i += 2){
            System.out.print(tab[i] + " ");
        }
        System.out.println();
        System.out.println("Nieparzyste");
        for(int i = 1; i < tab.length; i += 2){
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }

    public static String[] UsunDuplikaty(String[] wyrazy){
        int rozmiar = 0;

        boolean czy_ma_duplikat;
        for(int i = 0; i < wyrazy.length; i++){
            czy_ma_duplikat = false;
            for (int j = i + 1; j < wyrazy.length; j++){
                if(wyrazy[i].equals(wyrazy[j]) ){
                    czy_ma_duplikat = true;
                }
            }
            if(!czy_ma_duplikat)
                rozmiar++;
        }

        String[] wynikowa = new String[rozmiar];

       for (int i = 0,pom = 0; i < wyrazy.length; i++){
           czy_ma_duplikat = false;
           for(int j = 0; j < wynikowa.length; j++){
               if(wyrazy[i].equals(wynikowa[j]))
                   czy_ma_duplikat = true;
           }
           if(!czy_ma_duplikat)
               wynikowa[pom++] = wyrazy[i];
       }

            return wynikowa;
    }

    public static void wypisz_String(String[] tab){
        for (int i = 0; i < tab.length; i++){
            System.out.println(tab[i]);
        }
    }
}
