package dodatkowe;
import java.util.Scanner;
public class Z02 {
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
    public static void main(String[] args)
    {
        //Zadanie 1
        /*double wynik;
        int zakoncz = 0;
        while(zakoncz != 1) {
            System.out.println("Podaj pierwsza liczbe ");
            double pierwsza = in.nextDouble();
            System.out.println("Podaj druga liczbe ");
            double druga = in.nextDouble();
            System.out.println("Wpisz operator matematyczny ktory chcesz uzyc np. + lub - lub * lub /");
            String operacja = in.next();
            System.out.print("Wynik to: ");
            if (operacja.equals("+")) {
                wynik = pierwsza + druga;
                System.out.println(wynik);
            }
            else if (operacja.equals("-")) {
                wynik = pierwsza - druga;
                System.out.println(wynik);
            }
            else if (operacja.equals("*")) {
                wynik = pierwsza * druga;
                System.out.println(wynik);
            }
            else if (operacja.equals("/")) {
                if (druga == 0)
                    System.out.println("Nie dzielimy przez 0");
                else {
                    wynik = pierwsza / druga;
                    System.out.println(wynik);
                }

            }
            System.out.println("Jesli chcesz zakonczyc wpisz 1");
            zakoncz = in.nextInt();
        }*/

        //Zadanie 2
        /*System.out.println("Podaj liczbe pierwsza ");
        int first = in.nextInt();
        System.out.println("Podaj druga liczbe ");
        int second = in.nextInt();
        System.out.println("Podaj trzecia liczbe ");
        int third = in.nextInt();
        System.out.println("Mediana tych trzech liczb to " + Mediana(first,second,third));*/

        //Zadanie 3
        /*System.out.println("Podaj pierwsza liczbe ");
        int a = in.nextInt();
        System.out.println("Podaj druga liczbe ");
        int b = in.nextInt();
        System.out.println("Podaj trzecia liczbe");
        int c = in.nextInt();
        int pomocnicza;
        System.out.println("Twoje liczby to " + a + " " + b + " " + c);
        if (Mediana(a,b,c) == a){
            pomocnicza = b;
            b = a;
            a = pomocnicza;
            if(a > c){
                pomocnicza = c;
                c = a;
                a = pomocnicza;
            }
        }
        else if(Mediana(a,b,c) == b){
            if(a > c){
                pomocnicza = c;
                c = a;
                a = pomocnicza;
            }
        }
        else{
            pomocnicza = b;
            b = c;
            c = pomocnicza;

            if(a > c){
                pomocnicza = c;
                c = a;
                a = pomocnicza;
            }
        }
        System.out.println("Twoje liczby posortowane to " + a + " " + b + " " + c);
        */
        //Zadanie 4
        /*System.out.println("Podaj pierwsza liczbe ");
        int a = in.nextInt();
        System.out.println("Podaj druga liczbe ");
        int b = in.nextInt();
        System.out.println("Podaj trzecia liczbe");
        int c = in.nextInt();
        if(a == b && b != c)
            System.out.println("OK");
        else if(b == c && c != a)
            System.out.println("OK");
        else if(c == a && b!= a)
            System.out.println("OK");
        else
            System.out.println("NOT OK");*/
        //Zadanie 5
        /*System.out.println("Podaj pierwsza liczbe ");
        int a = in.nextInt();
        System.out.println("Podaj druga liczbe ");
        int b = in.nextInt();
        System.out.println("Podaj trzecia liczbe");
        int c = in.nextInt();
        if (a + b > c && a + c > b && b + c > a)
            System.out.println("OK");
        else
            System.out.println("NOT OK");*/
        //Zadanie 6
        /*System.out.println("Podaj pierwsza wartosc logiczna czyli wpisz true or false");
        boolean a = in.nextBoolean();
        System.out.println("Podaj druga wartosc logiczna czyli wpisz true or false");
        boolean b = in.nextBoolean();
        System.out.println("Podaj trzecia wartosc logiczna czyli wpisz true or false");
        boolean c = in.nextBoolean();
        boolean allThree = (a && b && c);
        boolean exactlyOne = (a && !b && !c ||
                !a && b && !c ||
                !a && !b && c);
        boolean exactlyTwo = (a && b && !c ||
                !a && b && c ||
                a && !b && c);
        boolean atLeastOne = (a || b || c);
        boolean atLeastTwo = ((a && b) || (a && c) || (b&&c));
        System.out.println("a, b, c = " + a + ", " + b +
                ", " + c + "\nallThree:   " + allThree
                +"\nexactlyOne: " + exactlyOne
                +"\nexactlyTwo: " + exactlyTwo
                +"\natLeastOne: " + atLeastOne
                +"\natLeastTwo: " + atLeastTwo);*/
        //Zadanie 7
        Scanner in = new Scanner(System.in);
        int a1 = 2;
        int a2 = 4;
        int b1 = 1;
        int b2 = 6;
        System.out.println("Podaj liczbe x ");
        int x = in.nextInt();
        boolean inA = (x > a1 && x < a2 );
        boolean inB = (x > b1 && x < b2);
        boolean inAminusB = (inA && !inB);
        boolean inBminusA = (inB && !inA);
        boolean inAandB = (inA && inB);
        boolean inAorB = (inA || inB);
        boolean inRoznicaSymetryczna = (inAminusB || inBminusA);
        System.out.println("Interval A = [" + a1 + ", " + a2 + "]");
        System.out.println("Interval B = [" + b1 + ", " + b2 + "]");
        System.out.println("x in A: " + inA +
                "\nx in B: " + inB +
                "\nx in A - B " + inAminusB +
                "\nx in B - A " + inBminusA +
                "\nx in intersection of A and B: " + inAandB +
                "\nx in union A and B" + inAorB +
                "\nx in symm. diff. of A and B: " + inRoznicaSymetryczna);
    }
}
