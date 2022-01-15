package PPJ_25;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        Zadanie4();

        /*
        try {
            FileOutputStream fos = new FileOutputStream("Z:\\JAVA_TEST\\src\\PPJ_25\\1out.txt");
            int val = 123456;
            fos.write((val >> 0) & 0b1111_11111);
            fos.write((val >> 8) & 0b1111_11111);
            fos.write((val >> 16) & 0b1111_11111);
            fos.write((val >> 24) & 0b1111_11111);

            fos.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("Z:\\JAVA_TEST\\src\\PPJ_25\\1out.txt");
            int val = (fis.read() << 0);
            val = (fis.read() << 8 | val);
            val = (fis.read() << 16 | val);
            val = (fis.read() << 24 | val);
            System.out.println(val);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

         */
    }

    public static void Zadanie1(){
        char[] tab = new char[1000];
        try{
            FileInputStream fis = new FileInputStream("Z:\\JAVA_TEST\\src\\PPJ_25\\Uczymy.txt");
            int val;

            while ((val = fis.read()) != -1){
                tab[val]++; // tab[65] = 1 , tab[65] = 2
            }


        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] != 0)
                System.out.println("Znak " + (char) i + " wystapil w tekscie " + (int) tab[i] + " razy ");
        }
    }

    public static void Zadanie2(){
        int[] tab_pom = new int[100];
        int licznik = 0;
        int pom2 = 0;

        try{
            int suma = 0;

            FileInputStream fis = new FileInputStream("Z:\\JAVA_TEST\\src\\PPJ_25\\Zad1.txt");
            int val;

            zeruj_tablice(tab_pom);

            while (pom2 != 1){
                if ((val = fis.read())== -1) {
                    pom2++;
                    suma += suma(tab_pom);
                    licznik = 0;
                    zeruj_tablice(tab_pom);
                }
                if((char)val == ' ' ){
                    suma += suma(tab_pom);
                    licznik = 0;
                    zeruj_tablice(tab_pom);
                }
                else{
                    tab_pom[licznik++] = val - '0';
                }
            }

            System.out.println(suma);

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public static void zeruj_tablice(int[] tab){
        for(int i = 0; i < tab.length; i++){
            tab[i] = -1;
        }
    }

    public static int suma(int[] tab){
        int dlugosc = 0;
        int suma = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i] != -1)
                dlugosc++;
        }

        for (int i = 0; i < tab.length; i++){
            if(tab[i] != -1){
                suma += tab[i] * Math.pow(10, dlugosc - 1);
                dlugosc--;
            }
        }
        return suma;
    }

    public static void Zadanie3(){

        try {
            String test = "test";
            for(int i = 1; i < 6; i++) {
                int counter = 0;
                FileOutputStream fos = new FileOutputStream("Z:\\\\JAVA_TEST\\\\src\\\\PPJ_25\\\\" + "inputData" + i + ".txt");

                    int[] tab = tworzenie_tablicy();
                    for(int j = 0; j < tab.length; j++){
                        System.out.print(tab[j] + " ");
                        String parsedInt = String.valueOf(tab[j]);
                        byte[] toSend = parsedInt.getBytes();
                        fos.write(toSend);
                        fos.write(' ');
                    }

                    System.out.println();

                fos.close();
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static int[] tworzenie_tablicy(){
        int[] tab = new int[5];
        for(int i = 0; i < tab.length; i++){
            tab[i] = (int)(Math.random()*1000);
        }

        for(int i = 0; i < tab.length; i++){
            for(int j = i + 1; j < tab.length; j++){
                if(tab[i] >= tab[j]){
                    int pom = tab[i];
                    tab[i] = tab[j];
                    tab[j] = pom;
                }
            }
        }
        return tab;
    }

    public static int[] sortowanie_tablicy(int[] tab){
        for(int i = 0; i < tab.length; i++){
            for(int j = i + 1; j < tab.length; j++){
                if(tab[i] > tab[j]){
                    int pom = tab[i];
                    tab[i] = tab[j];
                    tab[j] = pom;
                }
            }
        }
        return tab;
    }

    public static void Zadanie4(){

        int[] tab = new int[4];//tablica do trzymania pojedynczej liczby
        int[] tab_duza = new int[5];//tablica do trzymaniu liczb z x plikow
        try{

            FileOutputStream fos = new FileOutputStream("Z:\\\\JAVA_TEST\\\\src\\\\PPJ_25\\\\" + "Wynikowy.txt");
            FileInputStream fis = new FileInputStream("Z:\\\\JAVA_TEST\\\\src\\\\PPJ_25\\\\" + "inputData1.txt");
            int val1,val2;
            int pom_mala = 0;
            int pom_duza = 0;

           // while(ilosc_liczb < 5) {

                for (int i = 1; i < 6; i++) {
                    //ten fragment
                    FileInputStream fis2 = new FileInputStream("Z:\\\\JAVA_TEST\\\\src\\\\PPJ_25\\\\" + "inputData" + i + ".txt");
                    zeruj_tablice(tab);

                    while ((val2 = (char) fis2.read()) != ' ') {
                        tab[pom_mala++] = val2 - '0';
                    }
                    System.out.println("Z pliku " + i + " zczytalismy " + suma(tab));
                    pom_mala = 0;
                    tab_duza[pom_duza++] = suma(tab);
                    //az tutaj elegancko dziala i wszystko smiga, odczytuje wszystkie pierwsze liczby z jednej tablicy i je spisuje do duzej
                }
                sortowanie_tablicy(tab_duza);

                for (int i = 0; i < tab_duza.length; i++) {
                    String parsedInt = String.valueOf(tab_duza[i]);
                    byte[] toSend = parsedInt.getBytes();
                    fos.write(toSend);
                    fos.write(' ');
                }
                pom_duza = 0;

           // }
            fos.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }


}
