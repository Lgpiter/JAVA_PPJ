package PPJ_cwiczenia;

public class PPJ_16 {
    public static void main(String[] args) {
        char[] tab = {'k', 'a', 'j', 'a', 'k'};
        wypisz_od_srodka(tab, 0, 0);
    }

    static int[] splitToDigits (int n){
        int rozmiar = 0;
        int pom = n;
        while (pom > 0){
            rozmiar++;
            pom /= 10;
        }

        int [] tab_wynikowa = new int[rozmiar];
        for (int i = rozmiar - 1; i >= 0; i--){
            tab_wynikowa[i] = n % 10;

            n /= 10;
        }

        for (int i = 0; i < rozmiar; i++)
            System.out.print(tab_wynikowa[i] + " ");
        return tab_wynikowa;
    }

    static boolean isArmstrongNumber (int n){
        int rozmiar = 0;
        int pom = n;// pierwszy pom do ustalenia rozmiaru liczby
        int pom2 = n; //drugi pom do porownania na koniec czy n == suma
        int suma = 0;
        while (pom > 0){
            rozmiar++;
            pom /= 10;
        }

        while (n > 0){
            suma += Math.pow(n % 10, rozmiar);
            n /= 10;
        }

        if (suma == pom2)
            return true;
        else
            return false;
    }

    public static int[][] calculateSquares (int screenWidth, int screenHeight, int side){
        int na_x = screenWidth/side;
        int na_y = screenHeight/side;
        int ile_sie_zmiesci = na_x * na_y;
        System.out.println("ILE SIE ZMIESCI JEST ROWNE" + ile_sie_zmiesci);//rozmiar jest dobrze dobrany
        int tab[][] = new int[ile_sie_zmiesci][2];

        for (int j = 0, pom = 0; j < screenHeight; j += side){
            for (int i = 0; i < screenWidth; i+= side){
                tab[pom][0] = i;
                tab [pom][1] = j;
                System.out.println("Tutaj tab[" + pom + "][0] = " + i);
                pom++;
            }
        }


        for (int i = 0; i < ile_sie_zmiesci; i++){
            System.out.println(tab[i][0] + " ," + tab[i][1]);
        }
        return tab;
    }

    static boolean czy_palindrom (char[] tab, int n){
        if (n > tab.length/2)
            return true;
        if(tab[n] != tab[tab.length - 1 - n])
            return false;

        return czy_palindrom(tab, n +1);

    }

    static void wypisz_od_srodka(char[] tab, int n, int k){
        if ((tab.length % 2 == 0 && n == tab.length)|| (tab.length % 2 != 0 && n == tab.length - 1))
            return;
        if(n < tab.length/2) {
            System.out.print(tab[tab.length / 2 - n - 1]);
            wypisz_od_srodka(tab, n+1, k);
        }
        else{
            System.out.print(tab[tab.length - k - 1]);
            wypisz_od_srodka(tab, n +1, k+1);
        }

    }

    static void uzupelnianie_po_pierscieniu (int[][] tab, int n){
        if(n > tab.length/2)
            return;

        //gorna krawedz
        for (int i = n; i < tab.length - n; i++){
            tab[n][i] = n+1;
        }
        //prawda krawedz
        for (int i = n + 1; i < tab.length - n - 1; i++){
            tab[i][tab.length- n - 1] = n+1;
        }

        //krawedz dolna
        for (int i = tab.length - 1 - n; i >= n; i--){
            tab[tab.length - 1 - n][i] = n+1;
        }
        //krawedz boczna lewa
        for (int i = n + 1; i < tab.length - n - 1; i++){
            tab[i][n] = n+1;
        }

        uzupelnianie_po_pierscieniu(tab, n+1);
    }
}
