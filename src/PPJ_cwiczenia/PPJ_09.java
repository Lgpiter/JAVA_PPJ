package PPJ_cwiczenia;

public class PPJ_09 {
    public static void main (String[] args){
        java.util.Scanner in = new java.util.Scanner(System.in);
        //Zadanie 1
        /*{
            System.out.println("Zadanie 1");
            for (int i = 1; i <= 10; i++)
                System.out.println(i);
        }*/

        //Zadanie 2
        /*{
            System.out.println("Zadanie 2");
            int wart = 3;
            for (int i = 1; i <= 10; i++)
                System.out.println(i*wart);
        }*/

        //Zadanie 3
        /*{
            System.out.println("Zadanie 3");
            int i = 0;
            while (i > 0)
                System.out.println("Tu while nie odpali");

            do{
                System.out.println("To sie zawsze wykona");
            }
            while(i > 0);
        }*/

        //Zadanie 4
        /*{
            System.out.println("Zadanie 4");
            int licznik = 0;
            int suma = 0;
            System.out.println("Podaj liczbe calkowita, wpisz 0 jesli chcesz zakonczyc ");
            int liczba = in.nextInt();
            while(liczba != 0) {
                licznik++;
                suma += liczba;
                System.out.println("Podaj liczbe calkowita, wpisz 0 jesli chcesz zakonczyc ");
                liczba = in.nextInt();
            }
            System.out.println("Wprowadzono " + licznik + " liczb, a ich suma to " + suma);
        }*/

        //Zadanie 5
       /*{
            System.out.println("Zadanie 5");
            System.out.println("Podaj Twoj numer studenta");
            int numer = in.nextInt();
            int suma = 0;
            for(int i = 0; i <= numer; i++) {
                suma += i;
            }
           System.out.println("Twoj numer studenta to " + numer + " a suma od 0 az do niego jest rowna " + suma);
        }*/

        //Zadanie 6
        {
            System.out.println("Pierwsze 10 elementow szeregu geometrycznego");
            double x;
            double suma = 0;
            for (int i = 0; i < 70; i++) {

                for(int j = 0; j <= i; j++){
                    x = 1/(Math.pow(2,j));
                    suma = suma + x;
                }
                System.out.println("Suma pierwszych " + (i + 1) + " wyrazow jest rowna " + suma);
                suma = 0;
            }
        }

        //Zadanie 7
        /*{
            int dzien = 29;
            int miesiac = 10;
            int rok = 2021;
            int suma_dni = 0;
            int dni = 0;

            for (int i =1; i < miesiac; i++)
            {
                switch (i){
                    case 1,3, 5, 7,8 , 10 , 12 -> dni = 31;
                    case 2 -> {
                        if((rok % 4 == 0 && rok % 100 != 0) || rok % 400 == 0)
                            dni = 29;
                        else
                            dni = 28;
                    }
                    case 4, 6, 9, 11 -> dni =30;
                    }
                suma_dni += dni;
                System.out.println("Dodalismy dni: " + dni);
            }
            suma_dni += dzien; //dodajemy dni z ostatniego miesiaca
            System.out.println("Do dnia " + dzien + " miesiaca " + miesiac + " roku " + rok + " minelo " + suma_dni + " dni");
        }*/

        //Zadanie 8
       /* System.out.println("Podaj wartosc w zlotowkach z przecinkiem ");
        double cena = in.nextDouble();
        double w_groszach =cena * 100;
        int ile = 0;
        int pom = 0;


        if(w_groszach >= 500){
               ile = (int)(w_groszach/500);
               w_groszach = w_groszach - (ile * 500);
               System.out.println(ile + " * 5zl");
        }

        if (w_groszach >= 200){
              ile = (int)(w_groszach/200);
              w_groszach = w_groszach - (ile * 200);
              System.out.println(ile + " * 2zl");
        }

        if (w_groszach >= 100){
            ile = (int)(w_groszach/100);
            w_groszach = w_groszach - (ile * 100);
            System.out.println(ile + " * 1zl");
        }

        if (w_groszach >= 50){
            ile = (int)(w_groszach/50);
            w_groszach = w_groszach - (ile * 50);
            System.out.println(ile + " * 50 gr");
        }

        if (w_groszach >= 20){
            ile = (int)(w_groszach/20);
            w_groszach = w_groszach - (ile * 20);
            System.out.println(ile + " * 20 gr");
        }

        if (w_groszach >= 10){
            ile = (int)(w_groszach/10);
            w_groszach = w_groszach - (ile * 10);
            System.out.println(ile + " * 10 gr");
        }

        if (w_groszach >= 5){
            ile = (int)(w_groszach/5);
            w_groszach = w_groszach - (ile * 5);
            System.out.println(ile + " * 5 gr");
        }
        if (w_groszach >= 2){
            ile = (int)(w_groszach/2);
            w_groszach = w_groszach - (ile * 2);
            System.out.println(ile + " * 2 gr");
        }
        if (w_groszach >= 1){
            ile = (int)(w_groszach);
            w_groszach = w_groszach - ile;
            System.out.println(ile + " * 1 gr");
        }*/
    }
}
