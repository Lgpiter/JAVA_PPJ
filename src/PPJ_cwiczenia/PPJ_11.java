package PPJ_cwiczenia;
import java.util.Random;
public class PPJ_11 {
    public static void main(String[] args )
    {
        Zadanie5();

    }

    public static void Zadanie1()
    {
        double[] tablica = new double[10];

        for (int i = 0; i <tablica.length; i++){
            tablica[i] = Math.round(Math.random()*100);
        }

        System.out.println("Wypisanie wszystkich wyrazow tablicy");
        for (int i = 0; i < tablica.length; i++){
            System.out.println(tablica[i]);
        }

        System.out.println("Wypisywanie liczb o parzystym indeksie");
        for (int i = 0; i < tablica.length; i++){
            if(i % 2 == 0)
                System.out.println(tablica[i]);
        }

        int pom;

        System.out.println("Wypisywanie liczb nieparzystych przekonwertowanych na int");
        for (int i = 0; i < tablica.length; i++){
            pom = (int)tablica[i];
            if(pom % 2 != 0)
                System.out.println(tablica[i]);
        }
    }

    public static void Zadanie2()
    {
        char[] tablica = {'a', 'D', 'A'};
        int pom = 0;
        int min = tablica[0];

        for (int i = 0; i < tablica.length; i++){
            if (tablica[i] < min){
                pom = i;
                min = tablica[pom];
            }
        }

        System.out.println("Najmniejsza wartosc w tablicy to " + min + " czyli " + tablica[pom]);

    }

    public static void Zadanie3()
    {
        java.util.Scanner in=new java.util.Scanner(System.in) ;

        char[] tablica = new char[5];
        Random r = new Random();
        for (int i = 0; i < tablica.length; i++){
            tablica[i] = (char)(r.nextInt(26) + 'A');
        }

        for (int i = 0; i < tablica.length; i++){
            System.out.println(tablica[i]);
        }

        int ilosc_zer = 0;
        int ilosc_wystapien = 0;
        System.out.println("Podaj jakas litere od A do Z, a program zobaczy czy jest ona w tablicy");
        char c=in.next() .charAt(0);
        while(ilosc_zer < 5){
            for (int i = 0; i < tablica.length; i++){
                if(tablica[i] == c){
                    ilosc_zer++;
                    tablica[i] = '0';
                    ilosc_wystapien++;
                }
            }
            System.out.println("Dany znak wystapil w tablicy " + ilosc_wystapien);
            ilosc_wystapien = 0;

            System.out.println("Podaj jakas litere od A do Z, a program zobaczy czy jest ona w tablicy");
            if(ilosc_zer == 5)
                System.out.println("Program zakonczyl dzialanie pozytywnie :D");
            else
                c=in.next() .charAt(0) ;
        }
    }

    public static void Zadanie4()
    {
        Random r = new Random();
        int rozmiar = r.nextInt(6) + 10;
        int[] tablica = new int[rozmiar];

        System.out.println("Tablica przed losowaniem");
        for (int i = 0; i < tablica.length; i++){
            tablica[i] = i;
            System.out.print(tablica[i] + " ");
        }
        System.out.println();

        int pom = r.nextInt(rozmiar);
        int pom2;
        for (int i = 0; i < tablica.length; i++){
            pom2 = tablica[i];
            tablica[i] = tablica[pom];
            tablica[pom] = pom2;
            pom = r.nextInt(rozmiar);
        }

        System.out.println("Tablica po losowaniu");
        for (int i = 0; i < tablica.length; i++){
            System.out.print(tablica[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < tablica.length; i++){
            for (int j = 0; j < tablica.length; j++){
                if (i == tablica[j])
                    System.out.print("* ");
                else
                    System.out.print("- ");
            }
            System.out.println();
        }

    }

    public static void Zadanie5()
    {
        Random r = new Random();
        int[] tablica1 = new int[6];
        int[] tablica2 = new int[11];

        System.out.println("Tablica pierwsza");
        for (int i = 0; i < tablica1.length; i++){
            tablica1[i] = r.nextInt(100);
            System.out.print(tablica1[i] + " ");
        }
        System.out.println("\nTablica Druga");
        for (int i = 0; i < tablica2.length; i++){
            tablica2[i] = r.nextInt(100);
            System.out.print(tablica2[i] + " ");
        }

        int[] tablica3 = new int[tablica2.length + tablica1.length];
        int pom = 0;
        for (int i = 0; i < tablica3.length; i++){
            if(i < tablica1.length)
                tablica3[i] = tablica1[i];
            else{
                tablica3[i] = tablica2[pom];
                pom++;
            }
        }

        System.out.println("\nTablica 3");
        for (int i = 0; i < tablica3.length; i++){
            System.out.print(tablica3[i] + " ");
        }

        int takie_same = 0;

        for(int i = 0; i < tablica1.length; i++){
            for (int j = 0; j < tablica2.length; j++){
                if(tablica1[i] == tablica2[j])
                    takie_same++;
            }
        }

        int[] tablica4 = new int[takie_same];
        int pom2 = 0;
        for(int i = 0; i < tablica1.length; i++){
            for (int j = 0; j < tablica2.length; j++){
                if(tablica1[i] == tablica2[j]) {
                    tablica4[pom2] = tablica1[i];
                    pom2++;
                }
            }
        }

        System.out.println("\nTablica czwarta tzw takich samych");
        for (int i = 0; i < tablica4.length; i++){
            System.out.print(tablica4[i] + " ");
        }

        int min = tablica3[0];
        int max = tablica3[0];

        for (int i = 0; i < tablica3.length; i++){
            if(tablica3[i] < min)
                min = tablica3[i];

            if(tablica3[i] > max)
                max = tablica3[i];
        }


        int[] tablica5 = new int[(1 + max - min)];
        boolean czy_jest = false;

        for (int i = 0; i < tablica5.length; i++){
            tablica5[i] = min + i;
        }

        int[] tablica6 = new int[(1 + max - min) - tablica3.length];
        int pom4 = 0;
        for (int i = 0; i < tablica5.length; i++){
            for (int j = 0; j < tablica3.length; j++) {
                if (tablica5[i] == tablica3[j]) {
                    czy_jest = true;
                }
            }
            if (!czy_jest) {
                tablica6[pom4] = min + i;
                pom4++;
            }
            czy_jest = false;
        }

        System.out.println("To jest tablica OSTATNIA");
        for (int i = 0; i < tablica6.length; i++){
            System.out.print(tablica6[i] + " ");

        }
    }
}
