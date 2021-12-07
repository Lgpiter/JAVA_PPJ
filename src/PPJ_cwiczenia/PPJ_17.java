package PPJ_cwiczenia;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Random;

public class PPJ_17 {
    public static void main(String[] args) {
        printMonth(9, 2022);
    }


    public static void printMonth(int month, int year){
        LocalDate localDate = LocalDate.of(year, month ,1);
        DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
        int day1OfCal = dayOfWeek.getValue();

        int days = 0;
        switch (month){
            case 1,3, 5, 7,8 , 10 , 12 -> days = 31;
            case 2 -> {
                if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                    days = 29;
                else
                    days = 28;
            }
            case 4, 6, 9, 11 -> days =30;
        }//switch to find how many days are in our month
        System.out.println(day1OfCal);
        for (int i = 0,pom = 1, counter = day1OfCal - 1; i < days; i++){
            if (i == 0){
                System.out.print(pom++ + " ");
                for (int k = 0; k < day1OfCal - 1; k++){
                    System.out.print("   ");
                }
            }//to make spaces before first day of month

            if (i < 9) {
                System.out.print(" " + (i + 1) + " ");
                counter++;
            }
            else{
                System.out.print((i + 1) + " ");
                counter++;
            }
            if  ((counter % 7) == 0) {
                System.out.print("\n" + pom++ + " ");
                counter = 0;
            }// to make number of week
        }

    }

    public static void swap (int[] tab, int source, int destination){
        int pom = tab[source];
        tab[source] = tab[destination];
        tab[destination] = pom;
    }

    public static void wypisz_tablice(int[] tab){
        for (int i = 0; i < tab.length; i++){
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }

    public static int factR(int n){
        if (n == 1)
            return 1;
        else
            return n*factR(n-1);
    }

    public static void petrmutacja (){
        System.out.println("Podaj liczbe ");
        java.util.Scanner in=new java.util.Scanner(System.in);
        int n = in.nextInt();

        int rozmiar_tablicy = 0;
        int poczatkowa_wartosc = n;

        while (poczatkowa_wartosc > 0){
            poczatkowa_wartosc /= 10;
            rozmiar_tablicy++;
        }
        int ilosc_permutacji = factR(rozmiar_tablicy);
        int[] pom_tab = new int[rozmiar_tablicy];

        for (int pom = 1; n > 0; n /= 10, pom++)
            pom_tab[rozmiar_tablicy - pom] = n % 10;
        int[][] pom_tab_2 = new int[ilosc_permutacji][rozmiar_tablicy];

        Random r= new Random();
        int losowanie_1 = r.nextInt(rozmiar_tablicy);
        int losowanie_2 = r.nextInt(rozmiar_tablicy);

        int licznik = 0;
        while(licznik != ilosc_permutacji){
            swap(pom_tab, losowanie_1, losowanie_2);

            losowanie_1 = r.nextInt(rozmiar_tablicy);
            losowanie_2 = r.nextInt(rozmiar_tablicy);
        }
    }

    static void bubleSortIt(int[] tab){

        boolean czy_posortowane = false;
        while(!czy_posortowane) {
            czy_posortowane = true;
            for (int i = 0; i < tab.length - 1; i++) {
                if (tab[i] > tab[i + 1]) {
                    swap(tab, i, i + 1);
                    czy_posortowane = false;
                }
            }

        }
    }

    static void bubleSortR(int[] tab, int n){
        boolean czy_posortowane = false;
        if (n == tab.length - 1)
            return ;
        if (tab[n] > tab[n + 1] && !czy_posortowane) {
            swap(tab, n, n + 1);
            czy_posortowane = true;
        }
        bubleSortR(tab, n + 1);

        if(czy_posortowane)
            bubleSortR(tab, 0);;
    }
}
