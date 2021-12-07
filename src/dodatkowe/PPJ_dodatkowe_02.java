package dodatkowe;

import java.util.Random;
import java.util.Scanner;

public class PPJ_dodatkowe_02 {
    public static void main(String[] args) {
        zadanie14();
    }

    static void zadanie1(){
        for(int i = 0; i <= 20; i++)
            System.out.println(i);
    }

    static void zadanie2(){
        for (int i = 20; i >= 0; i--)
            System.out.println(i);
    }

    static void zadanie3(){
        for (int i = 0; i <= 20; i += 2)
            System.out.println(i);
    }

    static void zadanie4(){
        for (int i = 20; i >= 0; i -= 2)
            System.out.println(i);
    }

    static void zadanie5(){
        Scanner scan = new Scanner(System.in);
        int liczba;
        System.out.println("Podaj dowolna liczbe, a program ja wyswietli jesli chcesz zakonczyc wpisz 0");
        while((liczba = scan.nextInt()) != 0){
            System.out.println(liczba);
        }
    }

    static void zadanie6(){
        for (int i = 0; i <= 100; i++){
            if(i % 2 == 0 && i % 13 == 0)
                System.out.println(i);
        }
    }

    static void zadanie7(){
        int suma = 0;
        for(int i = 0; i < 20; i++)
            suma += i;
        System.out.println(suma);
    }

    static void zadanie8(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe, a program wyliczy sume liczb od 0 az do tej liczby wlacznie");
        int liczba = scan.nextInt();
        int suma = 0;
        for (int i = 0; i <= liczba; i++){
            suma += i;
        }
        System.out.println(suma);
    }

    static void zadanie9(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita");
        int liczba = scan.nextInt();
        for (int i = 0; i <= 5; i++){
            System.out.println(liczba + " do potegi " + i + " jest rowna " + Math.pow(liczba,i) + " ");
        }
    }

    static void zadanie10(){
        for (int i = 1; i < 10; i++){
            for (int j = 1; j < 10; j++){
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
    }

    static void zadanie11(){
        int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int x : tab)
            System.out.println(x);
    }

    static void zadanie12(){
        int[] tab = new int[10];
        for (int i = 0; i < tab.length; i++)
            tab[i] = i;

        for (int x : tab)
            System.out.println(x);
    }

    static void zadanie13(){
        int[] tab = new int[10];
        int suma = 0;

        for (int i = 0; i < tab.length; i++){
            tab[i] = (int)(Math.random()*100);
            System.out.print(tab[i] + " ");
            suma += tab[i];
        }
        System.out.println("\nIch suma to " + suma);
    }

    static void zadanie14() {
        int[] tab = new int[20];
        int []pomocnicza = new int[10];
        /*int ile_zer = 0;
        int ile_1 = 0;
        int ile_2 = 0;
        int ile_3 = 0;
        int ile_4 = 0;
        int ile_5 = 0;
        int ile_6 = 0;
        int ile_7 = 0;
        int ile_8 = 0;
        int ile_9 = 0;*/


        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * 10);
            System.out.print(tab[i] + " ");
            pomocnicza[tab[i]]++;
            /*System.out.print(tab[i] + " ");
            switch (tab[i]){
                case 0 -> ile_zer++;
                case 1 -> ile_1++;
                case 2 -> ile_2++;
                case 3 -> ile_3++;
                case 4 -> ile_4++;
                case 5 -> ile_5++;
                case 6 -> ile_6++;
                case 7 -> ile_7++;
                case 8 -> ile_8++;
                case 9 -> ile_9++;
            }
        }
        System.out.println("\nILOSC ZER " + ile_zer);
        System.out.println("ILOSC 1 " + ile_1);
        System.out.println("ILOSC 2 " + ile_2);
        System.out.println("ILOSC 3 " + ile_3);
        System.out.println("ILOSC 4 " + ile_4);
        System.out.println("ILOSC 5 " + ile_5);
        System.out.println("ILOSC 6 " + ile_6);
        System.out.println("ILOSC 7 " + ile_7);
        System.out.println("ILOSC 8 " + ile_8);
        System.out.println("ILOSC 9 " + ile_9);*/
        }
        System.out.println();

        for (int i = 0; i < pomocnicza.length; i++){
            if(pomocnicza[i] != 0)
                System.out.println("Liczba " + i + " wystapila w tablicy " + pomocnicza[i] + " razy");
        }



    }

    static void zadanie15(){
        char[] tab = new char[5 + (int)(Math.random()*(8-5))];
        int odleglosc = 0;

        for(int i = 0; i < tab.length; i++){
            tab[i] = (char)( 'a' + (Math.random()*26));
            System.out.println(tab[i]);
        }
        for (int i = 1; i < tab.length; i++){
            System.out.println("Odleglosc miedzy " + tab[i] + " oraz " + tab[i-1] + " jest rowna " +
                    Math.abs(tab[i-1] - tab[i]));
        }
    }

    //zadanie 16- 26 to odczytywanie kodu

    static void zadanie27(){
        int n = 9;
        char tab[][] = new char[n][n];
        int pom = 0;
        while (pom < n - 2){
            if(pom%2 == 0){//dla wypisywania kwadracika z 'x'
                for(int i = pom; i < n - pom; i++){
                    for(int j = pom; j < n - pom ; j++){
                        if(i == pom || i == n -1 - pom)
                            tab[i][j] = 'x';
                        if(j == pom || j == n - 1 - pom)
                            tab[i][j] = 'x';
                    }
                }
                pom++;
            }// dla wypisywania kwadracika z 'y'
            else{
                for(int i = pom; i < n - pom; i++){
                    for(int j = pom; j < n - pom; j++){
                        if(i == pom || i == n - 1 - pom)
                            tab[i][j] = 'o';
                        if(j == pom || j == n - 1 - pom)
                            tab[i][j] = 'o';
                    }
                }
                pom++;
            }

        }
        //wypisywanie tablicy na koniec
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
                System.out.print(tab[i][j] + " ");
            System.out.println();
        }
    }

    static void wypisanie_tablicy(int[][] tab){
        for (int i = 0; i < tab.length; i++){
            for (int j = 0; j < tab[i].length; j++){
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void zadanie28(){
        int n = 3;
        int[][] tab = {{1, 6, 4},
                {3, 2, 8},
                {5,2,9}
        };

        wypisanie_tablicy(tab);


        int pomocnicza_poziom;
        int pomocnicza_poziom_2 = 0;
        int pomocnicza_0;
        int ile_w_prawo = 2;
        int licznik = 0;

        while (licznik != ile_w_prawo) {
            for (int i = 0; i < n; i++) {
                pomocnicza_0 = tab[i][0];
                for (int j = 1; j < n; j++) {
                    if (j == 1) {
                        pomocnicza_poziom_2 = tab[i][j];
                        tab[i][j] = pomocnicza_0;
                    } else {
                        if (j == n - 1) {
                            tab[i][0] = tab[i][j];
                            tab[i][j] = pomocnicza_poziom_2;
                        } else {
                            pomocnicza_poziom = pomocnicza_poziom_2;
                            pomocnicza_poziom_2 = tab[i][j];
                            tab[i][j] = pomocnicza_poziom;
                        }
                    }
                }
            }

            licznik++;
            wypisanie_tablicy(tab);
        }
    }
}
