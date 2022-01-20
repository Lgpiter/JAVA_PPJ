package PPJ_26;

import java.io.IOException;
import java.io.InputStream;

public class MojSkaner {
    public InputStream wejscie;

    public MojSkaner (InputStream wejscie){
        this.wejscie = wejscie;
    }

    public String odczytajslowo() throws IOException {
        char[] tab = new char[50];
        int pom = 0;
        int a = wejscie.read();
        while (a != 10 && a != 9 && a != 32){
            tab[pom] = (char)a;
            pom++;
            a = wejscie.read();
        }

        int dlugosc_wynikowa = 0;

        for(int i = 0; i < tab.length; i++){
            if(tab[i] != 0)
                dlugosc_wynikowa++;
        }

        char[] tab_wynikowa = new char[dlugosc_wynikowa];

        for(int i = 0; i < dlugosc_wynikowa; i++){
            tab_wynikowa[i] = tab[i];
        }

        String wynikowy = new String(tab_wynikowa);

        return wynikowy;

    }

    public String odczytajLinie()throws IOException{
        char[] tab = new char[50];
        int pom = 0;
        int a = wejscie.read();
        while (a != 10){
            tab[pom] = (char)a;
            pom++;
            a = wejscie.read();
        }

        int dlugosc_wynikowa = 0;

        for(int i = 0; i < tab.length; i++){
            if(tab[i] != 0)
                dlugosc_wynikowa++;
        }

        char[] tab_wynikowa = new char[dlugosc_wynikowa];

        for(int i = 0; i < dlugosc_wynikowa; i++){
            tab_wynikowa[i] = tab[i];
        }

        String wynikowy = new String(tab_wynikowa);

        return wynikowy;
    }

    public int odczytajLiczbeCalkowita(){
        int suma = 0;
        try {
            int a = wejscie.read();
            int[] tab = new int[32];

            for(int i = 0; i < tab.length; i++){
                tab[i] = -1;
            }

            int pom = 0;
            while(a != 10){
                tab[pom++] = a - '0';
                System.out.println("Dodalem do tablicy " + (a - '0'));
                a = wejscie.read();
            }

            int dlugosc_liczby = 0;
            for(int i = 0; i < tab.length; i++){
                if(tab[i] != -1)
                    dlugosc_liczby++;
            }

            for(int i = 0; i < tab.length; i++){
                if(tab[i] != -1){
                    suma += tab[i] *((int)Math.pow(10,dlugosc_liczby - 1));
                    dlugosc_liczby--;
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        return suma;
    }

    public int odczytajDodatniaLiczbeCalkowita() throws BladLiczbowy{
            int a = odczytajLiczbeCalkowita();
            if(a > 0)
                return a;
            else
                throw new BladLiczbowy();
    }

}
