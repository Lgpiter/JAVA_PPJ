package PPJ_cwiczenia;

public class PPJ_14 {
    public static void main(String[] args) {
        int[] tab = {10, 20, 30, 40, 50};
        int fill = 5;

        // usunac 1
        {
            int delIndex = 1;

            for (int i = delIndex; i < fill - 1; i++) {
                tab[i] = tab[i + 1];
            }
            fill -= 1;
        }
        System.out.print("[");
        for(int wrt : tab)
            System.out.print(" "+wrt);
        System.out.println("]");
        System.out.print("[");
        for(int i = 0;  i < fill; i++)
            System.out.print(" "+tab[i]);
        System.out.println("]");
    }

    static void zadanie1() {
        int[] tablica_x = {1, 5, 8, 31, 40, 22, 31, 0};
        int[] tablica_y = {9, 14, 27, 52, 2, 11, 6, 19};

        int min_x = tablica_x[0];
        int max_x = tablica_x[0];
        int min_y = tablica_y[0];
        int max_y = tablica_y[0];

        for (int i = 0; i < tablica_x.length; i++) {
            if (tablica_x[i] > max_x)
                max_x = tablica_x[i];
            if (tablica_x[i] < min_x)
                min_x = tablica_x[i];
            if (tablica_y[i] > max_y)
                max_y = tablica_y[i];
            if (tablica_y[i] < min_y)
                min_y = tablica_y[i];
        }

        double wspolrzedna_x = (min_x + max_x) / 2;
        double wspolrzedna_y = (max_y + min_y) / 2;

        System.out.println("A zatem lewy gorny rog prostokata ma wspolrzedne (" + min_x + ", " +
                max_y + ")");
        System.out.println("Prawy gorny rog prostokata ma wspolrzedne (" + max_x + ", " + max_y + ")");
        System.out.println("Lewy dolny rog prostokata ma wspolrzedne (" + min_x + ", " +
                min_y + ")");
        System.out.println("Prawy dolny rog prostokata ma wspolrzedne (" + max_x + ", " + min_y + ")");
        System.out.println("Wspolrzedne srodka prostokata to (" + wspolrzedna_x + ", " + wspolrzedna_y + ")");
        System.out.println("Wysokosc tego prostokata to " + (max_y - min_y));
        System.out.println("Szerekosc tego prostokata to " + (max_x - min_x));
    }

    static void zadanie2() {
        int[] tablicaA = {1, 3, 5, 9, 12, 19, 31, 48, 93};
        int[] tablicaB = {96, 68, 59, 44, 31, 4};
        int[] tablicaC = new int[tablicaA.length + tablicaB.length];


        for (int i = 0, pomA = 0, pomB = tablicaB.length - 1; i < tablicaC.length; i++) {
            if (pomA == tablicaA.length) {
                tablicaC[i]  = tablicaB[pomB];
                pomB--;
            }
            else {
                if(pomB == - 1){
                    tablicaC[i] = tablicaA[pomA];
                    pomA++;
                }
                else {
                    if (tablicaA[pomA] < tablicaB[pomB]) {
                        tablicaC[i] = tablicaA[pomA];
                        pomA++;
                    } else {
                        tablicaC[i] = tablicaB[pomB];
                        pomB--;
                    }
                }
            }
            System.out.print(tablicaC[i] + " ");
        }
    }

    static void wypisywanie(int tab[][], int k, int n){
        //lewy górny rog
        System.out.print(tab[k][k] + " ");
        //gorna krawedz
        for (int i = k + 1; i < n - k - 1; i++)
            System.out.print(tab[k][i] + " ");
        //prawy gorny rog
        System.out.print(tab[k][n - k - 1] + " ");
        //prawa krawedz
        for (int i = k + 1; i < n - k - 1; i++)
            System.out.print(tab[i][n - k - 1] + " ");
        //prawy dolny rog
        System.out.print(tab[n - k - 1][n - k - 1] + " ");
        //dolna krawedz
        for (int i = n - k - 2; i >= k + 1; i--)
            System.out.print(tab[n - k - 1][i] + " ");
        //lewy dolny rog
        System.out.print(tab[n - k - 1][k] + " ");
        //lewa krawędź
        for (int i = n - k - 2; i >= k + 1; i--){
            System.out.print(tab[i][k] + " ");
        }
    }

    static void zadanie3(){
        int tab[ ] [ ]  = {
                {  1 ,  2 ,  3 ,  4} ,
                {  5 ,  6 ,  7 ,  8} ,
                {  9 , 10 , 11 , 12} ,
                { 13 , 14 , 15 , 16}
        };

        for (int i = 0; i < (tab.length/2); i++)
            wypisywanie(tab, i , tab.length);
        if (tab.length % 2 == 1)
            System.out.print(tab[tab.length/2][tab.length/2] + " ");
    }
}
