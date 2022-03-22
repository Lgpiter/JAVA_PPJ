package GUI_3;
import GUI_3.Zadanie1.Square;
import GUI_3.Zadanie1.TooBigSquareException;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Square[] tab = new Square[5];
        try{
            Square kwadrat1 = new Square(5);
            Square kwadrat2 = new Square(2);
            Square kwadrat3 = new Square(3);
            Square kwadrat4 = new Square(4);
            Square kwadrat5 = new Square(5);

            tab[0] = kwadrat1;
            tab[1] = kwadrat2;
            tab[2] = kwadrat3;
            tab[3] = kwadrat4;
            tab[4] = kwadrat5;

            for(int i = 0; i < tab.length; i++){
                System.out.println(tab[i].toString());
            }

            Arrays.sort(tab);

            for(int i = 0; i < tab.length; i++){
                System.out.println(tab[i].toString());
            }
        }catch (TooBigSquareException exp){
            exp.printStackTrace();
        }


    }
}
