package PPJ_cwiczenia;

public class PPJ_15 {
    public static void main(String[] args) {
        show(231);
        int wrt = 5;
        modifyValue(wrt);
        System.out.println(wrt);
        System.out.println(findMax(48,21,7));
        char [] tab = "Ala ma kota".toCharArray();
        ile_razy(tab);
        int [] tab1 = new int[10];
        int [] tab2 = new int [20];

        for (int i = 0; i < tab1.length; i++){
            tab1[i] = (int)(Math.random()*20);
            System.out.print(tab1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < tab2.length; i++){
            tab2[i] = (int)(Math.random()*20);
            System.out.print(tab2[i] + " ");
        }
        System.out.println();
        zadanie5(tab1, tab2, -2);
        int tab_3[ ] [ ]  = {
                {  0 ,  2 ,  3 ,  4} ,
                {  5 ,  6 ,  7 ,  8} ,
                {  9 ,10 ,11 ,12}
        };

        int tab_4[ ] [ ]  = {
                {  0 ,  2 ,  3, 4, 5, 6, 7} ,
                {  5 ,  6 ,  7 ,  8} ,
                {  9 ,10 ,11, 12}
        };

        System.out.println(czy_takie_same(tab_3, tab_4));


    }

    static void show (int a){
        System.out.println(a);
    }

    static void modifyValue(int a){
        System.out.println(a);
        a *= 5;
        System.out.println(a);
    }

    static int findMax(int a, int b, int c){
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        return max;
    }

    static void ile_razy (char[] tab){
        int [] pom = new int[1000];
        for (int i = 0; i < tab.length; i++){
            pom[tab[i]]++;
        }

        for (int i = 0; i < pom.length; i++){
            if (pom[i] != 0) {
                System.out.print("Znak " + (char) i + " wystapil w napisie " + pom[i]);
                if (pom[i] == 1)
                    System.out.println(" raz");
                else
                    System.out.println(" razy");
            }

        }
    }

    static int[] zadanie5 (int[] tab1, int[] tab2, int n){
        if (tab1.length == tab2.length)//trzeci podpunkt
            return null;
        if (n < 0){
            int dlugosc = 0;
            if (tab1.length > tab2.length)
                dlugosc = tab2.length;
            else
                dlugosc = tab1.length;
            int [] tab_wynikowa = new int[dlugosc];
            for (int i = 0; i < dlugosc; i++){
                tab_wynikowa[i] = tab1[i] + tab2[i];
                System.out.print(tab_wynikowa[i] + " ");
            }
            return tab_wynikowa;
        }// pierwszy podpunkt, ktory juz dziala
        else{
            int dluzsza = 0;
            if (tab1.length > tab2.length) {
                dluzsza = tab1.length - tab2.length;
                int [] tablica_wynikowa = new int [dluzsza];

                for (int i = tab2.length, pom = 0; i < tab1.length; i++, pom++){
                    tablica_wynikowa[pom] = tab1[i];
                    System.out.print(tablica_wynikowa[pom] + " ");
                }
                return tablica_wynikowa;
            }
            else {
                dluzsza = tab2.length - tab1.length;
                int [] tablica_wynikowa = new int [dluzsza];

                for (int i = tab1.length, pom = 0; i < tab2.length; i++, pom++){
                    tablica_wynikowa[pom] = tab2[i];
                    System.out.print(tablica_wynikowa[pom] + " ");
                }
                return tablica_wynikowa;
            }
        }// drugi podpunkt
    }

    static boolean czy_takie_same(int[][] tab1, int [][] tab2){
        if (tab1.length != tab2.length)
            return false;
        for (int i = 0; i < tab1.length; i++){
            if (tab1[i].length != tab2[i].length)
                return false;
        }

        for (int i = 0; i < tab1.length;i++){
            for (int j = 0; j < tab1[i].length; j++)
                if (tab1[i][j] != tab2[i][j])
                    return false;
        }

        return true;
    }
}
