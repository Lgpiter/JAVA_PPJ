package PPJ_22.Zadanie1;

import PPJ_22.Zadanie1.Prostokat;

public class Prostopadloscian
    extends Prostokat {
        private int h;

        public Prostopadloscian(int bok_a, int bok_b, int h){
               super(bok_a, bok_b);
               this.h = h;
        }

        public void showProstopadloscian(){
            int pole =  2*getBok_a()*getBok_b() + 2*getBok_a()*h + 2*getBok_b()*h;
            System.out.println("Pole prostopadloscianu jest rowne " + pole);
            int objetosc = getBok_a()*getBok_b()*h;
            System.out.println("Objetosc prostopadloscianu jest rowne " + objetosc);
        }

}

