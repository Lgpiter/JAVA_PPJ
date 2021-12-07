package dodatkowe;

public class Z01 {
    public static void main(String[] args){
        //Zadanie 1 -> biorę sobie liczbę 347
        System.out.println(347);
        System.out.println(0b101011011);
        System.out.println(0533);
        System.out.println(0x15B);
        //Kolejna proba wezme sobie liczbe 523
        System.out.println("Tutaj testujemy liczbe 523 i moja umiejetnosc zamiany systemow liczbowych xD");
        System.out.println(523);
        System.out.println(0b1000_00_1011);
        System.out.println(01013);
        System.out.println(0x20B);

        //Zadanie 2
        System.out.println('A');
        System.out.println('A' + 0);

        //Zadanie 3
        System.out.println('!' + '!');
        System.out.println((char)('!' + '!'));

        //Zadanie 4
        System.out.println('\u017B' + '\u00F3' + '\u0142' + '\u0107');

        //Zadanie 5
        boolean prawda = true;
        boolean falsz = false;
        boolean a_1 = (prawda && falsz),
                a_2 = (prawda || falsz),
                a_3 = prawda ^ falsz;

        System.out.println("Operator && przy true and false daje " + a_1);
        System.out.println("Operator || przy true and false daje " + a_2);
        System.out.println("Operator ^ przy true and false daje " + a_3);

        //Zadanie 6
        int a = 3;
        int b = 7;
        System.out.println(a < b);
        System.out.println(a >=b);

        //Zadanie 7
        System.out.println("Tutaj wyjdzie nam 1 : " + 4/3);
        System.out.println("Tutaj wyjdzie prawidlowy wynik : " + 4./3);

        //Zadanie 8
        short c = 5;
        short d = 6;
        short e = (short)(c + d);
        System.out.println("wynik to " + e);

        //Zadanie 9
        long f = 1_500_000_000;
        int g = 1_500_000_000;
        long suma = f + g;
        System.out.println(suma);

        //Zadanie 10
        int najwieszka_w_10 = 99999;
        int najmniejsza_w_10 = 10000;
        System.out.println(0);
        System.out.println(0);
        System.out.println(0);
        System.out.println(0);
        System.out.println(3);
        System.out.println(najmniejsza_w_10+najwieszka_w_10);

        //Zadanie 11
        int najmniejsza_w_2 = 0b10000;
        int najwieksza_w_2 = 0b11111;
        System.out.println(najmniejsza_w_2);
        System.out.println(najwieksza_w_2 + najmniejsza_w_2);

        //Zadanie 12
        int najmniejsza_w_8 = 01000;
        int najwieksza_w_8 = 07777;
        System.out.println(najmniejsza_w_8);
        System.out.println(najwieksza_w_8);
        System.out.println(najmniejsza_w_8 + najwieksza_w_8);

        //Zadanie 13
        int najmniejsza_w_16 = 0x100;
        int najwieksza_w_16 = 0xFFF;
        System.out.println("Najmniejsza w 16 " + najmniejsza_w_16);
        System.out.println("Najwieksza w 16 " +  najwieksza_w_16);
        System.out.println(najmniejsza_w_16 + najwieksza_w_16);


    }
}
