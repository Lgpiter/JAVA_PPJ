package PPJ_27;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Main {
    public static void main(String[] args) {
        Zadanie1();
    }


    public static void Zadanie1(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe od 0 do 2^31");
        int liczba = scan.nextInt();

        na_binarny(liczba);
        na_czworkowy(liczba);
        na_osemkowy(liczba);
        na_szesnastkowy(liczba);
    }

    public static void na_binarny(int liczba){
        StringBuilder wynik = new StringBuilder();
        int pom = 31;
        while(pom > 0){
            pom--;
            wynik.insert(0, liczba & 1);
            liczba = liczba >> 1;
        }
        System.out.println("Na binarny " + wynik);
    }

    public static void na_czworkowy(int liczba){
        StringBuilder wynik = new StringBuilder();
        int pom = 15;
        while(pom > 0){
            pom--;
            wynik.insert(0, liczba % 4);
            liczba = liczba >> 2;
        }
        System.out.println("Na czworkowy " + wynik);
    }

    public static void na_osemkowy(int liczba){
        StringBuilder wynik = new StringBuilder();
        int pom = 12;
        while(pom > 0){
            pom--;
            wynik.insert(0, liczba % 8);
            liczba = liczba >> 3;
        }
        System.out.println("Na osemkowy " + wynik);
    }

    public static void na_szesnastkowy(int liczba){
        StringBuilder wynik = new StringBuilder();
        int pom = 8;
        while(pom > 0){
            pom--;
            if(liczba % 16 > 9) {
                char a = switch (liczba % 16) {
                    case 10 -> 'A';
                    case 11 -> 'B';
                    case 12 -> 'C';
                    case 13 -> 'D';
                    case 14 -> 'E';
                    case 15 -> 'F';
                    default -> '0';
                };
                wynik.insert(0, a);
                liczba = liczba >> 4;
            }
            else{
                wynik.insert(0, liczba % 16);
                liczba = liczba >> 4;
            }
        }
        System.out.println("Na osemkowy " + wynik);
    }

    public static void Zadanie2(){
        String str = "2022-23-01";
        Pattern pattern = Pattern.compile("\\d{4}-(\\d?)\\d-(\\d?)\\d");
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.matches());
    }

    public static void Zadanie3(){
        String str = "89A02DF";
        String[] tab = str.split("");

        boolean czy_nalezy = true;
        Pattern pattern = Pattern.compile("[\\dABCDEF]");
        for (int i = 0; i < tab.length; i++){
            Matcher matcher = pattern.matcher(tab[i]);
            if(!matcher.find())
                czy_nalezy = false;
        }

       if(czy_nalezy)
           System.out.println("Liczba jest liczba w systemie 16");
       else
           System.out.println("Liczba nie jest w systmie 16");
    }

    public static void Zadanie4(){
        String str = "wies w Polsce polozona w wojewodztwie wielkopolskim, w powiecie kolskim, w gminie Olszuwka. " +
                "W latach 1975-1998 miejscowosc polozona byla w wojewodztwie koninskim";
        String[] tab = str.split("");

        int licznik_par = 0;
    }
}
