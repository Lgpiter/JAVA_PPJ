package PPJ_cwiczenia;

public class PPJ_07 {
    public static int Mediana(int a, int b, int c)
    {
        int mediana;
        if(a >= b && a <= c)
            mediana = a;
        else if(b >= a && b<=c)
            mediana = b;
        else
            mediana = c;
        return mediana;
    }

    public static void main (String[] args)
    {
        // CWICZENIA 6
        //Zadanie 1
        boolean czyPada = false;
        if (czyPada){
            System.out.println("Pada deszcz");
        }
        else {
            System.out.println("Nie pada deszcz");
        }

        //Zadanie 2
        int padanie = (czyPada? 5 : 8);
        System.out.println(padanie);

        //Zadanie 3
        boolean czySwieciSlone = false;
        if(czyPada && !czySwieciSlone){
            System.out.println("Jest plucha -> pada i nie swieci slonce");
        }
        else if (czyPada && czySwieciSlone) {
            System.out.println("Jest tecza");
        }
        else if (czySwieciSlone && !czyPada){
            System.out.println("Jest slonecznie");
        }
        else {
            System.out.println("Jest pochmurno");
        }

        //Zadanie 4 powinno wyrzucic hello ppj
        if(3 < 5 * 2.0)
            System.out.print("Hello") ;
        System.out.println(" PPJ") ;

        //Zadanie 5
        java.util.Scanner in=new java.util.Scanner(System.in);
       /* System.out.println("Podaj pierwsza liczbe calkowita: ");
        int x=in.nextInt();
        System.out.println("Podaj druga liczbe calkowita: ");
        int y = in.nextInt();
        if( x % y == 0)
            System.out.println("Druga liczba jest calkowita czescia pierwszej");
        else
            System.out.println("Druga liczba nie jest calkowita czescia pierwszej");*/

        //Zadanie 6
        /*double a = in.nextDouble();
        System.out.println("Podaj pierwsza liczbe ");
        double b = in.nextDouble();
        System.out.println("Podaj druga liczbe ");
        double wynik;*/
       /* if( a > 0 && b > 0){
            wynik = a - b;
            System.out.println("Ich roznica to " + wynik);
        }
        else {
            wynik = a + b;
            System.out.println("Ich suma to " + wynik);
        }*/

        //Zadanie 7
        /*int a = -3;
        int b = -1;
        if(a< 0) {
            System.out.println("Negative") ;
            a =a * b;
            System.out.println("Absolute value is: "+ a) ;
        }
        if (a >= 0){
            System.out.println("Positive") ;
            System.out.println("Absolute value is: "+ a) ;
        }*/

        //Zdanie 8
        /*double pierwszy = Math.random();
        System.out.println("Wynik pierwszy to " + pierwszy);
        double drugi = Math.random();
        System.out.println("Wynik drugi to " + drugi);
        double trzeci = Math.random();
        System.out.println("Wynik trzeci to " + trzeci);
        double czwarty = Math.random();
        System.out.println("Wynik czwarty to " + czwarty);
        double piaty = Math.random();
        System.out.println("Wynik piaty to " + piaty);
        if (pierwszy > 0.2 && drugi > 0.2 && trzeci > 0.2)
            System.out.println("Pierwszy, drugi i trzeci los byly wieksze od 0.2");
        else
            System.out.println("Pierwszy, drugi i trzeci nie  byly wieksze od 0.2");
        if (czwarty > 0.2 && drugi > 0.2 && trzeci > 0.2)
            System.out.println("Drugi,trzeci i czwarty los byly wieksze od 0.2");
        else
            System.out.println("Drugi,trzeci i czwarty los nie  byly wieksze od 0.2");
        if (czwarty > 0.2 && piaty > 0.2 && trzeci > 0.2)
            System.out.println("Trzeci, czwarty i piaty los byly wieksze od 0.2");
        else
            System.out.println("Trzeci, czwarty i piaty los nie byly wieksze od 0.2");*/

        //Zadanie 9
        double wartosc = -3.8;

        boolean A = ((wartosc > - 15 && wartosc < - 10) ||
                (wartosc > -5 && wartosc < 0) ||
                (wartosc > 5 && wartosc < 10));
        boolean B = ((wartosc < -13) ||
                wartosc > -8 && wartosc < -3);
        boolean C = (wartosc > -4);

        if (A && B && C)
            System.out.println("wartosc nalezy do czesci wspolnej zbiorow A, B, C");
        else
            System.out.println("Wartosc nie nalezy");
    }
}
