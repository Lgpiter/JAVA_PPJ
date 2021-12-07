package dodatkowe;

public class douczka {
    public static void main(String[] args) {
        //Zadanie1
        /*{
            char[] do_odwrocenia = {'a', 'b', 'c', 'd'};
            char pom;

            for (int i = 0; i < do_odwrocenia.length/2; i++) {
                pom = do_odwrocenia[i];
                do_odwrocenia[i] = do_odwrocenia[do_odwrocenia.length - 1 - i];
                do_odwrocenia[do_odwrocenia.length - 1 - i] = pom;
            }

            for (char x : do_odwrocenia)
                System.out.println(x);
        }*/

        //Zadanie 2
        /*{
            int[] tab = {1,2,3,4,4,3,2,1, 1};
            boolean czy_jest = true;

            for (int i = 0; i < tab.length/2; i++){
                if(tab[i] != tab[tab.length - i - 1]){
                    czy_jest = false;
                }
            }
            System.out.println(czy_jest);
        }*/

        //Zadanie3
        /*{
            int [] tab = {100, 97, 3 , 12 ,12321, 2324, 1, 1};

            int ile_parzystych = 0;
            int ile_nieparzystych = 0;

            for(int i = 0; i < tab.length; i++){
                if(tab[i] % 2 == 0)
                    ile_parzystych++;
                else
                    ile_nieparzystych++;
            }

            int[] tab_parzystych = new int[ile_parzystych];
            int[] tab_nieparzystych = new int[ile_nieparzystych];
            int pom_parzyste = 0;
            int pom_nieparzyste = 0;

            for(int i = 0; i < tab.length; i++){
                if(tab[i] % 2 == 0)
                    tab_parzystych[pom_parzyste++] = tab[i];
                else
                    tab_nieparzystych[pom_nieparzyste++] = tab[i];
            }
            System.out.println("\ntablica parzystych");

            for (int x : tab_parzystych)
                System.out.print(x + " ");

            System.out.println("tablica nieparzystych");
            for (int x : tab_nieparzystych)
                System.out.print(x + " ");
        }*/

        //Zadanie 1 trudne
        /*{
            int w_dziesietnym = 1271;
            int kopia_dziesietnej = w_dziesietnym;
            int rozmiar_tablicy = 0;

            while(kopia_dziesietnej > 0){
                kopia_dziesietnej /= 8;
                rozmiar_tablicy++;
            }
            char[] tablica_pom = new char[rozmiar_tablicy];
            int pom = 1;

            while (w_dziesietnym > 0){
                tablica_pom[tablica_pom.length - pom] = (char)(w_dziesietnym % 8);
                w_dziesietnym /= 8;
                pom++;
            }

            for (int i = 0; i < tablica_pom.length; i++){
                System.out.print((int)tablica_pom[i]);
            }

        }*/

        //Zadanie 2 trudne
        {
            char[] znaki = {'k', 'o', 'k' , 'o', 's'};

            int [] tablica_pomocnicza = new int[1_000];

            for (int i = 0; i < znaki.length; i++){
                int wartoscAscii = znaki[i];
                tablica_pomocnicza[wartoscAscii]++;
            }

            for (int i = 0; i < tablica_pomocnicza.length; i++){
                if(tablica_pomocnicza[i] != 0){
                    System.out.println("Litera " + (char)i + " wystapila w wyrazie " + tablica_pomocnicza[i]);
                }
            }
        }
    }
}
