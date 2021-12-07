package PPJ_cwiczenia;

public class PPJ_08 {
    public static void main(String[] args)
    {
        // java.util.Scanner scanner=new java.util.Scanner(System.in) ;
        //Zadanie 1
        //(!(a<b) && !( a > b)) = (a >= b && a <= b) = a = b
        //Zadanie 2
       /* java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Podaj rok a nastepnie miesiac, a program powie ile dany miesiac ma dni ");
        int rok = scanner.nextInt();
        int miesiac = scanner.nextInt();
        int dni;
        switch (miesiac){
            case 1,3, 5, 7,8 , 10 , 12 -> dni = 31;
            case 2 -> {
                if((rok % 4 == 0 && rok % 100 != 0) || rok % 400 == 0)
                    dni = 29;
                else
                    dni = 28;
            }
            case 4, 6, 9, 11 -> dni =30;
            default -> {
                dni = 0;
                System.out.println("Podales liczbe, ktora nie jest miesiacem");
            }
        }
        if (dni != 0)
            System.out.println("W roku " + rok + " w miesiacu " + miesiac + " jest " + dni + " dni");

*/
        //Zadanie 3
        /*
        System.out.println("Podaj znak ");
        char znak=scanner.next() .charAt(0);
        switch (znak){
            case 'a','A', 'e', 'E' , 'i', 'I', 'o' ,'O','U', 'u', 'y' , 'Y' ->
                    System.out.println("Znak jest samogloska");
            default -> System.out.println("Jest to spolgloska");
        }*/

        //Zadanie 4
        /*System.out.println("Podaj pierwsza zmienna rzeczywiste ");
        double pierwsza = scanner.nextDouble();
        System.out.println("Podaj druga zmienna rzeczywiste ");
        double druga = scanner.nextDouble();
        if (pierwsza > druga){
            if (pierwsza - druga < 0.001)
                System.out.println("Liczby te sa rowne do drugiego miejsca po przecinku");
            else
                System.out.println("Liczby nie sa rowne");
        }
        else {
            if (druga - pierwsza < 0.001)
                System.out.println("Liczby te sa rowne do drugiego miejsca po przecinku");
            else
                System.out.println("Liczby nie sa rowne");
        }*/

        //Zadanie 5
        /*System.out.println("Podaj pierwszy kat");
        int kat_1 = scanner.nextInt();
        System.out.println("Podaj drugi kat");
        int kat_2 = scanner.nextInt();
        System.out.println("Podaj trzeci kat");
        int kat_3 = scanner.nextInt();

        if (kat_1 + kat_2 + kat_3 == 180) {
            System.out.println("Taki trojkat istnieje");
            if(kat_1 < 90 && kat_2 < 90 && kat_3 < 90)
                System.out.println("Jest to trojkat ostrokatny");
            else
                System.out.println("Nie jest to trojkat ostrokatny");
        }
        else
            System.out.println("Nie ma takiego trojkata na plaszczyznie euklidesowej");*/

        //Zadanie 6
        /*System.out.println("Rownnanie kwadratowe jest w postaci a * x^2 + b * x + c");
        System.out.println("Podaj wspolczynnik a");
        double a = scanner.nextDouble();
        System.out.println("Podaj wspolczynnik b");
        double b = scanner.nextDouble();
        System.out.println("Podaj wspolczynnik c");
        double c = scanner.nextDouble();
        double x_1, x_2, delta;

        if(a == 0){
            if (b != 0) {
                x_1 = (-c) / b;
                System.out.println("Rownanie ma jedno rozwiazanie x_1 = " +x_1);
            }
            else{
                if (c == 0)
                    System.out.println("Ma nieskonczenie wiele rozwiazan");
                else
                    System.out.println("Nie ma rowzwiazan");
            }
        }
        else{
            delta = b*b - 4*a*c;
            if (delta > 0) {
                x_1 = (Math.sqrt(delta) - b) /(2*a);
                x_2 = (-Math.sqrt(delta) - b) /(2*a);
                System.out.println("Rownanie ma 2 rozwiazania x_1 = " + x_1 +  " oraz x_2 = " + x_2);
            }
            else if (delta == 0) {
                x_1 = x_2 = (-b)/(2*a);
                System.out.println("Rownanie ma jedno rozwazanie podwojne x_1 = x_2 = " + x_1);
            }
            else
                System.out.println("Brak rozwiazan");
        }*/

        //Zadanie 7
        /*System.out.println("Ile punktow bylo mozliwych do zdobycia");
        int punkty_max = scanner.nextInt();
        System.out.println("Ile punktow zdobyl uczen");
        double punkty_zdobyte = scanner.nextDouble();
        double wynik = (punkty_zdobyte/punkty_max ) * 100;
        double ocena;
        if (wynik >= 87.5 && wynik < 100)
            ocena = 5;
        else if(wynik >= 81.25)
            ocena = 4.5;
        else if(wynik >= 75)
            ocena = 4;
        else if (wynik >= 62.6)
            ocena =3.5;
        else if (wynik >= 50)
            ocena = 3;
        else
            ocena = 2;

        System.out.println("Masz " + punkty_zdobyte + " pkt na " + punkty_max +
                " mozliwych otrzymujesz ocene " + ocena);*/

        int test = 52;

        System.out.println(test <= 10? "Mniejsze badz rowne 10":
                (test <= 30 ? "Mniejsze badz rowne 30" :
                        (test <= 50 ? "Mniejsze badz rowne  50" : "Wieksze od 50")
                ));
    }
}
