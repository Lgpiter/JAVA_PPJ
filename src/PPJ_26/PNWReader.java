package PPJ_26;

import java.io.IOException;
import java.io.InputStream;

public class PNWReader {
    static final int pierwsze = 1;
    static final int narcystyczne = 2;
    static final int wyrazy = 3;
    public int wybor;
    public InputStream wejscie;
    public int licznik = 0;

    public PNWReader(int wybor, InputStream wejscie) throws IllegalArgumentException{
        this.wejscie = wejscie;
            if(wybor == 1 || wybor == 2 || wybor == 3)
                this.wybor = wybor;
            else
                throw new IllegalArgumentException();

    }

    public void show() throws IllegalStateException{
        if(licznik == 0){
            if(wybor == 1 || wybor == 2)
               czytaj_liczbe(wybor);
            if(wybor == 3)
                czytaj_wyrazy();
            licznik++;
        }
        else
            throw new IllegalStateException();


    }

    //na czytanie liczb juz dziala
    public int czytaj_liczbe(int wybor) {
        int suma = 0, koniec = 0,czytana, licznik = 0;
        int[] tab_pom = new int[32];

        for (int i = 0; i < tab_pom.length; i++) {
            tab_pom[i] = -2;
        }

        try {
            while (koniec != 1) {
                if ((czytana = wejscie.read()) == -1) {
                    koniec = 1;
                    if(wybor == 1) {
                        if (suma(tab_pom) != 0 && czy_pierwsza(suma(tab_pom)))
                            System.out.println(suma(tab_pom));
                    }
                    if (wybor == 2){
                        if(suma(tab_pom) != 0 && czy_narcystyczna(suma(tab_pom)))
                            System.out.println(suma(tab_pom));
                    }
                    return suma(tab_pom);
                }
                if (czytana == ' ' && suma(tab_pom) != 0){
                    if(wybor == 1) {
                        if (czy_pierwsza(suma(tab_pom)))
                            System.out.println( suma(tab_pom));
                    }
                    if(wybor == 2){
                        if (czy_narcystyczna(suma(tab_pom)))
                            System.out.println(suma(tab_pom));
                    }
                    licznik = 0;
                    for (int i = 0; i < tab_pom.length; i++)
                        tab_pom[i] = -2;
                }
                else{
                    if(czytana >= '0' && czytana <= '9') {
                        tab_pom[licznik++] = czytana - '0';
                    }
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return 0;
    }

    public static int suma(int[] tab){
        int dlugosc = 0;
        int suma = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i] != -2)
                dlugosc++;
        }

        for (int i = 0; i < tab.length; i++){
            if(tab[i] != -2){
                suma += tab[i] * Math.pow(10, dlugosc - 1);
                dlugosc--;
            }
        }
        return suma;
    }

    public boolean czy_pierwsza(int a){
        if (a == 1)
            return false;

        int pom = 2;
        while(pom <= a/2){
            if (a % pom == 0) {
                return false;
            }
            pom++;
        }

        return true;
    }

    public boolean czy_narcystyczna(int a){
        int dlugosc = 0;
        int suma = 0;
        int poczatkowa = a;
        int poczatkowa2 = a;
        while (a  > 0){
            a /= 10;
            dlugosc++;
        }

        int[] tab = new int[dlugosc];
        int pom = 1;
        while(poczatkowa > 0){
            tab[tab.length - pom] = poczatkowa % 10;
            pom++;
            poczatkowa /= 10;
        }

        for(int i = 0; i < tab.length; i++){
            suma += Math.pow(tab[i],dlugosc);
        }

        if(suma == poczatkowa2)
            return true;
        else
            return false;
    }

    public void czytaj_wyrazy(){
        int czytana, koniec = 0, pom = 0;
        char[] wyraz = new char[81];
        try {
            while(koniec != 1){
                if((czytana = wejscie.read()) == -1) {
                    koniec = 1;
                    if((wyraz[0] > 'a' && wyraz[0] < 'z') || (wyraz[0] > 'A' && wyraz[0] < 'Z')) {
                        for (int i = 0; i < wyraz.length; i++) {
                            if (wyraz[i] != 0)
                                System.out.print(wyraz[i]);
                        }
                        System.out.println();
                    }
                }
                if(czytana  == ' '){
                    if((wyraz[0] > 'a' && wyraz[0] < 'z') || (wyraz[0] > 'A' && wyraz[0] < 'Z')) {
                        for (int i = 0; i < wyraz.length; i++) {
                            if (wyraz[i] != 0)
                                System.out.print(wyraz[i]);
                        }
                        System.out.println();
                    }

                    for(int i = 0; i < wyraz.length; i++){
                        wyraz[i] = 0;
                    }
                    pom = 0;
                }
                else {
                    wyraz[pom++] = (char) czytana;
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
