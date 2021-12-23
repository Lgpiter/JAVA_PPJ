package PPJ_23.Zadanie1;

import PPJ_23.Zadanie1.Drzewo;
import PPJ_23.Zadanie1.Owoc;

public class Main {
    public static void main(String[] args) {
        double masa_owocow = 0;
        Owoc[] tab = new Owoc[100];
        int licznik_owocow = 0;
        int licznik_jablek = 0;
        int licznik_gruszek = 0;
        int licznik_pomaranczy = 0;

        while(masa_owocow < 5000){
            Drzewo tmp = new Drzewo();
            tab[licznik_owocow] =  tmp.zerwijOwoc();
            masa_owocow += tmp.zerwijOwoc().getMasa();
            licznik_owocow++;
        }

        for(int i = 0; i < tab.length; i++){
            if(tab[i] != null) {
                if (tab[i].getNazwa().equals("jablko"))
                    licznik_jablek++;
                if (tab[i].getNazwa().equals("pomarancza"))
                    licznik_pomaranczy++;
                if (tab[i].getNazwa().equals("gruszka"))
                    licznik_gruszek++;
            }
        }

        System.out.println("Potrzebne było:" +
                "\nGruszek: " + licznik_gruszek +
                "\nJablek: " + licznik_jablek +
                "\nPomaranczy: " + licznik_pomaranczy
        );


    }
}
