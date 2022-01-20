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
        MojSkaner skaner = new MojSkaner(wejscie);
        if(licznik == 0){
            try {
                int a;
                while ((a = wejscie.read()) != ' ') {
                    System.out.println(skaner.odczytajLiczbeCalkowita());
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        else
            throw new IllegalStateException();
    }
}
