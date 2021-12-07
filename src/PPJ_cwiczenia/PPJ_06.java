package PPJ_cwiczenia;

public class PPJ_06 {
    public static void main (String[] args)
    {
        //Zadanie pierwsze
        int maks = 0b1000_0000_0000_0000_0000_0000_0000_0000;
        System.out.println("Min int to " + maks);
        long maks2 = 0b0111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111L;
        System.out.println("Maks long to " + maks2);

        //Zadanie drugie wynik powinien byc 0

        //Zadanie trzecie
        double sqTwo = Math.sqrt(2);
        double wynik = sqTwo*sqTwo - 2.0;
        System.out.println(wynik);
        boolean czy0 = (wynik == 0);
        System.out.println(czy0);

        //Zadanie 4
        int z = 2 * ((5 + 3) * 4 - 8);
        System.out.println("MAMY ICH :D  " + z);

        //Zadanie5 -> zgodne, bo myslalem ze bedzie 16
        int y = 5;
        System.out.println((y=4)* y) ;

        //Zadnaie 6
        int a= 10 ,b= 5 ,c= 1 ,res;
        res=a - ++c - ++b;
        System.out.println("Wynik : "+res) ;
        boolean czy_rowne = (res==2);
        System.out.println(czy_rowne);

        // Zadanie 7
        java.util.Scanner in=new java.util.Scanner(System.in) ;
        /*int x=in.nextInt() ;
        System.out.println(x < 10 ? "x jest mniejsze od 10" :(x < 100 ? "x jest mniejsze od 100" :(x < 1000)?  "x jest mniejsze od 1000" :  "x nie jest mniejsze od 1000"));*/

        // Zadanie 8
       /* System.out.println("Podaj rok a program powie Ci czy jest to rok przestepny");
        int rok=in.nextInt() ;
        System.out.println((rok % 4 == 0 && rok % 100 != 0 ) || (rok % 400 == 0) ? "Rok " + rok + " jest przest\u0119pny" : "Rok " + rok + " nie jest przest\u0119pny" );*/

        //Zadanie 9
       /* System.out.println("Podaj temperature w stopniach Fahrenheita, a program Ci przedstawi w postaci stopni Celsjusza");
        double temperatura = in.nextDouble();
        double celsjusza = ((temperatura - 32) / 9)* 5;
        System.out.println("Ta temperatura w stopniach celsjusza to " + celsjusza);*/

        // analiza struktury warunek? coś gdy true : coś gdy false
        // instrukcja warunkowa jest instrukscja sterujaca
        boolean log1 = false;
        System.out.println(log1 ? "tak " : "nie " + "pada");
        int x = 121;
        System.out.println( x < 10 ? "opcja a" : (x < 100? "opcja b" : "opcja c"));

        int range = 26;
        //int grade = range < 20? 2 : (range < 25 ? 3 : 4 ); to jest to samo co:
        int grade;
        if (range < 20){
            grade = 2;
        }
        else{
            if (range < 25){
                grade = 3;
            }
            grade = 4;
            System.out.println("Udalo sie");
        }

        System.out.println(grade);

        int status = 7;
        switch (status){
            case 0:
                System.out.println("Status zwiekszony o 1");
                status += 1;
                break;
            case 1:
            case 2:
            case 3:
                System.out.println("grupa case dla 1 , 2 ,3");
                break;
            default:
                System.out.println("Sekcja default");
        }
        //od wersji java 12/13 -> 14 nie trzeba używać break i wystarczy dać strzałke
    }
}
