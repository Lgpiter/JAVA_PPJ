package PPJ_26;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        /*
        //Zadanie 3
        MojSkaner skaner = new MojSkaner(System.in);
        System.out.println("Podaj jakas liczbe ");
        int b = skaner.odczytajLiczbeCalkowita();
        System.out.println(b);
        System.out.println("Test z liczba ujemna");
        try {
            int a = skaner.odczytajDodatniaLiczbeCalkowita();
            System.out.println(a);
        }catch (BladLiczbowy e){
            e.printStackTrace();
        }

         */



        //Zadanie 4
        try {
            InputStream wejscie = new FileInputStream("Z:\\JAVA_TEST\\src\\PPJ_26\\doOdczytu.txt");
            PNWReader reader = new PNWReader(1, wejscie);
            reader.show();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }




    }

    public static void Zadanie1(){
        InputStream systemWe = System.in;
        try {
            System.out.println("Podaj liczbe ");
            int a = systemWe.read();
            System.out.println("A zatem wczytalo nam " + a);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void Zadanie2(){
        InputStream systemWe = System.in;
        try {
            System.out.println("Podaj ciag znakow ");
            int a;
            while((a = systemWe.read()) != 10) {
                System.out.println((char)a + " a jego kod w ASCII to " + a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
