package PPJ_cwiczenia;

import java.util.Random;
public class PPJ_10 {
    public static void main (String[] args){

        //Zadanie 1
       /*{
            char a;
            for (int i = 75; i <= 150; i++) {
                a = (char) i;
                System.out.println(a + " to liczba " + (a + 0));
            }
        }*/

        //Zadanie 2
        /*{
            byte test = 20;
            char a = '0';


            if (test > 0 && test < 10){
                a = (char)(test+48);

            }
            else{
                for(int i = 10; i < 16; i++){
                    if(test == i)
                        a = (char)(55 + i);
                }
            }
            if(a == '0')
                System.out.println("Podales liczbe z poza przedzialu 0 do 15");
            else
                System.out.println("W systemie heksadecymalnym jest to " + a);
        }*/

        //Zadanie 3
        /*{
            java.util.Scanner in = new java.util.Scanner(System.in);
            System.out.println("Podaj jakas liczbe ");
            int liczba = in.nextInt();

            for (int i = 1; i <= 4; i++){
                System.out.print(" " + Math.pow(liczba, i) + " ");
            }
            System.out.println("\n");

        }*/

        //Zadanie 4
        {
            for(int j = 1; j <= 5; j++) {
                System.out.print(j + " ");
                if(j % 2 != 0) {
                    for (int i = 0; i <= 4; i++) {
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }
                else{
                    for (int i = 0; i <= 3; i++){
                        System.out.print(" *");
                    }
                    System.out.print("\n");
                }
            }
        }

        //Zadanie 5
        java.util.Scanner in = new java.util.Scanner(System.in);
        Random r = new Random();

        System.out.println("Zagrajmy w papier kamien nozyce!");
        System.out.println("Wpisz papier / kamien / nozyce ");
        String napis = in.nextLine();

        int wynik_komputera = 0;
        int wynik_gracza = 0;

        int losowanie;// przy naszych losowaniach 0 to papier, 1 to kamien, a 2 to nozyczki


        while (wynik_gracza < 3 && wynik_komputera < 3){
            losowanie = r.nextInt(3);

            switch (losowanie){
                case 0 -> System.out.println("Komputer dal papier");
                case 1 -> System.out.println("Komputer dal kamien");
                case 2 -> System.out.println("Komputer dal nozyczki");
            };

            if (napis.equals("papier")) {
                if(losowanie == 1)
                    wynik_gracza++;

                if(losowanie == 2)
                    wynik_komputera++;
            }
            if (napis.equals("kamien")){
                if(losowanie == 2)
                    wynik_gracza++;

                if(losowanie == 0)
                    wynik_komputera++;
            }

            if(napis.equals("nozyczki")){
                if(losowanie == 0)
                    wynik_gracza++;

                if(losowanie == 1)
                    wynik_komputera++;
            }
            System.out.println("Wynik wyglada nastepujaco \n" + "Wynik gracza " + wynik_gracza +
                    "\nWynik komputera " + wynik_komputera);

            if(wynik_gracza == 3)
                System.out.println("Dziekuje za rozgrywke, tym razem byles lepszy, gratulacje");
            else {
                if(wynik_komputera == 3)
                    System.out.println("Dziekuje za rozgrywke, moze nastepnym razem Ci sie uda");
                else {
                    System.out.println("Wpisz papier / kamien / nozyce ");
                    napis = in.nextLine();
                }
            }

        }
    }
}
