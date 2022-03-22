package PPJ_28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        Zadanie2();
    }

    public static void Zadanie1(){
        String str = "A.B.C.D.";
        Pattern pattern = Pattern.compile("[a-zA-Z]\\.[a-zA-Z]\\.[a-zA-Z]\\.[a-zA-Z]\\.");
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.matches());
    }

    public static void Zadanie2(){
        try {
            FileInputStream wejscie = new FileInputStream("Z:\\JAVA_TEST\\src\\PPJ_28\\Wejscie");
            FileOutputStream wyjsce = new FileOutputStream("Z:\\\\JAVA_TEST\\\\src\\\\PPJ_28\\Wynikowy.txt");
            int val, licznik = 0;
            int liczba = 0;
            while ((val = wejscie.read()) != -1){
                if(val == '1')
                    liczba = liczba | 1;
                if(licznik != 30)
                    liczba = liczba << 1;
                licznik++;
            }
            System.out.println(Integer.toBinaryString(liczba));
            System.out.println(liczba);

            for(int i = 0; i < 4; i++){
                wyjsce.write(liczba >> i*8);
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void Zadanie3(){

    }
}

