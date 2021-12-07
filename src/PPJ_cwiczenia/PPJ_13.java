package PPJ_cwiczenia;

import java.util.Random;
import java.util.Scanner;

public class PPJ_13 {
    public static void main(String[] args){
        zadanie6();
    }

    static void zadanie1(){
        System.out.println("Podaj rozmiar ");
        Scanner scan = new Scanner(System.in);
        int rozmiar = scan.nextInt();

        for(int i = 0; i < (2*rozmiar + 1); i++){
            System.out.print((i+1) + " ");
            for (int j = 0; j < (2*rozmiar + 1); j++) {
                if(i <= rozmiar) {
                    if (j < rozmiar - i)
                        System.out.print(". ");
                    else if (j > rozmiar + i)
                        System.out.print(". ");
                    else
                        System.out.print("* ");
                }
                else{
                    if (j < i - rozmiar)
                        System.out.print(". ");
                    else if (j > 2*rozmiar - (i - rozmiar))
                        System.out.print(". ");
                    else
                        System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    static boolean czy_narcystyczna(int a){
        int liczba_poczatkowa = a;
        int dlugosc = 0;
        int suma = 0;
        int pom = a;
        int pomv2;
        while(pom > 0){
            dlugosc++;
            pom /= 10;
        }

        while(a > 0){
            pomv2 = a % 10;
            suma += Math.pow(pomv2, dlugosc);
            a /= 10;
        }

        if (suma == liczba_poczatkowa) {
            return true;
        }
        else
            return false;
    }

    static void zadanie2(){
        int[] arr = {153, 333, 370, 515, 407, 80};

        for (int i = 0; i < arr.length; i++){
            if(czy_narcystyczna(arr[i])) {
                System.out.println("Liczba " + arr[i] + " jest liczba narcystyczna");
            }
        }
    }

    static void zadanie3(){
        int[] tablica1 = new int[10];
        double[] tablica2 = new double[10];
        Random r = new Random();

        for(int i = 0; i < tablica1.length; i++){
            tablica1[i] = r.nextInt(100);
            tablica2[i] = Math.round(Math.random()*10000) / 100.0;
        }

        System.out.println("Tablica int wyglada tak");

        for (int i = 0; i < tablica1.length; i++){
            System.out.print(tablica1[i] + " ");
        }

        System.out.println("\nTablica double wyglada tak");

        for (int i = 0; i < tablica2.length; i++){
            System.out.print(tablica2[i] + " ");
        }

        double suma1, suma2;
        int pom_intowa;
        double pom_doublowa;

        for(int i = 1; i < tablica1.length; i++){
            for(int j = i; j < tablica1.length; j++){
                suma1 = tablica1[i - 1] + tablica2[i-1];
                suma2 = tablica1[j] + tablica2[j];
                if(suma2 < suma1){
                    pom_intowa = tablica1[j];
                    tablica1[j] = tablica1[i - 1];
                    tablica1[i - 1] = pom_intowa;

                    pom_doublowa = tablica2[j];
                    tablica2[j] = tablica2[i - 1];
                    tablica2[i - 1] = pom_doublowa;
                }

            }
        }

        System.out.println("\nTERAZ WYGLADA TO TAK");

        System.out.println("Tablica int wyglada tak");

        for (int i = 0; i < tablica1.length; i++){
            System.out.print(tablica1[i] + " ");
        }

        System.out.println("\nTablica double wyglada tak");

        for (int i = 0; i < tablica2.length; i++){
            System.out.print(tablica2[i] + " ");
        }

    }

    static void zadanie4(){
        int[][] tab = {
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0 , 1}
        };
        int rozmiar_jednowymiarowej = 0;
        for (int  i = 0; i < tab.length; i++){
            for (int j = 0; j <tab[i].length; j++){
                rozmiar_jednowymiarowej++;
            }
        }
        System.out.println(rozmiar_jednowymiarowej);

        int[] arr_jednowymiarowa = new int[rozmiar_jednowymiarowej];
        int pom = 0;
        for(int i = 0; i < tab.length; i++){
            for (int j = 0; j <tab[i].length; j++){
                arr_jednowymiarowa[pom] = tab[i][j];
                pom++;
            }
        }

        for (int i = 0; i < arr_jednowymiarowa.length; i++)
            System.out.print(arr_jednowymiarowa[i] + " ");
    }

    static void zadanie5(){
        Random r = new Random();
        int[] tablica1 = new int[r.nextInt(30)];
        int[] tablica2 = new int[r.nextInt(30)];
        int[] tablica3 = new int[r.nextInt(30)];

        System.out.println("To jest tablica pierwsza");
        for(int i = 0; i < tablica1.length; i++){
            tablica1[i] = r.nextInt(1000);
            System.out.print(tablica1[i] + " ");
        }
        System.out.println("\nTo jest tablica druga");
        for(int i = 0; i < tablica2.length; i++){
            tablica2[i] = r.nextInt(1000);
            System.out.print(tablica2[i] + " ");
        }
        System.out.println("\nTo jest tablica 3");
        for(int i = 0; i < tablica3.length; i++){
            tablica3[i] = r.nextInt(1000);
            System.out.print(tablica3[i] + " ");
        }
        int[][] tablica_dwuwymiarowa = new int[3][];
        tablica_dwuwymiarowa[0] = tablica1;
        tablica_dwuwymiarowa[1] = tablica2;
        tablica_dwuwymiarowa[2] = tablica3;

        for(int i = 0; i < tablica_dwuwymiarowa.length; i++){
            System.out.println("\nTo jest tablica numer " + (i+1));
            for (int j = 0; j < tablica_dwuwymiarowa[i].length; j++){
                System.out.print(tablica_dwuwymiarowa[i][j] + " ");
            }
        }


    }

    static void zadanie6(){
        Random r = new Random();
        float[][] tab = new float[8][8];

        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[i].length; j++){
                tab[i][j] = Math.round(r.nextFloat()*10000)/100.0f;
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
        float suma_lewej_przekatnej = 0;
        float suma_prawej_przekatnej = 0;

        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[i].length; j++){
                if(i == j)
                    suma_lewej_przekatnej = suma_lewej_przekatnej + tab[i][j];
                if(j + i == 7)
                    suma_prawej_przekatnej = suma_prawej_przekatnej + tab[i][j];

            }
        }
        System.out.println("Suma lewej przekatnej jest rowna " + Math.round(suma_lewej_przekatnej*100)/100f);
        System.out.println("Suma prawej przekatnej jest rowna " + Math.round(suma_prawej_przekatnej*100)/100f);

    }
}
